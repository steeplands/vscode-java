package oop.tictactoe;

public class Spielbrett {
    private Feld[][] brett;

    public Spielbrett() {
        this.brett = new Feld[3][3];

        for (int i = 0; i < brett.length; i++) {
            for (int j = 0; j < brett.length; j++) {
                this.brett[i][j] = new Feld();
            }
        }
    }

    public boolean istVoll() {
        for (Feld[] zeile : brett) {
            for (Feld feld : zeile) {
                if (feld.istFrei()) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean steinSetzen(int zeile, int spalte, Spieler spieler) {
        return this.brett[zeile][spalte].besetzen(spieler);
    }

    public Feld[] getZeile(int zeile) {
        return this.brett[zeile];
    }

    public Feld[] getSpalte(int spalte) {
        Feld[] neuSpalte = new Feld[3];
        for (int i = 0; i < neuSpalte.length; i++) {
            neuSpalte[i] = brett[i][2];
        }
        return neuSpalte;
    }

    public Feld[] getDiagonaleHaupt() {
        Feld[] diagMain = new Feld[3];

        for (int i = 0; i < diagMain.length; i++) {
            diagMain[i] = brett[i][i];
        }

        return diagMain;
    }

    public Feld[] getDiagonaleNeben() {
        Feld[] diagScnd = new Feld[3];

        for (int i = 0; i < diagScnd.length; i++) {
            diagScnd[i] = brett[2-i][i];
        }        
        return diagScnd;
    }
    
    public void brettAusgeben() {
        for (int i = 0; i < brett.length; i++) {
            for (Feld feld : brett[i]) {
                System.out.printf(" %s |", feld.toString());
            }
            if (i < 2) {
               System.out.print("\n - + - + - + -"); 
            }
            System.out.println();
        }
    }
}
