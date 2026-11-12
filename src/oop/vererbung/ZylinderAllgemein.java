package oop.vererbung;

public abstract class ZylinderAllgemein {
    protected final double HOEHE;

    public abstract double getGrundflaeche();
    public abstract double getUmfangGrundflaeche();

    public ZylinderAllgemein(double hoehe) {
        this.HOEHE = hoehe;
    }

    public double getMantel() {
        return this.getGrundflaeche() * this.HOEHE;
    }

    public double getOberflaeche() {
        return 2 * this.getGrundflaeche() + this.HOEHE * this.getUmfangGrundflaeche();
    }

    public double getVolumen() {
        return this.HOEHE * this.getGrundflaeche();
    }
}
