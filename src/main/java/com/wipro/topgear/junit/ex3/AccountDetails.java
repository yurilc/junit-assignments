package com.wipro.topgear.junit.ex3;

import java.util.Random;

public class AccountDetails {
    private int acctNo;
    private String acctName;
    private float acctBalance;

    public AccountDetails(int acctNo, String acctName) {
        this.acctNo = acctNo;
        this.acctName = acctName;
    }

    public void deposit(float amount) {
        if(amount < 1)
            throw new IllegalArgumentException("Amount must be positive!");
        acctBalance += amount;
    }

    public void withdraw(float amount) {
        if(amount < 1)
            throw new IllegalArgumentException("Amount must be positive!");
        acctBalance -= amount;
    }

    public int creditCard() {
        Random random = new Random();
        return random.nextInt(899999) + 100000;
    }

    public int getAcctNo() {
        return acctNo;
    }

    public String getAcctName() {
        return acctName;
    }

    public float getAcctBalance() {
        return acctBalance;
    }
}
