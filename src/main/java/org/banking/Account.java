package org.banking;

abstract class Account {
    private String accountNumber;
    private double balance;
    private Customer customer;

    public double deposit(double amount){
        if (amount <= 0) {
            return -1; // Invalid deposit amount
        }
        balance += amount;
        return balance; // Success
    }

    abstract public void withdraw(double amount);

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
