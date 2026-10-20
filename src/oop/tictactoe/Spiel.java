package oop.tictactoe;

import helper.SavitchIn;

public class Spiel {
    private Spielbrett spielbrett;
    private Spieler aktuellerSpieler;
    private Spieler naechsterSpieler;

    public Spiel(Spieler spieler1, Spieler spieler2) {
        this.aktuellerSpieler = spieler1;
        this.naechsterSpieler = spieler2;
        this.spielbrett = new Spielbrett();
    }

    public void spielerWechseln() {
        Spieler temp = aktuellerSpieler;
        this.aktuellerSpieler = this.naechsterSpieler;
        this.naechsterSpieler = temp;
    }

    public boolean steinSetzen() {
        System.out.print("Zeile: ");
        int row = SavitchIn.readLineInt();
        System.out.print("Spalte: ");
        int col = SavitchIn.readLineInt();
        return this.spielbrett.steinSetzen(row, col, this.aktuellerSpieler);
    }

    public boolean gewonnen() {
        boolean win;

        // Zeilen
        for (int i = 0; i < this.spielbrett.getZeile(0).length; i++) {
            win = true;        
            for (Feld feld : this.spielbrett.getZeile(i)) {
                if (feld.getSpieler() != this.aktuellerSpieler) {
                    win = false;
                }
            }
            if (win) return true;
        }

        // Spalten
        for (int i = 0; i < this.spielbrett.getSpalte(0).length; i++) {
            win = true;            
            for (Feld feld : this.spielbrett.getSpalte(i)) {
                if (feld.getSpieler() != this.aktuellerSpieler) {
                    win = false;
                }
            }
            if (win) return true;
        }

        // Diagonalen
        win = true;
        for (Feld feld : this.spielbrett.getDiagonaleHaupt()) {
            if (feld.getSpieler() != this.aktuellerSpieler) {
                win = false;
            }
        }
        if (win) return true;

        win = true;
        for (Feld feld : this.spielbrett.getDiagonaleNeben()) {
            if (feld.getSpieler() != this.aktuellerSpieler) {
                win = false;
            }
        }
        return win;
    }

    public boolean unentschieden() {
        if (this.gewonnen()) return false;
        return spielbrett.istVoll();
    }

    public static void main(String[] args) {
        Spieler spieler1;
        Spieler spieler2;
        Spiel spiel;
        int zug = 1;

        System.out.print("Spieler1 Name: ");
        spieler1 = new Spieler(SavitchIn.readLine(), 'X');

        System.out.print("Spieler2 Name: ");
        spieler2 = new Spieler(SavitchIn.readLine(), 'O');

        spiel = new Spiel(spieler1, spieler2);

        // spiel.steinSetzen();
        System.out.println("----------");
        spiel.spielbrett.brettAusgeben();

        while (true) {
            System.out.println();
            System.out.printf("ZUG: %d/9\n", zug);
            spiel.steinSetzen();

            spiel.spielbrett.brettAusgeben();

            if (spiel.unentschieden()) {
                System.out.println("Unentschieden");
                break;
            }

            if (spiel.gewonnen()) {
                System.out.println("GEWONNEN: " + spiel.aktuellerSpieler.getName());
                break;
            }
            // spiel.gewonnen();
            // spiel.unentschieden();
            spiel.spielerWechseln();
            zug++;
        }
    }
}
