package org.learning.JavaShop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {

    protected int code;
    protected String name;
    protected String description;
    protected BigDecimal price;
    protected   int iva;
    protected BigDecimal priceIncludingVat;
    protected BigDecimal discountedPrice;

    public Product(String name, String description, double price, int iva, boolean hasLoyaltyCard) {
        Random randomGenerator= new Random();
        this.code = randomGenerator.nextInt(1,1000000);
        setName(name);
        setDescription(description);
        setPrice(price);
        setIva(iva);
        setPriceIncludingVat();
        setDiscountedPrice(hasLoyaltyCard);
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
        return price.setScale(2, RoundingMode.HALF_UP) + "€";
    }

    public void setPrice(double price) {
        this.price = price > 0 ? new BigDecimal(price) : new BigDecimal(1);
    }

    public String getIva() {
        return iva + "%";
    }

    public void setIva(int iva) {
        this.iva = iva > 0 ? iva : 1;
    }

    public String getPriceIncludingVat(){
        return priceIncludingVat.setScale(2, RoundingMode.HALF_UP) + "€";
    }

    public void setPriceIncludingVat(){
        this.priceIncludingVat= new BigDecimal(String.valueOf(price.add(price.multiply(BigDecimal.valueOf((double) iva / 100)))));
    }

    public String getExtendedName(){
        return String.format("%06d", code) + "-" + name;
    }

    public String getDiscountedPrice(){
    return discountedPrice.setScale(2, RoundingMode.HALF_UP) + "€";
    }

    public void setDiscountedPrice(boolean hasLoyaltyCard){
       this.discountedPrice= hasLoyaltyCard?  priceIncludingVat.subtract(priceIncludingVat.multiply(BigDecimal.valueOf((double) 2/100))) : priceIncludingVat;
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
