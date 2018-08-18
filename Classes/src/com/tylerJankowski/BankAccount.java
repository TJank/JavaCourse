package com.tylerJankowski;

public class BankAccount {
    // Classes challenge && intro to constructors

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("56789", 2.50, "Default name",
                "Default adress", "Default phone number");
        System.out.println("Empty Constructor Called");
    }

    public BankAccount(String accountNumber, double balance, String customerName,
                       String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999", 100.55, customerName, email, phoneNumber);
    }

    public void setAccountNumber(String number) {
        this.accountNumber = number;
    }

    public void setBalance(int amount) {
        this.balance = amount;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double depositFunds(int amount) {
        this.balance += amount;
        System.out.println("Deposit of " + amount +
                ". New balance is " + this.balance);
        return this.balance;
    }

    public double withdrawFunds(int amount) {

        if(this.balance - amount < 0) {
            System.out.println("Insufficient Funds.");
            return this.balance;
        } else {
            this.balance -= amount;
            System.out.println("Withdrawal of " + amount + ". New balance is: " +
                    this.balance);
            return this.balance;
        }
    }

}






