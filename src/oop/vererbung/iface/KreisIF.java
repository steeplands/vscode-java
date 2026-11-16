package oop.vererbung.iface;

public class KreisIF implements IGeometrischeFlaeche{
    private final double radius;

    public KreisIF(double radius) {
        this.radius = radius;
    }

    @Override 
    public double getUmfang() {
        return this.radius * Math.PI;
    }

    @Override
    public double getFlaeche() {
        return this.radius * this.radius * Math.PI;
    }
}
