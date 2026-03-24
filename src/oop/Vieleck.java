package oop;

public class Vieleck {
    int vertices;
    double side;

    public Vieleck() {
        this.vertices = 3;
        this.side = 1;
    }
    
    public Vieleck(int vertices, double side) {
        this.vertices = vertices;
        this.side = side;
    }

    public double getArea() {
        return (this.vertices * Math.pow(this.side, 2)) / (4 * Math.tan( Math.PI / this.vertices));
    }

    public double getPerimeter() {
        return (this.vertices * this.side);
    }
    
    public double getRadiusOuter() {
        return ( this.side / (2 * Math.sin(Math.PI/this.side)));
    }

    public double getRadiusInner() {
        return ( this.side / (2 * Math.tan(Math.PI/this.side)));
    }

    public double getInteriorAngle() {
        return ( ((this.vertices - 2) * 180 ) / this.vertices ); 
    }

    public void printState() {
        System.out.println("*****************************");
        System.out.println("Edges:       " + this.vertices);
        System.out.println("Side:        " + this.side);
        System.out.println("Area:        " + this.getArea());
        System.out.println("Perimeter:   " + this.getPerimeter());
        System.out.println("Innenradius: " + this.getRadiusInner());
        System.out.println("Außenradius: " + this.getRadiusOuter());
        System.out.println("Innenwinkel: " + this.getInteriorAngle());
    }
}
