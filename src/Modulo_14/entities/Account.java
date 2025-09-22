package Modulo_14.entities;

import Modulo_14.exceptions.AccountException;

public class Account {
    private Integer number;
    private String holder;
    private double balance = 0;
    private double withdrawLimit;

    public Account(Integer number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance =+ balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount) {
        this.balance =+ amount;
    }

    public void withdraw(double amount) throws AccountException {
        if (withdrawLimit < amount){
            throw new AccountException ("It is not possible to withdraw a amount higher than the limit withdraw limit of: " + withdrawLimit);
        }
        if (balance < amount){
            throw new AccountException("It is not possible to withdraw a amount higher than your balance");
        }
        this.balance =- amount;
    }
}
