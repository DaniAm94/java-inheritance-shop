package org.learning.JavaShop;

public class HeadPhones extends Product{
 private String color;
 private boolean wireless;

    public HeadPhones(String name, String description, double price, int iva, String color, boolean wireless){
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

    @Override
    public String toString() {
        return "HeadPhones{" +
                "code=" + getCode() +
                ", name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", price=" + getPrice() +
                ", iva=" + getIva() +
                ", color='" + getColor() + '\'' +
                ", wireless=" + isWireless() +
                ", extended name='" + getExtendedName() + '\'' +
                ", price including iva=" + getPriceIncludingVat() +
                '}';
    }
}
