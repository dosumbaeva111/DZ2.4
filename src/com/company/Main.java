package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount user = new BankAccount(20000);
        while (true) {
            try {
                user.withDraw(6000);
                System.out.println(user.getAmount());

            } catch (LimitExeption e) {
                System.out.println(e.getMessage() + " " + e.getRemainingAmount());
                break;
            }
        }
    }
}
