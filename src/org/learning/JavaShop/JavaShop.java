package org.learning.JavaShop;

public class JavaShop {
    public static void main(String[] args) {
    Product product1= new Product("ombrello", "ombrello grande di colore nero", 18, 10);
        System.out.println(product1);
        System.out.println("Codice prodotto: " + product1.getCode());
        System.out.println("Nome prodotto: " + product1.getName());
        System.out.println("Descrizione prodotto: " + product1.getDescription());
        System.out.println("Prezzo prodotto: " + product1.getPrice());
        System.out.println("Iva prodotto: " + product1.getIva());
        System.out.println("Prezzo comprensivo di Iva: " + product1.getPriceIncludingVat());
        System.out.println("Nome esteso: " + product1.getExtendedName());
    }
}
