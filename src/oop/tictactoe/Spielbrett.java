package oop.tictactoe;

public class Spielbrett {
    private Feld[][] brett;
    private int size = 3;

    public Spielbrett() {
        this.brett = new Feld[size][size];

        for (int i = 0; i < brett.length; i++) {
            for (int j = 0; j < brett.length; j++) {
                this.brett[i][j] = new Feld();
            }
        }
    }

    private boolean checkCoordinates(int row, int col) {
        if (row < 0 || row >= this.size || col < 0 || col >= this.size) {
            return false;
        } else {
            return true;
        }
    }

    private boolean checkCoordinates(int rowOrCol) {
        if (rowOrCol < 0 || rowOrCol >= this.size) {
            return false;
        } else {
            return true;
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
        if (!this.checkCoordinates(zeile, spalte)) return false;
        return this.brett[zeile][spalte].besetzen(spieler);
    }

    public Feld[] getZeile(int zeile) {
        if (!this.checkCoordinates(zeile)) return null;
        return this.brett[zeile];
    }

    public Feld[] getSpalte(int spalte) {
        if (!this.checkCoordinates(spalte)) return null;

        Feld[] neuSpalte = new Feld[size];
        for (int i = 0; i < neuSpalte.length; i++) {
            neuSpalte[i] = this.brett[i][spalte];
        }
        return neuSpalte;
    }

    public Feld[] getDiagonaleHaupt() {
        Feld[] diagMain = new Feld[3];

        for (int i = 0; i < diagMain.length; i++) {
            diagMain[i] = this.brett[i][i];
        }

        return diagMain;
    }

    public Feld[] getDiagonaleNeben() {
        Feld[] diagScnd = new Feld[3];

        for (int i = 0; i < diagScnd.length; i++) {
            diagScnd[i] = this.brett[this.size-1-i][i];
        }        
        return diagScnd;
    }
    
    public void brettAusgeben() {
        for (int i = 0; i < this.brett.length; i++) {
            for (int j = 0; j < this.brett.length; j++) {
                System.out.print(" " + this.brett[i][j].toString());
                if (j < this.size-1) {
                    System.out.print(" |");
                }
            }

            if (i < this.size-1) {
                System.out.print("\n---+---+---"); 
            }
            System.out.println();
        }
    }
}
