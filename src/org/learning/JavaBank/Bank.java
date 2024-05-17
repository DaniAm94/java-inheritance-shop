package org.learning.JavaBank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Inserisci il tuo nome completo: ");
        String fullName= scanner.nextLine();
        Account userAccount= new Account(fullName);
        int option;
        do {
                System.out.println("Codice conto: " + userAccount.getCode());
                System.out.println("Intestato a: " + userAccount.getName());
                System.out.println("Saldo disponibile: " + userAccount.getBalance());
                System.out.println("Cosa vuoi fare? premi 1 per prelevare, 2 per depositare, 3 per uscire");
                option= Integer.parseInt(scanner.nextLine());
                if (option != 1 && option != 2 && option != 3){
                    System.out.println("Opzione non valida, si prega di riprovare.");
                }else {
                    switch (option){
                        case 1:
                            System.out.print("Quanto desideri prelevare? ");
                            double withdrayAmount= Double.parseDouble(scanner.nextLine());
                            System.out.println(userAccount.withdraw(withdrayAmount));
                            break;
                        case 2:
                            System.out.print("Quanto desideri depositare? ");
                            double depositAmount= Double.parseDouble(scanner.nextLine());
                            System.out.println(userAccount.deposit(depositAmount));
                            break;
                        case 3:
                            break;
                    }
                }
            }while (option != 3);

    }
}
