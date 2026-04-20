package oop.kapselung;

public class BankkontoTester {
    public static void main(String[] args) {
        Bankkonto konto1 = new Bankkonto("Armin");
        Bankkonto konto2 = new Bankkonto("Doris");

        konto1.deposit(50);
        konto2.deposit(106.75);
    }
}
