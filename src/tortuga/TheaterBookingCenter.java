package tortuga;

import java.util.Arrays;

import helper.PRNG;

public class TheaterBookingCenter {
    public static boolean[][] createTheater(int nrOfRows) {
        boolean[][] theater = new boolean[nrOfRows][];
        for (int i = 0; i < theater.length; i++) {
            theater[i] = new boolean[ 3 + i ];
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
                if(!seat) {
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
                if(seat) {
                    bookedSeats++;
                }
            }
        }
        return bookedSeats;
    }

    public static boolean bookSeat(boolean[][] theater, int row, int seat) {
        if(row >= theater.length || seat >= theater[row - 1].length) {
            return false;
        } else if(theater[row - 1][seat - 1]) {
            return false;
        } else {
            theater[row - 1][seat - 1] = true;
            return true;
        }
    }

    public static int[] bookRandomSeat(boolean[][] theater) {
        if(getNumberOfBookedSeats(theater) == 0) {
            return null;
        }

        while (true) {
            int[] randomSeat = new int[2];
            randomSeat[0] = PRNG.randomInt(theater.length - 1) + 1;
            randomSeat[1] = PRNG.randomInt(theater[randomSeat[0]].length - 1) + 1;

            if ( bookSeat(theater, randomSeat[0], randomSeat[1])) {
                return randomSeat;
            }
        }
    }

    public static void main(String[] args) {
        boolean[][] saal = createTheater(5);
        
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

        System.out.println(getNumberOfAllSeats(saal));
        System.out.println(getNumberOfBookedSeats(saal));
        System.out.println(getNumberOfUnbookedSeats(saal));
    }
}
