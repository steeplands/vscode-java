package tortuga;

import helper.PRNG;
// import helper.SavitchIn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MoritzMindow {

    private JFrame frame;
    private JButton[][] buttons;
    private char[][] userInterface;
    private int[][] map;


    private int width = 8;
    private int mines = 10;
    private int undiscoverd;
    private int rows;
    private int cols;

    // private char mine = 'o';
    private char flag = 'F';


    public void MindowGUI(char[][] userInterface, int[][] map) {
        this.map = map;
        this.userInterface = userInterface;
        this.rows = userInterface.length;
        this.cols = userInterface[0].length;

        createWindow();
    }

    private void createWindow() {
        frame = new JFrame("Minesweeper");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(rows + 1, cols + 1));

        buttons = new JButton[rows][cols];

        gridPanel.add(new JLabel(""));

        for (int x = 0; x < cols; x++) {
            JLabel label = new JLabel(String.valueOf(x + 1), SwingConstants.CENTER);
            label.setFont(new Font("Arial", Font.BOLD, 14));
            gridPanel.add(label);
        }

        for (int y = 0; y < rows; y++) {

            JLabel rowLabel = new JLabel(String.valueOf(y + 1), SwingConstants.CENTER);
            rowLabel.setFont(new Font("Arial", Font.BOLD, 14));
            gridPanel.add(rowLabel);

            for (int x = 0; x < cols; x++) {

                JButton button = new JButton();
                button.setFont(new Font("Arial", Font.BOLD, 16));

                // int finalY = y;
                // int finalX = x;

                int finalX1 = x;
                int finalY1 = y;
                button.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        if (undiscoverd == 0) {
                            System.exit(0);
                        }
                        if (SwingUtilities.isRightMouseButton(e)) {
                            if (userInterface[finalY1][finalX1] == flag) {
                                mines++;
                                undiscoverd++;
                                userInterface[finalY1][finalX1] = '\u0000';
                            }
                            else if (userInterface[finalY1][finalX1] == '\u0000'){
                                userInterface[finalY1][finalX1] = flag;
                                mines--;
                                undiscoverd--;
                                //System.out.println(undiscoverd);
                            }
                        }
                        else if (SwingUtilities.isLeftMouseButton(e)) {
                            if (map[finalY1][finalX1] == -1 && userInterface[finalY1][finalX1] != flag) {
                                //System.out.println("\nYou loose!");
                                undiscoverd = 0;
                            }
                            else if (userInterface[finalY1][finalX1] == '\u0000') {
                                discoverCell(map, userInterface, finalY1, finalX1);
                            }
                        }
                        updateBoard();
                    }
                });

                buttons[y][x] = button;
                gridPanel.add(button);
            }
        }

        frame.add(gridPanel, BorderLayout.CENTER);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        updateBoard();
    }

    public void updateBoard() {
        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < cols; x++) {

                char value = userInterface[y][x];
                JButton button = buttons[y][x];
                int number = map[y][x];

                if (undiscoverd == 0) {
                    if (number == -1) {
                        if (value == flag) {
                            button.setBackground(Color.GREEN);
                        }
                        else {
                            button.setBackground(Color.RED);
                        }
                    }
                    else if (value == flag) {
                        button.setBackground(Color.MAGENTA);
                    }
                    else if (number > 0) {
                        button.setBackground(new Color(0xc0c0c0));
                    }
                    else {
                        button.setBackground(Color.WHITE);
                    }
                }
                else {
                    switch (userInterface[y][x]) {
                        case 'F' -> button.setBackground(new java.awt.Color(0x00FFFF));
                        case ' ' -> button.setBackground(new java.awt.Color(0xFFC0C0C0, true));
                        case '1' -> button.setBackground(new java.awt.Color(0xFFE000));
                        case '2' -> button.setBackground(new java.awt.Color(0xFFC000));
                        case '3' -> button.setBackground(new java.awt.Color(0xFFA000));
                        case '4' -> button.setBackground(new java.awt.Color(0xFF8000));
                        case '5' -> button.setBackground(new java.awt.Color(0xFF6000));
                        case '6' -> button.setBackground(new java.awt.Color(0xFF4000));
                        case '7' -> button.setBackground(new java.awt.Color(0xFF2000));
                        case '8' -> button.setBackground(new java.awt.Color(0xFF0000));
                        default  -> button.setBackground(new java.awt.Color(0xFFFFFF));
                    }
                }
                if (value == '\u0000') {
                    buttons[y][x].setText("");
                } else {
                    buttons[y][x].setText(String.valueOf(value));
                }
            }
        }
    }

    public static int[][] findNeigbours(int[][] map, int y, int x) {
        int neighbours = 8;
        if (x == 0 || x == map[y].length-1 || y == 0 || y == map.length - 1) {
            neighbours = 5;
        }
        if ((x == 0 || x == map[y].length-1) && (y == 0 || y == map.length - 1)) {
            neighbours = 3;
        }
        int pos = 0;
        int[][] list = new int[neighbours][2];

        if (x != 0) {
            list[pos++] = new int[]{y, x-1};
            if (y != 0){
                list[pos++] = new int[]{y-1, x-1};
            }
        }
        if (y != 0) {
            list[pos++] = new int[]{y-1, x};
            if (x != map[y].length-1) {
                list[pos++] = new int[]{y-1, x+1};
            }
        }
        if (x != map[y].length - 1) {
            list[pos++] = new int[]{y, x+1};
            if (y != map.length - 1) {
                list[pos++] = new int[]{y+1, x+1};
            }
        }
        if (y != map.length - 1) {
            list[pos++] = new int[]{y+1, x};
            if (x != 0) {
                list[pos] = new int[]{y+1, x-1};
            }
        }
        return list;
    }

    public void discoverCell(int[][] map, char[][] userInterface, int y, int x)  {
        if (map[y][x] == 0) {
            userInterface[y][x] = ' ';
            for (int[] j : findNeigbours(map, y, x)) {
                if (userInterface[j[0]][j[1]] == '\u0000') {
                    discoverCell(map, userInterface, j[0], j[1]);
                }
            }
        }
        else if (userInterface[y][x] == '\u0000') {
            userInterface[y][x] = (char)('0' + (map[y][x]));
        }
        undiscoverd--;
        //System.out.println(undiscoverd);
    }

    public static void PlaceRandomMine(int[][] map) {
        int y = PRNG.randomInt(map.length);
        int x = PRNG.randomInt(map[y]. length);
        if (map[y][x] != -1) {
            map[y][x] = -1;
            for (int[] j : findNeigbours(map, y, x)) {
                map[j[0]][j[1]] += (map[j[0]][j[1]] == -1) ? 0 : 1;
            }
        }
        else {
            PlaceRandomMine(map);
        }
    }
    public static void main(String[] args) {
        MoritzMindow game = new MoritzMindow();
        int length = 8;
        game.undiscoverd = length * game.width;
        int[][] map = new int[length][game.width];

        char[][] userInterface = new char[length][game.width];

        for (int i = 0; i < game.mines; i++) {
            PlaceRandomMine(map);
        }
        game.MindowGUI(userInterface, map);
    }
}