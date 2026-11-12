package oop.vererbung;

public abstract class ZylinderAllgemein {
    protected double hoehe;

    public abstract double getGrundflaeche();
    public abstract double getUmfangGrundflaeche();

    public ZylinderAllgemein(double hoehe) {
        this.hoehe = hoehe;
    }

    public double getMantel() {
        return this.getGrundflaeche() * this.hoehe;
    }

    public double getOberflaeche() {
        return 2 * this.getGrundflaeche() + this.hoehe * this.getUmfangGrundflaeche();
    }

    public double getVolumen() {
        return this.hoehe * this.getGrundflaeche();
    }
}
