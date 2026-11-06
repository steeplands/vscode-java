package oop.tictacgui;

import helper.SavitchIn;

public class Game {
    private final Board board;
    private final Player firstPlayer;
    private final Player secondPlayer;
    private Player currentPlayer;

    public static final char TOKEN_FIRST_PLAYER = 'x';
    public static final char TOKEN_SECOND_PLAYER = 'o';

    public Game(String nameFirstPlayer, String nameSecondPlayer) {
        if (nameFirstPlayer.equals(nameSecondPlayer)) {
            nameFirstPlayer += " (1)";
            nameSecondPlayer += " (2)";
        }

        this.firstPlayer = new Player(nameFirstPlayer, Game.TOKEN_FIRST_PLAYER);
        this.secondPlayer = new Player(nameSecondPlayer, Game.TOKEN_SECOND_PLAYER);

        this.board = new Board();

        this.currentPlayer = this.firstPlayer;
    }

    public boolean placeToken(int row, int col) {
        return this.board.placeToken(this.currentPlayer, row, col);
    }

    public String getPlayerName() {
        return this.currentPlayer.getName();
    }

    public char getPlayerToken() {
        return this.currentPlayer.getToken();
    }

    public void changePlayer() {
        if (this.currentPlayer == this.firstPlayer) this.currentPlayer = this.secondPlayer;
        else this.currentPlayer = firstPlayer;
    }

    private boolean checkForWin(Field[] fields) {
        for (Field field : fields)
            if (!field.isTakenByPlayer(this.currentPlayer)) {
                return false;
            }
        return true;
    }

    public boolean checkIfStoneWinsGame(int rowIdx, int colIdx) {
        if (this.checkForWin(this.board.getRow(rowIdx))) {
            return true;
        }
        if (this.checkForWin(this.board.getCol(colIdx))) {
            return true;
        }
        if (rowIdx == colIdx && this.checkForWin(this.board.getMainDiagonal())) {
            return true;
        }
        if ((rowIdx + colIdx) == 2 && this.checkForWin(this.board.getSecondaryDiagonal())) {
            return true;
        }
        return false;
    }

    public boolean noFurtherMovesPossible() {
        return !this.board.emptyFieldExists();
    }

    public void play() {
        while (this.board.emptyFieldExists()) {
            this.board.printBoard();

            System.out.printf("%s ist am Zug ...\n", this.currentPlayer);
            int row, col;
            do {
                System.out.print("Wähle eine Reihe:  ");
                row = SavitchIn.readLineInt();
                System.out.print("Wähle eine Spalte: ");
                col = SavitchIn.readLineInt();
            } while (!this.board.placeToken(this.currentPlayer, row, col));

            if (this.checkIfStoneWinsGame(row, col)) {
                System.out.printf("Gratuliere %s, du hast gewonnen !!!\n", this.currentPlayer);
                break;
            }

            if (this.noFurtherMovesPossible()) {
                System.out.println("Das Spiel endet mit einem Unentschieden");
                break;
            }

            this.changePlayer();
        }
        this.board.printBoard();
    }
}
