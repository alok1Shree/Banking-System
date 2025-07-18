package org.banking;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StartBankingApplication {
    public static void main(String[] args) {
        Util util = new Util();
        Customer customer = new Customer();
        Bank bank = new Bank();
        SavingsAccount savingsAccount = new SavingsAccount();
        CurrentAccount currentAccount = new CurrentAccount();
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose Your Operations");
        System.out.println("1. Open Account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");

        String operations = scan.nextLine();
        switch (operations) {
            case "Open Account":
                System.out.println("Enter your Account Type");
                String accountType = scan.nextLine();
                System.out.println("Enter your Name: ");
                String name = scan.nextLine();
                System.out.println("Enter your email");
                String email = scan.nextLine();
                System.out.println("Enter your PhoneNumber");
                int phoneNumber = scan.nextInt();
                System.out.println("Enter Amount");
                double amount = scan.nextInt();

                //Setting Customer details for openings account
                customer.setCustomerId(util.randomId(accountType));
                customer.setName(name);
                customer.setEmail(email);
                customer.setPhoneNumber(phoneNumber);
                customer.setAccountNumber(util.accountNumber(accountType));
                savingsAccount.setBalance(amount);

                //Displaying Customer Account Details:
                System.out.println("Congrats your account have been successfully open.");
                System.out.println("Account Id : " + customer.getCustomerId());
                System.out.println("Name : " + customer.getName());
                System.out.println("Email : " + customer.getEmail());
                System.out.println("Phone Number : " + customer.getPhoneNumber());
                System.out.println("Account Number : " + customer.getAccountNumber());
                System.out.println("Account Balance : " + savingsAccount.getBalance());

                break;

            case "Deposit":
                System.out.println("Select Account Type");
                System.out.println("Saving");
                System.out.println("Current");
                String selectDepositAccountType = scan.nextLine();
                switch (selectDepositAccountType){
                    case "Saving":
                        savingsAccount.setCustomer(customer);
                        savingsAccount.setBalance(5000);
                        savingsAccount.setInterestRate(1.5);
                        System.out.println("Enter Amount");
                        double depostSAAmount = scan.nextInt();
                        savingsAccount.deposit(depostSAAmount);
                        System.out.println("Successfully Deposited.'\n' Total amount = " + savingsAccount.getBalance());
                        break;
                    case "Current":
                        currentAccount.setCustomer(customer);
                        currentAccount.setBalance(3000);
                        currentAccount.setOverdraftlimit(500);
                        System.out.println("Enter Amount");
                        double depostCAAmount = scan.nextInt();
                        savingsAccount.deposit(depostCAAmount);
                        System.out.println("Successfully Deposited.Total amount = " + currentAccount.getBalance());
                        break;
                }
                break;

            case "Withdraw":
                System.out.println("Select Account Type");
                System.out.println("Saving");
                System.out.println("Current");
                String selectWithdrawalAccountType = scan.nextLine();
                switch (selectWithdrawalAccountType){
                    case "Saving":
                        savingsAccount.setCustomer(customer);
                        savingsAccount.setBalance(5000);
                        savingsAccount.setInterestRate(1.5);
                        System.out.println("Enter Amount");
                        double depostSAAmount = scan.nextInt();
                        savingsAccount.withdraw(depostSAAmount);
                        break;
                    case "Current":
                        currentAccount.setCustomer(customer);
                        currentAccount.setBalance(3000);
                        currentAccount.setOverdraftlimit(500);
                        System.out.println("Enter Amount");
                        double depostCAAmount = scan.nextInt();
                        currentAccount.withdraw(depostCAAmount);
                        break;
                }
                break;
        }
    }
}