package oop;

public class Kreis {
    double radius;

    // constructor
    public Kreis() {

    }

    public Kreis(double radius) {
        this.radius = radius;
    }

    // methods
    public double getDiameter() {
        return (2 * this.radius);
    }

    public double getPerimeter() {
        return (2 * this.radius * Math.PI);
    }

    public double getArea() {
        return (Math.pow(this.radius, 2) * Math.PI);
    }
    
    public void printState() {
        System.out.println("*****************************");
        System.out.println("Radius:        " + this.radius);
        System.out.println("Diameter:      " + this.getDiameter());
        System.out.println("Area:          " + this.getArea());
        System.out.println("Perimeter: " + this.getPerimeter());
    }
}
