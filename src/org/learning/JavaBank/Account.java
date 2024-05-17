package org.learning.JavaBank;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Account {
    private int code;
    private String name;
    private BigDecimal balance;

    public Account(String name) {
        Random randomGenerator= new Random();
        setName(name);
        balance= new BigDecimal(0);
        code= randomGenerator.nextInt(1000) + 1;
    }

    public String getCode() {
        return String.format("%04d",code);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBalance() {
        return balance.setScale(2, RoundingMode.HALF_UP) + "€";
    }

    public String withdraw(double amount) {
        if(this.balance.doubleValue() >= amount){
            this.balance= this.balance.subtract(BigDecimal.valueOf(amount));
            return "---------\nHai prelevato " + (new BigDecimal(amount).setScale(2, RoundingMode.HALF_UP)) + "€, il tuo saldo rimanente è di " + this.balance.setScale(2, RoundingMode.HALF_UP) + "€\n---------";
        } else{
        return "---------\nSaldo insufficiente\n---------";
        }
    }

    public String deposit(double amount){
        this.balance= this.balance.add(BigDecimal.valueOf(amount));
        return "---------\nHai depositato " + (new BigDecimal(amount).setScale(2, RoundingMode.HALF_UP)) + "€. Il tuo saldo attuale: " + this.balance.setScale(2, RoundingMode.HALF_UP) + "€\n---------";
    }
}
