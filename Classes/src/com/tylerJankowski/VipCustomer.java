package com.tylerJankowski;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Default Name", 1000, "defaultAddress@gmail.com");
    }

    public VipCustomer(String name, String emailAddress) {
        this(name, 1000, emailAddress);
    }

    public VipCustomer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
