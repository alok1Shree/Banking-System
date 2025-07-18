package org.banking;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StartBankingApplication {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setCustomerId("C001");
        customer.setName("Alok Shree");
        customer.setEmail("alokshree@gmail.com");
        customer.setPhoneNumber(123456);

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setCustomer(customer.setCustomerId("SA001"));
        savingsAccount.setCustomer(customer);
        savingsAccount.setBalance(5000);
        savingsAccount.setInterestRate(1.5);

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.setCustomer(customer.setCustomerId("CA001"));
        currentAccount.setCustomer(customer);
        currentAccount.setBalance(3000);
        currentAccount.setOverdraftlimit(500);

        savingsAccount.deposit(200);
        System.out.println("Successfully Deposited.Total amount = "+savingsAccount.getBalance());
        savingsAccount.withdraw(6000);


        currentAccount.deposit(1000);
        System.out.println("Successfully Deposited.Total amount = "+currentAccount.getBalance());
        currentAccount.withdraw(50000);

    }
}