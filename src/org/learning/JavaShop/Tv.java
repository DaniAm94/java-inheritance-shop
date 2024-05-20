package org.learning.JavaShop;

import java.math.BigDecimal;

public class Tv extends Product{
    private int screenSize;
    private boolean smart;

    public Tv(String name, String description, double price, int iva, int screenSize, boolean smart, boolean hasLoyaltyCard){
        super(name, description, price, iva, hasLoyaltyCard);
        setSmart(smart);
        setScreenSize(screenSize);
        setPriceIncludingVat();
        setDiscountedPrice(hasLoyaltyCard);
    }

    public String isSmart() {
        return smart? "Si" : "No";
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    public String getScreenSize() {
        return screenSize + "''";
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = valueOrDefault(screenSize);
    }

    private int valueOrDefault(int value){
        return value > 0 ? value : 1;
    }

    @Override
    public void setDiscountedPrice(boolean hasLoyaltyCard) {
        if(!this.smart && hasLoyaltyCard){
            this.discountedPrice = priceIncludingVat.subtract(priceIncludingVat.multiply(BigDecimal.valueOf((double) 10/100)));
        }else{
            super.setDiscountedPrice(hasLoyaltyCard);
        }
    }

    @Override
    public String toString() {
        return "Tv{" +
                "code=" + getCode() +
                ", name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", screenSize=" + getScreenSize() +
                ", smart=" + isSmart() +
                ", price=" + getPrice() +
                ", iva=" + getIva() +
                ", priceIncludingVat=" + getPriceIncludingVat() +
                ", discountedPrice=" + getDiscountedPrice() +
                '}';
    }
}
