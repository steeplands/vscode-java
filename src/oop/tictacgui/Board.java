package oop.tictacgui;

public class Board {
    private Field[][] board;

    public Board() {
        this.board = new Field[3][3];
        for (int rowIdx = 0; rowIdx < this.getNrOfRows(); rowIdx++) {
            for (int colIdx = 0; colIdx < this.getNrOfCols(); colIdx++) {
                this.board[rowIdx][colIdx] = new Field();
            }

        }
    }

    public int getNrOfRows() {
        return this.board.length;
    }

    public int getNrOfCols() {
        return this.board[0].length;
    }

    public Field[] getRow(int rowIdx) {
        if (rowIdx >= 0 && rowIdx < this.getNrOfRows())
            return this.board[rowIdx];
        else return null;
    }

    public Field[] getCol(int colIdx) {
        if (colIdx >= 0 && colIdx < this.getNrOfCols()) {
            Field[] column = new Field[this.getNrOfCols()];
            for (int rowIdx = 0; rowIdx < this.getNrOfRows(); rowIdx++) {
                column[rowIdx] = this.board[rowIdx][colIdx];
            }
            return column;
        } else return null;
    }

    public Field[] getMainDiagonal() {
        Field[] diagonal = new Field[this.getNrOfRows()];
        for (int idx = 0; idx < this.getNrOfRows(); idx++) {
            diagonal[idx] = this.board[idx][idx];
        }
        return diagonal;
    }

    public Field[] getSecondaryDiagonal() {
        Field[] diagonal = new Field[this.getNrOfRows()];
        for (int idx = 0; idx < this.getNrOfRows(); idx++) {
            diagonal[idx] = this.board[idx][this.getNrOfCols() - 1 - idx];
        }
        return diagonal;
    }

    public boolean emptyFieldExists() {
        for (Field[] row : this.board) {
            for (Field field : row) {
                if (field.isEmpty())
                    return true;
            }
        }
        return false;
    }

    public boolean fieldExists(int rowIdx, int colIdx) {
        return rowIdx >= 0 && rowIdx < this.board.length && colIdx >= 0 && colIdx < this.board[rowIdx].length;
    }

    public boolean placeToken(Player player, int rowIdx, int colIdx) {
        if (this.fieldExists(rowIdx, colIdx)) {
            return this.board[rowIdx][colIdx].setPlayer(player);
        }
        return false;
    }

    public void printBoard() {
        System.out.println("  0 1 2");
        for (int rowIdx = 0; rowIdx < this.getNrOfRows(); rowIdx++) {
            System.out.printf("%d ", rowIdx);
            for (int colIdx = 0; colIdx < this.getNrOfCols(); colIdx++) {
                System.out.printf("%c ", this.board[rowIdx][colIdx].getToken());
            }
            System.out.println();
        }
    }
}
