package oop;

public class Rechteck {
    double laenge;
    double breite;

    // Constructor
    public Rechteck() {
        // this(1, 1); //acess alternative constructor
    }

    public Rechteck(double laenge, double breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    public double getArea() {
        return this.laenge * this.breite;
    }

    public double getCircumference() {
        return 2 * (this.laenge + this.breite);
    }
    
    public void printState() {
        System.out.println("*****************************");
        System.out.println("Länge:  " + this.laenge);
        System.out.println("Breite: " + this.breite);
        System.out.println("Fläche: " + this.getArea());
        System.out.println("Umfang: " + this.getCircumference());
    }
}
