package oop.vererbung.vehicle;

public class Main {
    /*
    Erstelle eine Klasse Main, in welcher:
        1. Ein Auto und ein Motorrad erstellt werden.
        2. Beide Fahrzeuge beschleunigt werden.
        3. Die Geschwindigkeit und der berechnete Verbrauch ausgegeben werden.
        4. Beide Objekte über eine Variable vom Typ Fahrzeug angesprochen werden.
    Zusatzaufgabe: Erstelle ein Array vom Typ Fahrzeug, in dem mehrere unterschiedliche Fahrzeuge gespeichert werden. Gib für jedes Fahrzeug den Verbrauch aus.
    */

    public static void main(String[] args) {
        Fahrzeug motorrad = new Motorrad("Marke", "Modell", 2001, 0, 1550);
        Fahrzeug auto = new Auto("Audi", "Q8", 2026, 0, 3.1);

        motorrad.beschleunigen(53);
        auto.beschleunigen(141);

        System.out.println("Motorrad:");
        System.out.println("Speed       : " + motorrad.getSpeed());
        System.out.println("Verbrauch   : " + motorrad.berechneVerbrauch());
        System.out.println();
        System.out.println("Auto:");
        System.out.println("Speed       : " + auto.getSpeed());
        System.out.println("Verbrauch   : " + auto.berechneVerbrauch());
    }
}
