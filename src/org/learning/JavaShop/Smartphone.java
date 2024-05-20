package org.learning.JavaShop;

import java.util.Random;

public class Smartphone extends Product {
    private String imeiCode;
    private int memory;

    public Smartphone(String name, String description, double price, int iva, int memory){
        super(name, description, price, iva);
        Random randomGenerator= new Random();
        imeiCode= String.format("%015d",(  1 + (randomGenerator.nextLong() & Long.MAX_VALUE) % 999999999999999L));
        setMemory(memory);
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
}
