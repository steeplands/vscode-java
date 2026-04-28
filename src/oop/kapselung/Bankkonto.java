package oop.kapselung;

public class Bankkonto {
    private double overdraft;
    private String owner;
    private double balance;
    
    private static int idInkre = 1;
    private int id = idInkre++;

    public Bankkonto() {
        this.overdraft = 0;
        this.balance = 0;
    }
    
    public Bankkonto(String owner) {
        this.owner = owner;
        this.overdraft = 0;
        this.balance = 0;
    }

    public int getId() {
        return id;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return this.balance;
    }

    public boolean deposit(double ammount) {
        if (ammount < 0) {
            return false;
        }
        this.balance += ammount;
        return true;
    }

    public boolean withdraw(double ammount) {
        if(this.balance - Math.abs(ammount) >= this.overdraft) {
            return false;
        }
        this.balance -= Math.abs(ammount);
        return true;
    }
}
