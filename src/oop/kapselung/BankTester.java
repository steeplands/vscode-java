package oop.kapselung;

public class BankTester {
    public static void main(String[] args) {
        System.out.println("=====Konten=====");

        Bankkonto konto1 = new Bankkonto("Armin");
        Bankkonto konto2 = new Bankkonto("Doris");

        konto1.deposit(50);
        konto2.deposit(106.75);

        System.out.printf("Besitzer: %s, Kontostand: %s\n", konto1.getOwner(), konto1.getBalance());
        System.out.printf("Besitzer: %s, Kontostand: %s\n", konto2.getOwner(), konto2.getBalance());

        konto1.withdraw(12.45);
        System.out.println("Konto1: " + konto1.getBalance());

        System.out.println("\n=====Bank=====");
        //Bank
        Bank bank = new Bank(100);

        bank.newAccount("Ulf");
        bank.newAccount("Ema");

        bank.getAccount("Ulf").deposit(106.75);
        bank.getAccount("Ema").deposit(420);

        System.out.printf("Besitzer: %s, Kontostand: %s\n", bank.getAccount("Ema").getOwner(), bank.getAccount("Ema").getBalance());
        System.out.printf("Besitzer: %s, Kontostand: %s\n", bank.getAccount("Ulf").getOwner(), bank.getAccount("Ulf").getBalance());
    }
}
