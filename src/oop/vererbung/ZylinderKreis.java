package oop.vererbung;

public class ZylinderKreis extends ZylinderAllgemein {
    private double radius;

    public ZylinderKreis(double radius, double hoehe) {
        super(hoehe);
        this.radius = radius;
    }

    public double getGrundflaeche() {
        return (Math.pow(this.radius, 2) * Math.PI);
    }

    public double getUmfangGrundflaeche() {
        return (this.radius * 2 * Math.PI);
    }
}
