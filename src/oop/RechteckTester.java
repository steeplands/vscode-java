package oop;

public class RechteckTester {
    public static void main(String[] args) {
        Rechteck recht1 = new Rechteck();
        recht1.laenge = 5;
        recht1.breite = 3;

        System.out.println("Länge: " + recht1.laenge);
        System.out.println("Breite: " + recht1.breite);

        Rechteck recht2 = new Rechteck();
        recht2.laenge = 8;
        recht2.breite = 2.5;

        System.out.println("Länge: " + recht2.laenge);
        System.out.println("Breite: " + recht2.breite);
    }
}
