package com.example.companyx.;

public class Account {
    private Long id;
    private String fixedInterest;
    private String balance;

    public Account() {
        super();
    }

    public Account(Long id, String fixedInterest, String balance) {
        super();
        this.id = id;
        this.fixedInterest = fixedInterest;
        this.balance = balance;
    }

    public Account(String fixedInterest, String balance) {
        super();
        this.fixedInterest = fixedInterest;
        this.balance = balance;
    }


    public String getFixedInterest() {
        return fixedInterest;
    }

    public void setFixedInterest(String fixedInterest) {
        this.fixedInterest = fixedInterest;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("Account [id=%s, finterest=%s, balance=%s]", id, fixedInterest, balance);
    }

}