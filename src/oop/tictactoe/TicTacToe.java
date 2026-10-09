package oop.tictactoe;

public class TicTacToe {
    public static void main(String[] args) {
        Feld testfeld = new Feld();
        Spieler spieler1 = new Spieler("eins", 'X');
        // Spieler spieler2 = new Spieler("zwei", 'O');

        testfeld.besetzen(spieler1);
        System.out.println(testfeld.toString());
    }
}
