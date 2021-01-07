package com.greenfoxacademy.bankofsimba.model;

public class BankAccount {
    String name;
    Integer balance;
    String animalType;

    public BankAccount(String name, Integer balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
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
}
