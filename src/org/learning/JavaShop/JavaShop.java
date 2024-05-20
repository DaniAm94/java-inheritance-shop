package org.learning.JavaShop;

public class JavaShop {
    public static void main(String[] args) {
    Product product1= new Product("ombrello", "ombrello grande di colore nero", 18, 10, false);
        System.out.println("Codice prodotto: " + product1.getCode());
        System.out.println("Nome prodotto: " + product1.getName());
        System.out.println("Descrizione prodotto: " + product1.getDescription());
        System.out.println("Prezzo prodotto: " + product1.getPrice());
        System.out.println("Iva prodotto: " + product1.getIva());
        System.out.println("Prezzo comprensivo di Iva: " + product1.getPriceIncludingVat());
        System.out.println("Nome esteso: " + product1.getExtendedName());
        System.out.println("Prezzo scontato: " + product1.getDiscountedPrice());

        Smartphone smartphone= new Smartphone("Iphone", "Iphone 14 pro max", 1200, 20, 512, true);
        System.out.println();
        System.out.println("Codice prodotto: " + smartphone.getCode());
        System.out.println("Nome prodotto: " + smartphone.getName());
        System.out.println("Descrizione prodotto: " + smartphone.getDescription());
        System.out.println("Prezzo prodotto: " + smartphone.getPrice());
        System.out.println("Iva prodotto: " + smartphone.getIva());
        System.out.println("Prezzo comprensivo di Iva: " + smartphone.getPriceIncludingVat());
        System.out.println("Nome esteso: " + smartphone.getExtendedName());
        System.out.println("Prezzo scontato: " + smartphone.getDiscountedPrice());
        System.out.println("IMEI: " + smartphone.getImeiCode());
        System.out.println("Memoria: " + smartphone.getMemory());

        Tv tv1= new Tv("Philips", "Philips 5500 series LED 24PHS5537 TV LED", 159, 10, 24,false, true);
        System.out.println();
        System.out.println("Codice prodotto: " + tv1.getCode());
        System.out.println("Nome prodotto: " + tv1.getName());
        System.out.println("Descrizione prodotto: " + tv1.getDescription());
        System.out.println("Prezzo prodotto: " + tv1.getPrice());
        System.out.println("Iva prodotto: " + tv1.getIva());
        System.out.println("Prezzo comprensivo di Iva: " + tv1.getPriceIncludingVat());
        System.out.println("Nome esteso: " + tv1.getExtendedName());
        System.out.println("Prezzo scontato: " + tv1.getDiscountedPrice());
        System.out.println("Dimensioni schermo: " + tv1.getScreenSize());
        System.out.println("Smart: " + tv1.isSmart());

        Tv tv2= new Tv("Samsung Crystal", "Samsung Crystal UHD UE50CU7170UXZT, Smart TV 50\" Serie CU7000, Crystal UHD 4K, BLACK , 2023, DVB-T2", 599, 20, 50,true, false);
        System.out.println();
        System.out.println("Codice prodotto: " + tv2.getCode());
        System.out.println("Nome prodotto: " + tv2.getName());
        System.out.println("Descrizione prodotto: " + tv2.getDescription());
        System.out.println("Prezzo prodotto: " + tv2.getPrice());
        System.out.println("Iva prodotto: " + tv2.getIva());
        System.out.println("Prezzo comprensivo di Iva: " + tv2.getPriceIncludingVat());
        System.out.println("Nome esteso: " + tv2.getExtendedName());
        System.out.println("Prezzo scontato: " + tv2.getDiscountedPrice(

        ));
        System.out.println("Dimensioni schermo: " + tv2.getScreenSize());
        System.out.println("Smart: " + tv2.isSmart());

        HeadPhones headPhones1= new HeadPhones("Panasonic RP-HT161", "Panasonic RP-HT161 Cuffie Cablato A Padiglione MUSICA Nero", 19.99,20, "black", false, false);
        System.out.println();
        System.out.println("Codice prodotto: " + headPhones1.getCode());
        System.out.println("Nome prodotto: " + headPhones1.getName());
        System.out.println("Descrizione prodotto: " + headPhones1.getDescription());
        System.out.println("Prezzo prodotto: " + headPhones1.getPrice());
        System.out.println("Iva prodotto: " + headPhones1.getIva());
        System.out.println("Prezzo comprensivo di Iva: " + headPhones1.getPriceIncludingVat());
        System.out.println("Nome esteso: " + headPhones1.getExtendedName());
        System.out.println("Prezzo scontato: " + headPhones1.getDiscountedPrice());
        System.out.println("Colore: " + headPhones1.getColor());
        System.out.println("Wireless: " + headPhones1.isWireless());

        HeadPhones headPhones2= new HeadPhones("Sony WH-CH720N", "Sony WH-CH720N Cuffie Bluetooth wireless con cancellazione del rumore - Durata della batteria fino a 35 ore e ricarica rapida - Bianco", 69,20, "white", true, true);
        System.out.println();
        System.out.println("Codice prodotto: " + headPhones2.getCode());
        System.out.println("Nome prodotto: " + headPhones2.getName());
        System.out.println("Descrizione prodotto: " + headPhones2.getDescription());
        System.out.println("Prezzo prodotto: " + headPhones2.getPrice());
        System.out.println("Iva prodotto: " + headPhones2.getIva());
        System.out.println("Prezzo comprensivo di Iva: " + headPhones2.getPriceIncludingVat());
        System.out.println("Nome esteso: " + headPhones2.getExtendedName());
        System.out.println("Prezzo scontato: " + headPhones2.getDiscountedPrice());
        System.out.println("Colore: " + headPhones2.getColor());
        System.out.println("Wireless: " + headPhones2.isWireless());
    }
}
