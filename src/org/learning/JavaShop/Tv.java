package org.learning.JavaShop;

public class Tv extends Product{
    private int screenSize;
    private boolean smart;

    public Tv(String name, String description, int price, int iva, int screenSize, boolean smart){
        super(name, description, price, iva);
        setSmart(smart);
        setScreenSize(screenSize);
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
}
