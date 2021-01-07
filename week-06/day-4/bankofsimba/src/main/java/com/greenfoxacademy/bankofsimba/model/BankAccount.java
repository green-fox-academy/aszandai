package com.greenfoxacademy.bankofsimba.model;

public class BankAccount {
    private String name;
    private Integer balance;
    private String animalType;
    private String currency;
    private Long id;
    private boolean isKing;


    private static long counter = 1;

    public BankAccount(String name, Integer balance, String animalType, String currency, boolean isKing) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.currency = currency;
        this.id = counter;
        ++counter;
        this.isKing = isKing;
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

    public Boolean getKing() {
        return isKing;
    }
}
