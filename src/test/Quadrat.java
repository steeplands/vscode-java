package test;

public class Quadrat {
    private static int nrOfQuadrate = 0;

    private double s = 0;
    private int id = 0;

    public Quadrat() {
        this(4);
    }

    public Quadrat(double seitenlaenge) {
        setSeitenlaenge(seitenlaenge);
    }

    public void setSeitenlaenge(double seitenlaenge) {
        if (seitenlaenge > 0) {
            this.s = seitenlaenge;
            
        } else {
            this.s = 4;
        }
        this.id = ++Quadrat.nrOfQuadrate;
    }
    
    public double getSeitenlaenge() {
        return this.s;
    }

    public int getId() {
        return this.id;
    }

    public double getUmfang() {
        return this.s * 4;
    }

    public double getFlaeche() {
        return this.s * this.s;
    }
}
