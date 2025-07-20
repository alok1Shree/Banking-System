package org.banking;

public class Customer{
    private String customerId;
    private String name;
    private String email;
    private long phoneNumber;
    private String accountNumber;
    private String accountType;

//    public Customer(String customerId, String name, String email, Double phoneNumber) {
//        this.customerId = customerId;
//        this.name = name;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
//    }

    public String getCustomerId() {
        return customerId;
    }

    public Customer setCustomerId(String customerId) {
        this.customerId = customerId;
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
