package com.greenfoxacademy.bankofsimba.model;

public class BankAccount {
    private String name;
    private Integer balance;
    private String animalType;
    private String currency;
    private Long id;
    private boolean isKing;
    private boolean isGoodGuy;


    private static long counter = 1;

    public BankAccount(String name, Integer balance, String animalType, String currency, boolean isKing, boolean isGoodGuy) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.currency = currency;
        this.id = counter;
        ++counter;
        this.isKing = isKing;
        this.isGoodGuy = isGoodGuy;
    }

    public String getName() {
        return name;
    }

    public String getAnimalType() {
        return animalType;
    }

    public Integer getBalance() {
        return balance;
    }

    public Long getId() {
        return id;
    }

    public String getCurrency() {
        return currency;
    }

    public boolean isKing() {
        return isKing;
    }

    public boolean isGoodGuy() {
        return isGoodGuy;
    }
}
