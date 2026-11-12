package oop.vererbung;

public class ZylinderQuadratisch extends ZylinderAllgemein {
    private double seite;

    public ZylinderQuadratisch(double hoehe, double seite) {
        super(hoehe);
        this.seite = seite;
    }

    public double getGrundflaeche() {
        return Math.pow(this.seite, 2);
    }

    public double getUmfangGrundflaeche() {
        return this.seite * 4;
    }
}
