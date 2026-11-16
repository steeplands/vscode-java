package oop.vererbung.iface;

public class RechteckIF implements IGeometrischeFlaeche {
    private double laenge;
    private double breite;

    public RechteckIF(double laenge, double breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    @Override 
    public double getUmfang() {
        return 2 * (this.laenge + this.breite);
    }

    @Override
    public double getFlaeche() {
        return this.laenge * this.breite;
    }
}
