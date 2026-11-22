package oop.vererbung.vehicle;

public class Motorrad extends Fahrzeug {
    private int hubraum;

    public Motorrad(String marke, String modell, int baujahr, double speed, int hubraum) {
        super(marke, modell, baujahr, speed);
        this.hubraum = hubraum;
    }

    public double berechneVerbrauch() {
        return this.hubraum / 100.0;
    }
}
