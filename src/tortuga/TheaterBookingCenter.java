package tortuga;

import helper.ANSI;
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
        if (row > theater.length || seat > theater[row - 1].length) {
            return false;
        } else if (theater[row - 1][seat - 1]) {
            return false;
        } else {
            theater[row - 1][seat - 1] = true;
            return true;
        }
    }

    public static int[] bookRandomSeat(boolean[][] theater) {
        if (getNumberOfUnbookedSeats(theater) == 0) {
            return null;
        }

        while (true) {
            int[] randomSeat = new int[2];
            randomSeat[0] = PRNG.randomInt(theater.length) + 1;
            randomSeat[1] = PRNG.randomInt(theater[randomSeat[0] - 1].length) + 1;

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
        boolean[][] saal = createTheater(5);
        
        while (run) {
            System.out.println("\nTheaterBookingCenter:");
            System.out.println("-------------------------");

            System.out.println(ANSI.ANSI_PURPLE + "C" + ANSI.ANSI_RESET + " | " + ANSI.ANSI_PURPLE + "Create Theater"   + ANSI.ANSI_RESET);
            System.out.println(ANSI.ANSI_BLUE +   "B" + ANSI.ANSI_RESET + " | " + ANSI.ANSI_BLUE   + "Book Seat"        + ANSI.ANSI_RESET);
            System.out.println(ANSI.ANSI_GREEN +  "R" + ANSI.ANSI_RESET + " | " + ANSI.ANSI_GREEN  + "Book Random Seat" + ANSI.ANSI_RESET);
            System.out.println(ANSI.ANSI_YELLOW + "S" + ANSI.ANSI_RESET + " | " + ANSI.ANSI_YELLOW + "Show Theater"     + ANSI.ANSI_RESET);
            System.out.println(ANSI.ANSI_RED +    "E" + ANSI.ANSI_RESET + " | " + ANSI.ANSI_RED    + "Exit"             + ANSI.ANSI_RESET);
            System.out.println();

            System.out.print("Enter your choice (" +
                ANSI.ANSI_PURPLE + "c" + ANSI.ANSI_RESET + "/" +
                ANSI.ANSI_BLUE +   "b" + ANSI.ANSI_RESET + "/" +
                ANSI.ANSI_GREEN +  "r" + ANSI.ANSI_RESET + "/" +
                ANSI.ANSI_YELLOW + "s" + ANSI.ANSI_RESET + "/" +
                ANSI.ANSI_RED +    "e" + ANSI.ANSI_RESET + "): "
            );

            char[] userInString = SavitchIn.readLine().toCharArray();

            char userIn = (userInString.length == 0) ? 'x' : userInString[0];
            userIn = Character.toLowerCase(userIn);

            switch (userIn) {
                case 'c' -> {
                    System.out.println(ANSI.ANSI_PURPLE + "Create Theater" + ANSI.ANSI_RESET);
                    System.out.print("Enter the number of rows: ");
                    int rows = SavitchIn.readLineInt();
                    saal = createTheater(rows);
                    System.out.println(ANSI.ANSI_GREEN + "---Theater overwritten -> now has " + rows + " rows." + ANSI.ANSI_RESET);
                }
                case 'b' -> {
                    System.out.println(ANSI.ANSI_BLUE + "Book Seat" + ANSI.ANSI_RESET);

                    System.out.print("Row: ");
                    int row = SavitchIn.readLineInt();
                    System.out.print("Seat: ");
                    int seat = SavitchIn.readLineInt();

                    boolean response = bookSeat(saal, row, seat);
                    if(response) {
                        System.out.println(ANSI.ANSI_GREEN + "---Seat " + row + "/" + seat + " booked." + ANSI.ANSI_RESET);
                    } else {
                        System.out.println(ANSI.ANSI_RED + "---Booking failed! " + "Seat already taken or non existent." + ANSI.ANSI_RESET);
                    }
                }
                case 'r' -> {
                    System.out.println(ANSI.ANSI_GREEN + "Book Random Seat" + ANSI.ANSI_RESET);
                    int[] newSeat = bookRandomSeat(saal);

                    if (newSeat != null) {
                        System.out.println(ANSI.ANSI_GREEN + "---Seat " + newSeat[1] + " booked in row " + newSeat[0] + ".");
                    } else {
                        System.out.println(ANSI.ANSI_RED + "---No available seats found." + ANSI.ANSI_RESET);
                    }
                }
                case 's' -> {
                    printTheater(saal);
                }
                case 'e' -> {
                    System.out.println(ANSI.ANSI_RED + "Exiting..." + ANSI.ANSI_RESET);
                    run = false;
                }
                default -> {
                    System.out.println(ANSI.ANSI_RED + "Invalid input! Please try again." + ANSI.ANSI_RESET);
                }
            }
        }
    }
}
