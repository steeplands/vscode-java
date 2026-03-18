package oop;

public class Widerstand {
    private double wert;

    public Widerstand() {
        wert = 0;
    }

    public Widerstand(double r) {
        wert = r;
    }

    public double getWiderstand() {
        return wert;
    }

    public void setWiderstand(double r) {
        wert = r;
    }

    public String toString() {
        return wert + " Ohm";
    }

    // Series connection
    public Widerstand seriell(Widerstand r) {
        return new Widerstand(this.wert + r.wert);
    }

    // Parallel connection
    public Widerstand parallel(Widerstand r) {
        double result = (this.wert * r.wert) / (this.wert + r.wert);
        return new Widerstand(result);
    }
}
