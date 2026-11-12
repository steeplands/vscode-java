package oop.vererbung;

public class ZylinderQuadratisch extends ZylinderAllgemein {
    private final double SEITE;

    public ZylinderQuadratisch(double hoehe, double seite) {
        super(hoehe);
        this.SEITE = seite;
    }

    public double getGrundflaeche() {
        return Math.pow(this.SEITE, 2);
    }

    public double getUmfangGrundflaeche() {
        return this.SEITE * 4;
    }
}
