package tortuga;

// Schiffeversenken
// leeres feld ' '
// Schiff 'S'
// Hit 'X'
// Schuss ins Wasser 'o'

public class Schiffeversenken {
    public static void main(String[] args) {
        char[][] field = new char[7][7];
        
        // Initialize the field
        for(int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = ' ';
            }
        }

        char field1[] = {' ', 'A', 'B', 'C', 'D', 'E', 'F'};
        char field2[] = {' ', '1', '2', '3', '4', '5', '6'};
        
        for (int i = 0; i < field1.length; i++) {
            field[0][i] = field1[i];
            field[i][0] = field2[i];
        }

        // Menu for debug or normal mode
        boolean debug = false;
        while (true) {
            System.out.println("Choose mode:");
            System.err.println("n | Normal (hide ships)");
            System.out.println("d | Debug  (shows ship positions)");
            System.out.println("* | any other key to quit");
            System.out.print("Enter n/d: ");
            String choice = helper.SavitchIn.readLine();
            if (choice == null) return;
            choice = choice.trim();
            if (choice.equals("d") || choice.equalsIgnoreCase("debug")) {
                debug = true;
                break;
            } else if (choice.equals("n") || choice.equalsIgnoreCase("normal")) {
                debug = false;
                break;
            } else {
                System.out.println("Exiting game.");
                return;
            }
        }

        // Place ships
        placeShips(field, debug);

        // Game loop
        boolean gameRunning = true;
        while (gameRunning) {
            printField(field, debug);
            System.out.print("Enter your shot (e.g., A1) or Q to quit: ");
            String shot = helper.SavitchIn.readLine();
            if (shot == null) break;
            gameRunning = takeShot(field, shot, debug);
        }

        System.out.println("Game Over!");
    }

    private static void placeShips(char[][] field, boolean debug) {
        int numberOfShips = helper.PRNG.randomInt(8) + 1; // Number of ships to place
        int placedShips = 0;

        System.out.println();
        System.out.println("----------------------------");

        while (placedShips < numberOfShips) {
            int row = helper.PRNG.randomInt(6) + 1; // Random row (1-6)
            int col = helper.PRNG.randomInt(6) + 1; // Random column (1-6)

            if (field[row][col] == ' ') { // Check if the position is empty
                field[row][col] = 'S'; // Place the ship
                placedShips++;
                if (debug) {
                    System.out.println("Ship placed at " + (char) ('A' + col - 1) + row); // Print ship position in debug mode
                }
            }
        }
    }

    private static void printField(char[][] field, boolean debug) {
        for (char[] row : field) {
            for (char cell : row) {
                char toPrint = cell;
                if (cell == 'S' && !debug) {
                    toPrint = ' ';
                }
                System.out.print(toPrint + "  ");
            }
            System.out.println();
        }
    }

    private static boolean takeShot(char[][] field, String shot, boolean debug) {
        shot = shot.toUpperCase().trim(); // Convert input to uppercase and trim

        if (shot.equals("Q")) {
            System.out.println("Quitting game.");
            return false;
        }

        if (shot.length() < 2) {
            System.out.println("Invalid input. Use format like A1.");
            return true;
        }

        char colChar = shot.charAt(0);
        char rowChar = shot.charAt(1);

        if (colChar < 'A' || colChar > 'F' || rowChar < '1' || rowChar > '6') {
            System.out.println("Invalid coordinates. Use A-F and 1-6.");
            return true;
        }

        int col = colChar - 'A' + 1; // Convert to array index
        int row = rowChar - '1' + 1; // Convert to array index

        if (field[row][col] == 'S') {
            field[row][col] = 'X'; // Hit
            System.out.println("Hit!");
        } else if (field[row][col] == ' ') {
            field[row][col] = 'o'; // Miss
            System.out.println("Miss!");
        } else if (field[row][col] == 'X' || field[row][col] == 'o') {
            System.out.println("You already shot here!");
        } else {
            System.out.println("Invalid shot.");
        }

        System.out.println("----------------------------");
        System.out.println();

        // Check for game over condition (all ships sunk)
        if (isGameOver(field)) {
            System.out.println("All ships sunk!");
            return false;
        }
        return true;
    }

    private static boolean isGameOver(char[][] field) {
        for (int i = 1; i < field.length; i++) {
            for (int j = 1; j < field[i].length; j++) {
                if (field[i][j] == 'S') {
                    return false; // There are still ships
                }
            }
        }
        return true; // All ships sunk
    }
}