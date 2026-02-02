package tortuga;

import helper.ANSI;
import helper.PRNG;
import helper.SavitchIn;

public class MoritzSchiffe {
    static boolean SearchPos(char[][] array, char hidden, int length, int direction, int x, int y) {
        if (x >= array.length || y >= array.length || x < 0 || y < 0 || array[y][x] != '\u0000') {
            return false;
        }
        if (length <= 1) {
            array[y][x] = hidden;
            return true;
        }
        else {
            if (SearchPos(array, hidden, length - 1, direction, x + (direction%2 - direction/2), y + ((direction+1)%2 - direction/2))) {
                array[y][x] = hidden;
                return true;
            }
            else {
                return false;
            }
        }
    }

    static void printArray(char[][] array, char unknown, char hidden, char hit) {

        System.out.print("\n    ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf(" %2d ", 1 + i);
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.print("   ");
            for (int j = 4 * array.length; j >= 0; j--) {
                System.out.print("-");
            }
            System.out.printf("\n%2d  ", i+1);
            for (char value : array[i]) {
                if (value == hit) {
                    System.out.printf("| %s ", ANSI.ANSI_CYAN + hit + ANSI.ANSI_RESET);
                }
                else if (value == hidden || value == '\u0000') {
                    System.out.printf("| %s ", unknown);
                }
                else {
                    System.out.printf("| %s ", ANSI.ANSI_RED + value + ANSI.ANSI_RESET);
                }
            }
            System.out.println("|");
        }

        System.out.print("   ");
        for (int j = 4 * array.length + 1; j > 0; j--) {
            System.out.print("-");
        }
    }

    public static void PrintUI(int remShips, int remCanons) {
        if (remShips > 0 && remCanons > 0) {
            if (remShips > 6) {
                remShips = 6;
            }
            if (remCanons > 21) {
                remCanons = 21;
            }
            String[] ship = {
                    "     |     ",
                    "  ___|___  ",
                    " /   |   \\ ",
                    " \\___|___/ ",
                    "    \\_/    ",
                    ANSI.ANSI_CYAN + "   ~ ~ ~   " + ANSI.ANSI_RESET
            };
            System.out.printf("Schiffe: %d\n", remShips);
            /*
            for (int x = 0; x < ship.length; x++) {
                for (int i = 0; i < remShips; i++) {
                    System.out.printf("       %s", ship[x]);
                }
                System.out.println();
            }
             */
            System.out.printf("Kanonenkugeln: %d\n", remCanons);
            String[] canons = new String[findMaxSum(remCanons)];
            for (int i = 0; i < canons.length; i++) {
                canons[i] = "";
                for (int j = 0; j <= canons.length - i - 1; j++) {
                    canons[i] += " ";
                }
            }
            for (int i = 0; i < canons.length; i++) {
                for (int j = 0; j < canons.length - i; j++) {
                    canons[canons.length - i - 1] += ANSI.ANSI_YELLOW + ((remCanons > 0) ? " o" : "") + ANSI.ANSI_RESET;
                    remCanons--;
                }
                canons[canons.length - i - 1] += " ";
            }
            for (int i = 0; i < canons.length; i++) {
                for (int j = 0; j < i; j++) {
                    canons[i] += " ";
                }
            }
            for (int x = 0; x < ship.length || x < canons.length; x++) {
                for (int i = 0; i < ship.length && remShips > i; i++) {
                    if (ship.length > x) {
                        System.out.printf("    %s    ", ship[x]);
                    }
                }
                if (ship.length - canons.length <= x) {
                    System.out.print(canons[x - ship.length + canons.length]);
                }
                System.out.println();
            }


        }
    }

    public static int findMaxSum(int x) {
        int sum = 0;
        int ref = 0;
        while (sum < x) {
            sum+=ref++;
        }
        return ref - 1;
    }
    
    public static void main(String[] args) {
        int mapsize;
        do {
            System.out.println("Größe des Spielfeldes");
            mapsize = SavitchIn.readLineInt();
        } while (mapsize < 6 || mapsize > 20);

        char hidden = 'h';
        char hit = 'x';
        char miss = 'o';
        char unknown = ' ';

        int[][] ships = new int[3][(mapsize-1)/3*3];
        char[][] map = new char[mapsize][mapsize];

        int remShip = 0;
        int remAttemps = (mapsize*mapsize/3);

        for (int i = 4; i >= 2; i--) {
            for (int j = 0; j < (mapsize-i-2)/3+1; j++) {
                while (true) {
                    int direction = PRNG.randomInt(4);
                    int x = PRNG.randomInt(mapsize);
                    int y = PRNG.randomInt(mapsize);
                    if (SearchPos(map, hidden, i, direction, x, y)) {
                        remShip ++;
                        ships[i-2][3*j+2] = i;
                        ships[i-2][3*j] = x + y * mapsize;
                        ships[i-2][3*j+1] = (x + (i-1) * (direction%2 - direction/2) + mapsize * (y + (i-1) * ((direction+1)%2 - direction/2)));
                        break;
                    }
                }
            }
        }

        PrintUI(remShip, remAttemps);
        while (remShip > 0 && remAttemps > 0) {
            printArray(map, unknown, hidden, hit);
            System.out.print("\nX | Y; X: ");
            int x = SavitchIn.readLineInt() - 1;
            System.out.printf("%d | Y; Y: ", x+1);
            int y = SavitchIn.readLineInt() - 1;

            if ((x >= mapsize || y >= mapsize || map[y][x] == miss | map[y][x] == hit)) {
                System.out.println("No valid input!");
                continue;
            }
            System.out.printf("%d | %d: %c\n", x+1, y+1, (map[y][x] == hidden) ? hit : miss);
            if (map[y][x] == hidden) {
                map[y][x] = hit;

                for (int j = 0; j < ships.length; j++) {
                    for (int i = 0; i < ((mapsize-j-1) / 3); i++) {
                        if (ships[j][3*i] % mapsize == ships[j][1+3*i] % mapsize && ships[j][i] % mapsize == x) {
                            if ((ships[j][3*i] / mapsize - y) * (y - ships[j][1+3*i] / mapsize) >= 0) {
                                ships[j][2+3*i]--;
                                if (ships[j][2+3*i] == 0) {
                                    remShip--;
                                    break;
                                }
                            }
                        } else if (ships[j][3*i] / mapsize == ships[j][1+3*i] / mapsize && ships[j][3*i] / mapsize == y) {
                            if ((ships[j][3*i] % mapsize - x) * (x - ships[j][1+3*i] % mapsize) >= 0) {
                                ships[j][2+3*i]--;
                                if (ships[j][2+3*i] == 0) {
                                    remShip--;
                                    break;
                                }
                            }
                        }
                    }
                }
            } else {
                map[y][x] = miss;
                remAttemps--;
            }
            PrintUI(remShip, remAttemps);
        }
        if (remShip == 0) {
            System.out.println(ANSI.ANSI_GREEN + "\nYou win!" + ANSI.ANSI_GREEN);
        }
        if (remAttemps == 0) {
            System.out.println(ANSI.ANSI_RED + "\nYou loose!" + ANSI.ANSI_RESET);
        }
        printArray(map, unknown, hidden, hit);
    }
}
