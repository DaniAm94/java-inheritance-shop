package org.learning.JavaShop;

import java.util.Random;

public class Product {

    private int code;
    private String name;
    private String description;
    private double price;
    private  double iva;

    public Product(String name, String description, double price, double iva) {
        Random randomGenerator= new Random();
        this.code = randomGenerator.nextInt(100);
        setName(name);
        setDescription(description);
        setPrice(price);
        setIva(iva);
    }

    public String getCode() {
        return String.format("%06d", code);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price + "€";
    }

    public void setPrice(double price) {
        this.price = price > 0 ? price : 1;
    }

    public String getIva() {
        return iva + "%";
    }

    public void setIva(double iva) {
        this.iva = iva > 0 ? iva : 1;
    }

    public String getPriceIncludingVat(){
        return price + price * iva / 100 +"€";
    }

    public String getExtendedName(){
        return String.format("%06d", code) + "-" + name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", iva=" + iva +
                '}';
    }
}
