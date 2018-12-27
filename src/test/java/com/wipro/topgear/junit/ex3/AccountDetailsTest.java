package com.wipro.topgear.junit.ex3;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountDetailsTest {

    @Test
    public void testCreation() {
        AccountDetails details = new AccountDetails(23, "Account Name");

        assertEquals("acctNo should be 23", 23, details.getAcctNo());
        assertEquals("acctName should be Account Name", "Account Name", details.getAcctName());
        assertEquals("acctBalance should be 0", 0, details.getAcctBalance(), 0);
    }

    @Test
    public void testDepositPositive() {
        AccountDetails details = new AccountDetails(23, "Account Name");

        details.deposit(50.55f);
        details.deposit(40f);
        details.deposit(10.20f);

        assertEquals("acctBalance should be 100.75", 100.75f, details.getAcctBalance(), 0);
    }

    @Test
    public void testWithdrawPositive() {
        AccountDetails details = new AccountDetails(23, "Account Name");

        details.withdraw(50.55f);
        details.withdraw(40f);
        details.withdraw(10.20f);

        assertEquals("acctBalance should be -100.75", -100.75f, details.getAcctBalance(), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDepositZero() {
        AccountDetails details = new AccountDetails(23, "Account Name");

        details.deposit(0f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDepositNegative() {
        AccountDetails details = new AccountDetails(23, "Account Name");

        details.deposit(-1f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithdrawZero() {
        AccountDetails details = new AccountDetails(23, "Account Name");

        details.withdraw(0f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithdrawNegative() {
        AccountDetails details = new AccountDetails(23, "Account Name");

        details.withdraw(-1f);
    }

    @Test
    public void testCreditCard() {
        AccountDetails details = new AccountDetails(23, "Account Name");

        int creditCard = details.creditCard();

        assertNotEquals("creditCard should not be 0", 0, creditCard);
    }
}