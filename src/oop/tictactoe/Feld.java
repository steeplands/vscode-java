package oop.tictactoe;

public class Feld {
    private Spieler spieler;

    public Feld() {
        this.spieler = null;
    }

    public boolean istFrei() {
        return this.spieler == null;
    }

    public  boolean istBesetzt() {
        return !this.istFrei();
    }

    public Spieler getSpieler() {
        return this.spieler;
    }

    public boolean besetzen(Spieler spieler) {
        if (this.istFrei() && spieler != null) {
            this.spieler = spieler;
            return true;
        } else {
            return false;
        }
    }

    public char getSymbol() {
        if (this.spieler == null) {
            return ' ';
        } else {
            return this.getSymbol();
        }
    }

    public String toString() {
        // return String.format("%c", this.getSymbol());
        // return String.valueOf(this.getSymbol());
        return Character.toString(this.getSymbol());
    }
}
