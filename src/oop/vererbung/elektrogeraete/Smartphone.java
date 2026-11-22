package oop.vererbung.elektrogeraete;

public class Smartphone extends ElecDevice implements ILaden, ISpeichern {
    private int akkustand;
    private int speicher;
    private int belegterSpeicher;

    public Smartphone(String hersteller, String modell, double preis, boolean eingeschaltet, int speicher) {
        super(hersteller, modell, preis, eingeschaltet);
        this.akkustand = 75;
        this.speicher = speicher;
    }

    @Override 
    public int getAkkustand() {
        return this.akkustand;
    }

    @Override 
    public int getFreienSpeicher() {
        return this.speicher - this.belegterSpeicher;
    }

    @Override 
    public void aufladen(int prozent) {
        if (this.akkustand + prozent >= 100) {
            this.akkustand = 100;
        } else if (this.akkustand + prozent < 0) {
            this.akkustand = 0;
        } else {
            this.akkustand += prozent;
        }
    }

    @Override 
    public boolean speichern(String daten) {
        if (this.speicher < this.belegterSpeicher + daten.length()) {
            return false;
        } else {
            this.speicher -= daten.length();
            return true;
        }
    }

    @Override 
    public String getBeschreibung() {
        return this.getHersteller() + " - " + this.getModell() + " - " + this.getAkkustand() + "%" + " - " + this.getFreienSpeicher();
    }
}
