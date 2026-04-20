package oop.kapselung;

public class Bankkonto {
    private double overdraft = 0;
    private String owner;
    private double balance;
    
    public Bankkonto(String besitzer) {
        this.owner = besitzer;
    }

    public String getOwner() {
        return this.owner;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double ammount) {
        this.balance += ammount;
    }

    public boolean withdraw(double ammount) {
        if(this.balance - ammount >= this.overdraft) {
            return false;
        }
        this.balance -= ammount;
        return true;
    }
}
