package oop.tictacgui;

import javax.swing.*;
import java.awt.*;

public class JButtonTicTacToe extends JButton {

    private final Icon iconEmpty;
    private final Icon iconFirstPlayer;
    private final Icon iconSecondPlayer;

    public final int ROW;
    public final int COL;

    public JButtonTicTacToe(int row, int col, int size) {
        this.ROW = row;
        this.COL = col;

        this.setText("");
        this.setBackground(Color.WHITE);
        this.setBorderPainted(false);
        this.setPreferredSize(new Dimension(size, size));

        this.iconEmpty = this.createImageIcon("res/tictactoe/empty.png");
        this.iconFirstPlayer = this.createImageIcon("res/tictactoe/cross.png");
        this.iconSecondPlayer = this.createImageIcon("res/tictactoe/circle.png");

        this.setFree();
    }

    private ImageIcon createImageIcon(String filename) {
        ImageIcon imageIcon = new ImageIcon(filename);
        Image image = imageIcon.getImage();
        Image newImg = image.getScaledInstance(this.getPreferredSize().width, this.getPreferredSize().height, java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(newImg);
    }

    public void setFree() {
        this.setIcon(this.iconEmpty);
    }

    public void setPlayer1() {
        this.setIcon(this.iconFirstPlayer);
    }

    public void setPlayer2() {
        this.setIcon(this.iconSecondPlayer);
    }
}