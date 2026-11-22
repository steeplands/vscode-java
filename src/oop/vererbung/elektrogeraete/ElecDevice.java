package oop.vererbung.elektrogeraete;

public abstract class ElecDevice {
    private String hersteller;
    private String modell;
    private double preis;
    private boolean eingeschaltet;

    public ElecDevice(String hersteller, String modell, double preis, boolean eingeschaltet) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.preis = preis;
        this.eingeschaltet = eingeschaltet;
    }

    public String getHersteller()   {return this.hersteller;}
    public String getModell()       {return this.modell;}
    public double getPries()        {return this.preis;}
    public boolean isTurnedOn()     {return this.eingeschaltet;}

    public void einschalten() {this.eingeschaltet = true;}
    public void ausschalten() {this.eingeschaltet = false;}

    public abstract String getBeschreibung();
}
