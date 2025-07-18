package org.banking;

import java.util.List;

public class Bank {
    List<Account> accounts;
    List<Customer> customers;

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public void createAccount(Account account){
        accounts.add(account);
    }

    public void getAccountDetails(String accountNumber){

    }
}
