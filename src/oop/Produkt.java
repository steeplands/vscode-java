package oop;

public class Produkt {
    static double steuersatz = 0.2;
    double netto;
    String name;

    public Produkt (String name, double nettoPreis) {
        this.netto = nettoPreis;
        this.name = name;
    }

    public static double getMwst(double nettoPreis) {
        return (nettoPreis * Produkt.steuersatz);
    }

    public double getMwst() {
        return Produkt.getMwst(this.netto);
    }

    public double getBrutto() {
        return this.netto + this.getMwst();
    }

    public double getNetto() {
        return netto;
    }

    public void printStatus() {
        System.out.printf("Netto:  EUR %.2f\n", this.netto);
        System.out.printf("Brutto: EUR %.2f\n", this.getBrutto());
        System.out.printf("Steuer: EUR %.2f\n", this.getMwst());
    } 
}
