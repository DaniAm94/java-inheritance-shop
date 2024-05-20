package org.learning.JavaShop;

import java.math.BigDecimal;
import java.util.Random;

public class Smartphone extends Product {
    private String imeiCode;
    private int memory;

    public Smartphone(String name, String description, double price, int iva, int memory, boolean hasLoyaltyCard){
        super(name, description, price, iva, hasLoyaltyCard);
        Random randomGenerator= new Random();
        imeiCode= String.format("%015d",(  1 + (randomGenerator.nextLong() & Long.MAX_VALUE) % 999999999999999L));
        setMemory(memory);
        setPriceIncludingVat();
        setDiscountedPrice(hasLoyaltyCard);
    }

    public String getImeiCode(){
        return imeiCode;
    }

    public String getMemory() {
        return memory + "Gb";
    }

    public void setMemory(int memory) {
        this.memory = valueOrDefault(memory);
    }

    private int valueOrDefault(int value){
        return value > 0 ? value : 1;
    }

    @Override
    public void setDiscountedPrice(boolean hasLoyaltyCard) {
        if(memory< 32 && hasLoyaltyCard){
            this.discountedPrice = priceIncludingVat.subtract(priceIncludingVat.multiply(BigDecimal.valueOf((double) 5/100)));
        }else{
        super.setDiscountedPrice(hasLoyaltyCard);
        }
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "imeiCode='" + getImeiCode() + '\'' +
                ", memory=" + getMemory() +
                ", code=" + getCode() +
                ", name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", price=" + getPrice() +
                ", iva=" + getIva() +
                ", priceIncludingVat=" + getPriceIncludingVat() +
                ", discountedPrice=" + getDiscountedPrice() +
                '}';
    }
}
