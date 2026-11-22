package oop.vererbung.zylinder.abstrakt;

public class ZylinderKreis extends ZylinderAllgemein {
    private final double RADIUS;

    public ZylinderKreis(double hoehe, double radius) {
        super(hoehe);
        this.RADIUS = radius;
    }

    @Override
    public double getGrundflaeche() {
        return (Math.pow(this.RADIUS, 2) * Math.PI);
    }

    @Override
    public double getUmfangGrundflaeche() {
        return (this.RADIUS * 2 * Math.PI);
    }
}
