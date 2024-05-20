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

        Tv tv1= new Tv("Philips", "Philips 5500 series LED 24PHS5537 TV LED", 159, 10, 24,false);
        System.out.println();
        System.out.println("Codice prodotto: " + tv1.getCode());
        System.out.println("Nome prodotto: " + tv1.getName());
        System.out.println("Descrizione prodotto: " + tv1.getDescription());
        System.out.println("Prezzo prodotto: " + tv1.getPrice());
        System.out.println("Iva prodotto: " + tv1.getIva());
        System.out.println("Prezzo comprensivo di Iva: " + tv1.getPriceIncludingVat());
        System.out.println("Nome esteso: " + tv1.getExtendedName());
        System.out.println("Dimensioni schermo: " + tv1.getScreenSize());
        System.out.println("Smart: " + tv1.isSmart());

        Tv tv2= new Tv("Samsung Crystal", "Samsung Crystal UHD UE50CU7170UXZT, Smart TV 50\" Serie CU7000, Crystal UHD 4K, BLACK , 2023, DVB-T2", 599, 20, 50,true);
        System.out.println();
        System.out.println("Codice prodotto: " + tv2.getCode());
        System.out.println("Nome prodotto: " + tv2.getName());
        System.out.println("Descrizione prodotto: " + tv2.getDescription());
        System.out.println("Prezzo prodotto: " + tv2.getPrice());
        System.out.println("Iva prodotto: " + tv2.getIva());
        System.out.println("Prezzo comprensivo di Iva: " + tv2.getPriceIncludingVat());
        System.out.println("Nome esteso: " + tv2.getExtendedName());
        System.out.println("Dimensioni schermo: " + tv2.getScreenSize());
        System.out.println("Smart: " + tv2.isSmart());
    }
}
