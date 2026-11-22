package oop.vererbung.vehicle;

public abstract class Fahrzeug {
    private String marke;
    private String modell;
    private int baujahr;
    private double speed;

    public Fahrzeug(String marke, String modell, int baujahr, double speed) {
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.speed = speed;
    }

    public String getMarke()    {return this.marke;}
    public String getModell()   {return this.modell;}
    public int getBaujahr()     {return this.baujahr;}
    public double getSpeed()    {return this.speed;}

    public void beschleunigen(double wert) {
        this.speed += wert;
    }

    public void bremsen(double wert) {
        if (this.speed - Math.abs(wert) < 0) {
            this.speed = 0;
        } else {
            this.speed -= Math.abs(wert);
        }
    }

    public abstract double berechneVerbrauch();
}
