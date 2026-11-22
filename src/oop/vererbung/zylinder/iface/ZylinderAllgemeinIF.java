package oop.vererbung.zylinder.iface;

public class ZylinderAllgemeinIF {
    private final IGeometrischeFlaeche grundflaeche;
    private final double hoehe;

    public ZylinderAllgemeinIF(IGeometrischeFlaeche grundflaeche, double hoehe) {
        this.grundflaeche = grundflaeche;
        this.hoehe = hoehe;
    }

    public IGeometrischeFlaeche getGrundflaeche() {
        return this.grundflaeche;
    }

    public double getMantel() {
        return this.grundflaeche.getUmfang() * this.hoehe;
    }
}
