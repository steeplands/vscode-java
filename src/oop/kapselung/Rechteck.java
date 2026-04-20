package oop.kapselung;

public class Rechteck {
    private double laenge;
    private double breite;

    public Rechteck(double laenge, double breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    public double getLaenge() {
        return this.laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = Math.abs(laenge);
    }

    public double getBreite() {
        return this.breite;
    }

    public void setBreite(double breite) {
        this.breite = Math.abs(breite);
    }

    public double getArea() {
        return this.laenge * this.breite;
    }

    public double getPerimeter() {
        return 2 * (this.laenge + this.breite);
    }
    
    public void printState() {
        System.out.println("*****************************");
        System.out.println("Länge:  " + this.laenge);
        System.out.println("Breite: " + this.breite);
        System.out.println("Fläche: " + this.getArea());
        System.out.println("Umfang: " + this.getPerimeter());
    }
}
