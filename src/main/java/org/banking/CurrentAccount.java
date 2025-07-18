package org.banking;

public class CurrentAccount extends Account {
    private double overdraftlimit;

    public double getOverdraftlimit(){
        return overdraftlimit;
    }

    public void setOverdraftlimit(double overdraftlimit){
        this.overdraftlimit = overdraftlimit;
    }

    @Override
    public void withdraw(double amount) {
        if(amount<=getBalance()+overdraftlimit){
            double balance = getBalance();
            balance -= amount;
            System.out.println(amount+" Withdrawn. Remaning Balance = "+balance);
        }else{
            System.out.println("Overdraft limit exceeded in Current Account.");
        }
    }
}
