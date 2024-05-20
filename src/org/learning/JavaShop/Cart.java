package org.learning.JavaShop;

import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Quanti prodotti vuoi aggiungere nel carrello? ");
        int productNumber= Integer.parseInt(scanner.nextLine());
        Product[] cart= new Product[productNumber];
        for (int i = 0; i < cart.length; i++) {
            int choice;
            do {
                System.out.print("Che prodotto vuoi aggiungere? 1 per Smartphone, 2 per Televisore, 3 per Cuffie ");
                choice = Integer.parseInt(scanner.nextLine());

                System.out.print("Inserisci il nome del prodotto: ");
                String name= scanner.nextLine();

                System.out.print("Inserisci la descrizione del prodotto: ");
                String description= scanner.nextLine();

                System.out.print("Inserisci il prezzo del prodotto: ");
                double price= Double.parseDouble(scanner.nextLine());

                System.out.print("Inserisci l'IVA del prodotto: ");
                int iva= Integer.parseInt(scanner.nextLine());

                switch (choice){
                    case 1:     // Smartphone

                        System.out.print("Inserisci la memoria del prodotto: ");
                        int memory= Integer.parseInt(scanner.nextLine());

                        cart[i] = new Smartphone(name,description,price,iva,memory);

                        break;

                    case 2: // TV

                        System.out.print("Inserisci la dimensione dello schermo: ");
                        int size= Integer.parseInt(scanner.nextLine());

                        System.out.print("E' una smart TV? ");
                        String smart;
                        do {
                            smart= scanner.nextLine().trim();
                            if ((!smart.toLowerCase().equals("si") && !smart.toLowerCase().equals("no"))){
                                System.out.println("Scelta non valida. Scrivi si o no");
                            }
                        }while (!smart.toLowerCase().equals("si") && !smart.toLowerCase().equals("no"));
                        boolean isSmart= smart.toLowerCase().equals("si")? true : false;
                        cart[i] = new Tv(name,description,price,iva,size, isSmart);

                        break;

                    case 3: // Cuffie

                        System.out.print("Inserisci il colore: ");
                        String color= scanner.nextLine();

                        System.out.print("Sono cuffie wireless? ");
                        String wireless;
                        do {
                            wireless= scanner.nextLine().trim();
                            if ((!wireless.toLowerCase().equals("si") && !wireless.toLowerCase().equals("no"))){
                                System.out.println("Scelta non valida. Scrivi si o no");
                            }
                        }while (!wireless.toLowerCase().equals("si") && !wireless.toLowerCase().equals("no"));
                        boolean isWireless= wireless.toLowerCase().equals("si")? true : false;
                        cart[i] = new HeadPhones(name,description,price,iva,color, isWireless);

                        break;

                    default:
                        break;

                }
            } while (choice != 1 && choice != 2 && choice != 3);
        }

        for (int i = 0; i < cart.length; i++) {
            System.out.println(cart[i]);
        }
    }
}
