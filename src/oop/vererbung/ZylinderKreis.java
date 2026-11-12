package oop.vererbung;

public class ZylinderKreis extends ZylinderAllgemein {
    private final double RADIUS;

    public ZylinderKreis(double hoehe, double radius) {
        super(hoehe);
        this.RADIUS = radius;
    }

    public double getGrundflaeche() {
        return (Math.pow(this.RADIUS, 2) * Math.PI);
    }

    public double getUmfangGrundflaeche() {
        return (this.RADIUS * 2 * Math.PI);
    }
}
