package org.learning.JavaShop;

public class JavaShop {
    public static void main(String[] args) {
    Product product1= new Product("ombrello", "ombrello grande di colore nero", 18, 10);
        System.out.println("Codice prodotto: " + product1.getCode());
        System.out.println("Nome prodotto: " + product1.getName());
        System.out.println("Descrizione prodotto: " + product1.getDescription());
        System.out.println("Prezzo prodotto: " + product1.getPrice());
        System.out.println("Iva prodotto: " + product1.getIva());
        System.out.println("Prezzo comprensivo di Iva: " + product1.getPriceIncludingVat());
        System.out.println("Nome esteso: " + product1.getExtendedName());

        Smartphone smartphone= new Smartphone("Iphone", "Iphone 14 pro max", 1200, 20, 512);
        System.out.println();
        System.out.println("Codice prodotto: " + smartphone.getCode());
        System.out.println("Nome prodotto: " + smartphone.getName());
        System.out.println("Descrizione prodotto: " + smartphone.getDescription());
        System.out.println("Prezzo prodotto: " + smartphone.getPrice());
        System.out.println("Iva prodotto: " + smartphone.getIva());
        System.out.println("Prezzo comprensivo di Iva: " + smartphone.getPriceIncludingVat());
        System.out.println("Nome esteso: " + smartphone.getExtendedName());
        System.out.println("IMEI: " + smartphone.getImeiCode());
        System.out.println("Memoria: " + smartphone.getMemory());


    }
}
