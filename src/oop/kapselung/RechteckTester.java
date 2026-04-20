package oop.kapselung;

public class RechteckTester {
    public static void main(String[] args) {
        Rechteck r1 = new Rechteck(5, 2);
        r1.getLaenge();
        r1.setLaenge(6);

        System.out.println("Länge:  " + r1.getLaenge());
        System.out.println("Breite: " + r1.getBreite());
    }
}
