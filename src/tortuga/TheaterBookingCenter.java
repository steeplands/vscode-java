package tortuga;

import java.util.Arrays;

import helper.PRNG;
import helper.SavitchIn;

public class TheaterBookingCenter {
    public static boolean[][] createTheater(int nrOfRows) {
        boolean[][] theater = new boolean[nrOfRows][];
        for (int i = 0; i < theater.length; i++) {
            theater[i] = new boolean[3 + i];
        }
        return theater;
    }

    public static int getNumberOfAllSeats(boolean[][] theater) {
        int allSeats = 0;
        for (boolean[] row : theater) {
            allSeats += row.length;
        }
        return allSeats;
    }

    public static int getNumberOfUnbookedSeats(boolean[][] theater) {
        int unbookedSeats = 0;
        for (boolean[] row : theater) {
            for (boolean seat : row) {
                if (!seat) {
                    unbookedSeats++;
                }
            }
        }
        return unbookedSeats;
    }

    public static int getNumberOfBookedSeats(boolean[][] theater) {
        int bookedSeats = 0;
        for (boolean[] row : theater) {
            for (boolean seat : row) {
                if (seat) {
                    bookedSeats++;
                }
            }
        }
        return bookedSeats;
    }

    public static boolean bookSeat(boolean[][] theater, int row, int seat) {
        if (row >= theater.length || seat >= theater[row - 1].length) {
            return false;
        } else if (theater[row - 1][seat - 1]) {
            return false;
        } else {
            theater[row - 1][seat - 1] = true;
            return true;
        }
    }

    public static int[] bookRandomSeat(boolean[][] theater) {
        if (getNumberOfBookedSeats(theater) == 0) {
            return null;
        }

        while (true) {
            int[] randomSeat = new int[2];
            randomSeat[0] = PRNG.randomInt(theater.length - 1) + 1;
            randomSeat[1] = PRNG.randomInt(theater[randomSeat[0]].length - 1) + 1;

            if (bookSeat(theater, randomSeat[0], randomSeat[1])) {
                return randomSeat;
            }
        }
    }

    public static void printTheater(boolean[][] theater) {
        System.out.println("Theater with " + theater.length + " rows");
        System.out.println("Available seats: " + getNumberOfAllSeats(theater));
        System.out.println("    BOOKED: " + getNumberOfBookedSeats(theater));
        System.out.println("    FREE: " + getNumberOfUnbookedSeats(theater));

        // theater.length * System.out.print(" ");
        for (int i = (theater.length - 1); i >= 0; i--) {

            // -1 für index
            // -3 für mind. Sitze
            for (int j = 0; j < theater[theater.length - 1 - i].length - 3; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < theater[i].length; j++) {
                if (theater[i][j]) {
                    System.out.print("# ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print(
            "████████╗██╗  ██╗███████╗ █████╗ ████████╗███████╗██████╗ \r\n" + //
            "╚══██╔══╝██║  ██║██╔════╝██╔══██╗╚══██╔══╝██╔════╝██╔══██╗\r\n" + //
            "   ██║   ███████║█████╗  ███████║   ██║   █████╗  ██████╔╝\r\n" + //
            "   ██║   ██╔══██║██╔══╝  ██╔══██║   ██║   ██╔══╝  ██╔══██╗\r\n" + //
            "   ██║   ██║  ██║███████╗██║  ██║   ██║   ███████╗██║  ██║\r\n" + //
            "   ╚═╝   ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝   ╚═╝   ╚══════╝╚═╝  ╚═╝\r\n" + //
            "\r\n" + //
            "██████╗  ██████╗  ██████╗ ██╗  ██╗██╗███╗   ██╗ ██████╗ \r\n" + //
            "██╔══██╗██╔═══██╗██╔═══██╗██║ ██╔╝██║████╗  ██║██╔════╝ \r\n" + //
            "██████╔╝██║   ██║██║   ██║█████╔╝ ██║██╔██╗ ██║██║  ███╗\r\n" + //
            "██╔══██╗██║   ██║██║   ██║██╔═██╗ ██║██║╚██╗██║██║   ██║\r\n" + //
            "██████╔╝╚██████╔╝╚██████╔╝██║  ██╗██║██║ ╚████║╚██████╔╝\r\n" + //
            "╚═════╝  ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝╚═╝  ╚═══╝ ╚═════╝ \r\n" + //
            "\r\n" + //
            " ██████╗███████╗███╗   ██╗████████╗███████╗██████╗ \r\n" + //
            "██╔════╝██╔════╝████╗  ██║╚══██╔══╝██╔════╝██╔══██╗\r\n" + //
            "██║     █████╗  ██╔██╗ ██║   ██║   █████╗  ██████╔╝\r\n" + //
            "██║     ██╔══╝  ██║╚██╗██║   ██║   ██╔══╝  ██╔══██╗\r\n" + //
            "╚██████╗███████╗██║ ╚████║   ██║   ███████╗██║  ██║\r\n" + //
            " ╚═════╝╚══════╝╚═╝  ╚═══╝   ╚═╝   ╚══════╝╚═╝  ╚═╝\r\n" + //
            "");
        System.out.print("Press ENTER...");
        SavitchIn.readLine();

        boolean run = true;
        
        while (run) {
            System.out.println("\nTheaterBookingCenter:");
            System.out.println("-------------------------");
            System.out.println("c | Create Theater");
            System.out.println("b | Book Seat");
            System.out.println("r | Book Random Seat");
            System.out.println("t | Show Theater");
            System.out.println("e | Exit");
            System.out.println();
            System.out.print("Enter your choice (c/b/r/t/e): ");

            char userIn = SavitchIn.readChar();

            run = (userIn == 'e') ? false : true;
        }
        


        System.out.print("Enter Theater size: ");
        createTheater(SavitchIn.readLineInt());
        boolean[][] saal = createTheater(8);

        bookSeat(saal, 1, 1);

        for (boolean[] bs : saal) {
            System.out.println(Arrays.toString(bs));
            System.out.println();
        }

        System.out.println(Arrays.toString(bookRandomSeat(saal)));

        for (boolean[] bs : saal) {
            System.out.println(Arrays.toString(bs));
            System.out.println();
        }

        printTheater(saal);
    }
}
