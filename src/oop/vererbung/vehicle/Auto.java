package oop.vererbung.vehicle;

public class Auto extends Fahrzeug {
    private double verbrauchPro100km;

    public Auto(String marke, String modell, int baujahr, double speed, double verbrauchPro100km) {
        super(marke, modell, baujahr, speed);
        this.verbrauchPro100km = verbrauchPro100km;
    }

    public double berechneVerbrauch() {return this.verbrauchPro100km;}
}
