package org.banking;

public class SavingsAccount extends Account{
    private double interestRate;

    public double getInterestRate(){
        return interestRate;
    }

    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= getBalance()){
            double balance = getBalance();
            balance -= amount;
            System.out.println(amount+"Withdraw. Remaning balance = "+balance);
        }else{
            System.out.println("Insufficient Withdrawal fund in Saving Account.");
        }
    }
}
