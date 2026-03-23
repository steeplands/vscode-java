package oop;

public class RechteckTester {
    public static void main(String[] args) {
        Rechteck recht1 = new Rechteck();
        recht1.laenge = 5;
        recht1.breite = 3;

        recht1.printState();
        // System.out.println("Area1 = " + recht1.getArea() + '\n');

        Rechteck recht2 = new Rechteck();
        recht2.laenge = 8;
        recht2.breite = 2.5;

        recht2.printState();

        // System.out.println("Länge: " + recht2.laenge);
        // System.out.println("Breite: " + recht2.breite);

        Rechteck recht3 = new Rechteck(3, 10);
        recht3.printState();
    }
}
