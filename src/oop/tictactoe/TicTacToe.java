package oop.tictactoe;

public class TicTacToe {
    public static void main(String[] args) {
        Feld testfeld = new Feld();
        System.out.println("<" + testfeld.getSymbol() + ">");
        Spieler spieler1 = new Spieler("eins", 'X');
        Spieler spieler2 = new Spieler("zwei", 'O');

        System.out.printf("besetzt?: %b\n", testfeld.besetzen(null));
        System.out.printf("besetzt?: %b, besetzt von: %s\n", testfeld.besetzen(spieler1), testfeld.getSpieler().getName());
        System.out.printf("besetzt?: %b, besetzt von: %s\n\n", testfeld.besetzen(spieler2), testfeld.getSpieler().getName());
        
        System.out.println(testfeld.toString());
        System.out.println("<" + testfeld.getSymbol() + ">");

        Spielbrett brett = new Spielbrett();

        brett.brettAusgeben();
        System.out.println();

        brett.steinSetzen(0, 0, spieler1);
        brett.steinSetzen(1, 1, spieler2);
        brett.steinSetzen(2, 1, spieler1);

        brett.brettAusgeben();
        System.out.println();
    }
}
