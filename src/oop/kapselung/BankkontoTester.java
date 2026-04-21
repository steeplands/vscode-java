package oop.kapselung;

public class BankkontoTester {
    public static void main(String[] args) {
        Bankkonto konto1 = new Bankkonto("Armin");
        Bankkonto konto2 = new Bankkonto("Doris");

        konto1.deposit(50);
        konto2.deposit(106.75);

        System.out.printf("Besitzer: %s, Kontostand: %s\n", konto1.getOwner(), konto1.getBalance());
        System.out.printf("Besitzer: %s, Kontostand: %s\n", konto2.getOwner(), konto2.getBalance());

        konto1.withdraw(12.45);
        System.out.println("Konto1: " + konto1.getBalance());
    }
}
