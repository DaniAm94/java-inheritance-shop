package org.learning.JavaShop;

public class HeadPhones extends Product{
 private String color;
 private boolean wireless;

    public HeadPhones(String name, String description, int price, int iva, String color, boolean wireless){
        super(name, description, price, iva);
        setColor(color);
        setWireless(wireless);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String isWireless() {
        return wireless ? "Si" : "No";
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }
}
