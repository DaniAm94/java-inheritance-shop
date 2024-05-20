package org.learning.JavaShop;

import java.math.BigDecimal;

public class HeadPhones extends Product{
 private String color;
 private boolean wireless;

    public HeadPhones(String name, String description, double price, int iva, String color, boolean wireless, boolean hasLoyaltyCard){
        super(name, description, price, iva, hasLoyaltyCard);
        setColor(color);
        setWireless(wireless);
        setPriceIncludingVat();
        setDiscountedPrice(hasLoyaltyCard);
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
    public void setDiscountedPrice(boolean hasLoyaltyCard) {
        if(!this.wireless && hasLoyaltyCard){
            this.discountedPrice = priceIncludingVat.subtract(priceIncludingVat.multiply(BigDecimal.valueOf((double) 7/100)));
        }else{
            super.setDiscountedPrice(hasLoyaltyCard);
        }
    }

    @Override
    public String toString() {
        return "HeadPhones{" +
                "code=" + getCode() +
                ", name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", color='" + getColor() + '\'' +
                ", wireless=" + isWireless() +
                ", price=" + getPrice() +
                ", iva=" + getIva() +
                ", priceIncludingVat=" + getPriceIncludingVat() +
                ", discountedPrice=" + getDiscountedPrice() +
                '}';
    }
}
