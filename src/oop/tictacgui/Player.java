package oop.tictacgui;

public class Player {
    private final String name;
    private final char token;

    public Player(String name, char token) {
        this.name = name;
        this.token = token;
    }

    public String getName() {
        return this.name;
    }

    public char getToken() {
        return this.token;
    }

    @Override
    public String toString() {
        return String.format("%s (%c)", this.getName(), this.getToken());
    }
}
