package com.company;

public class BankAccount {
   private double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
    public void deposit (double sum){
        this.amount = this.amount + sum;
    }
    public void withDraw (double sum)
            throws LimitExeption {
        if (sum > amount) {
            this.amount = this.amount - amount ;
            throw new LimitExeption(" Не достаточно средств на балансе! ", amount);
        }else {
            amount=amount-sum;
        }
    }
}
