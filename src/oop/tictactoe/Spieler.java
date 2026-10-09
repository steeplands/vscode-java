package oop.tictactoe;

public class Spieler {
    private String name;
    private char symbol;

    public Spieler(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }
}
