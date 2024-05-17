package org.learning.JavaBank;

import java.util.Random;

public class Account {
    private int code;
    private String name;
    private double balance;

    public Account(String name) {
        Random randomGenerator= new Random();
        setName(name);
        balance=0;
        code= randomGenerator.nextInt(1000) + 1;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBalance() {
        return balance + "€";
    }

    public String withdraw(double amount) {
        if(this.balance >= amount){
            this.balance -= amount;
            return "---------\nHai prelevato " + amount + "€, il tuo saldo rimanente è di:" + this.balance + "€";
        } else{
        return "---------\nSaldo insufficiente";
        }
    }

    public String deposit(double amount){
        this.balance += amount;
        return "---------\nHai depositato " + amount + "€. Il tuo saldo attuale: " + this.balance + "€";
    }
}
