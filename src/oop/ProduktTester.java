package oop;

public class ProduktTester {
    public static void main(String[] args) {
        Produkt[] produkte = new Produkt[3];
        double[] preise = {120, 100, 80};

        for (int i = 0; i < produkte.length; i++) {
            produkte[i] = new Produkt(preise[i]);
        }

        for (int i = 0; i < produkte.length; i++) {
            System.out.println("Produkt " + (i+1) );
            produkte[i].printStatus();
        }

        Produkt.steuersatz = 0.19;

        System.out.println("Mwst.: jetzt 19%.");

        for (int i = 0; i < produkte.length; i++) {
            System.out.println("Produkt " + (i+1) );
            produkte[i].printStatus();
        }
    }
}
