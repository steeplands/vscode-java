package oop.kapselung;

public class Bankkonto {
    private double overdraft;
    private String owner;
    private double balance;
    
    private static int numOfAccounts;
    private int id = ++numOfAccounts;
    
    public Bankkonto(String owner) {
        this.owner = owner;
        this.overdraft = 0;
        this.balance = 0;
    }

    public int getId() {
        return this.id;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public boolean setOverdraft(double overdraft) {
        if (overdraft < 0) {
            return false;
        } else {
            this.overdraft = overdraft;
            return true;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAvailable() {
        return this.balance + this.overdraft;
    }

    public boolean deposit(double ammount) {
        if (ammount < 0) {
            return false;
        }
        this.balance += ammount;
        return true;
    }

    public boolean withdraw(double ammount) {
        if (ammount <= 0) {
            return false;
        } else if (ammount > this.getAvailable()) {
            return false;
        } else {
            this.balance -= ammount;
            return true;
        }
    }

    public void getAccountInfo() {
        System.out.println("\n===== Account Information =====");
        System.out.println("AccountID:   " + this.id);
        System.out.println("Owner:       " + this.owner);
        System.out.println("Balance:     EUR " + this.balance);
        System.out.println("Available:   EUR " + this.getAvailable());
    }
}
