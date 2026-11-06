package oop.tictacgui;

public class Field {
    private Player player;

    public Field() {
    }

    public boolean isEmpty() {
        return this.player == null;
    }

    public boolean isTakenByPlayer(Player player) {
        return this.player == player;
    }

    public boolean setPlayer(Player player) {
        if (this.isEmpty()) {
            this.player = player;
            return true;
        }
        return false;
    }

    public char getToken() {
        if (this.isEmpty()) {
            return '-';
        } else {
            return this.player.getToken();
        }
    }
}
