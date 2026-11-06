package oop.tictacgui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class TicTacToeGUI extends JFrame {

    private static final int GAP = 5;
    private static final int BUTTON_SIZE = 100;

    private JButtonTicTacToe[][] boardButtons;
    private Game game;

    public TicTacToeGUI() {
        super("TicTacToe das Spiel");

        ImageIcon img = new ImageIcon("res/tictactoe/HTBLuVA_Salzburg_Logo.jpg");
        this.setIconImage(img.getImage());

        this.initFrame();
        this.initGame();
    }

    private void initFrame() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(TicTacToeGUI.GAP, TicTacToeGUI.GAP));
        //mainPanel.setBackground(Color.YELLOW);
        mainPanel.setBorder(new EmptyBorder(TicTacToeGUI.GAP, TicTacToeGUI.GAP, TicTacToeGUI.GAP, TicTacToeGUI.GAP));
        this.setContentPane(mainPanel);

        JPanel boardPanel = new JPanel();
        boardPanel.setBackground(Color.BLACK);
        mainPanel.add(boardPanel, BorderLayout.NORTH);

        JPanel ctrlPanel = new JPanel();
        //ctrlPanel.setBackground(Color.RED);
        mainPanel.add(ctrlPanel, BorderLayout.SOUTH);

        int size = 3;
        this.boardButtons = new JButtonTicTacToe[size][size];
        boardPanel.setLayout(new GridLayout(size, size, TicTacToeGUI.GAP, TicTacToeGUI.GAP));
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                JButtonTicTacToe newButton = new JButtonTicTacToe(i, j, TicTacToeGUI.BUTTON_SIZE);
                this.boardButtons[i][j] = newButton;
                newButton.addActionListener(e -> this.actionOnBoardButtonPressed(newButton));
                boardPanel.add(newButton);
            }
        }

        ctrlPanel.setLayout(new GridLayout(1, 2, TicTacToeGUI.GAP, TicTacToeGUI.GAP));
        JButton resetButton = new JButton();
        resetButton.setText("Reset");
        resetButton.setPreferredSize(new Dimension(1, TicTacToeGUIReference.BUTTON_SIZE / 2));
        resetButton.addActionListener(e -> this.resetGame());
        ctrlPanel.add(resetButton);

        JButton exitButton = new JButton();
        exitButton.setText("Exit");
        exitButton.setPreferredSize(new Dimension(1, TicTacToeGUIReference.BUTTON_SIZE / 2));
        exitButton.addActionListener(e -> System.exit(0));
        ctrlPanel.add(exitButton);
    }

    private void initGame() {
        this.game = new Game("Spieler 1", "Spieler 2");
    }

    private void resetGame() {
        this.resetBoardButtons();
        this.initGame();
    }

    private void actionOnBoardButtonPressed(JButtonTicTacToe button) {
        if (this.game.placeToken(button.ROW, button.COL)) {
            if (this.game.getPlayerToken() == Game.TOKEN_FIRST_PLAYER) {
                button.setPlayer1();
            } else {
                button.setPlayer2();
            }
        }

        if (this.game.checkIfStoneWinsGame(button.ROW, button.COL)) {
            JOptionPane.showConfirmDialog(null, String.format("%s hat gewonnen!!!", this.game.getPlayerName()), "SIEG", JOptionPane.DEFAULT_OPTION);
            this.disableBoardButtons();
        } else if (this.game.noFurtherMovesPossible()) {
            JOptionPane.showConfirmDialog(null, "Unentschieden", "UNENTSCHIEDEN", JOptionPane.DEFAULT_OPTION);
            this.disableBoardButtons();
        } else {
            this.game.changePlayer();
        }
    }

    private void disableBoardButtons() {
        for (JButton[] row : this.boardButtons) {
            for (JButton button : row) {
                button.setEnabled(false);
            }
        }
    }

    private void resetBoardButtons() {
        for (JButtonTicTacToe[] row : this.boardButtons) {
            for (JButtonTicTacToe button : row) {
                button.setFree();
                button.setEnabled(true);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new TicTacToeGUI();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500, 500);
        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        //frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }
}
