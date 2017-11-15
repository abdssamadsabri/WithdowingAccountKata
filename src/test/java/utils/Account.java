package utils;

public class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void withdraw(double arg){
        balance = this.balance - arg;
        this.setBalance(balance);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
