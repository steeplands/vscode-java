package tortuga;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TheaterDataManager {
    public static boolean saveTheater(boolean[][] theater, String filename) {
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(theater.length + "\n");

            for (boolean[] row : theater) {
                for (boolean seat : row) {
                    if (seat)
                        writer.write("1");
                    else
                        writer.write("0");
                }
                writer.write("\n");
            }
            
            writer.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public static boolean[][] loadTheater(String filename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            int nrOfRows = Integer.parseInt(reader.readLine());
            boolean[][] newTheater = TheaterBookingCenter.createTheater(nrOfRows);

            for (int row = 0; row < newTheater.length; row++) {
                String rowBuf = reader.readLine();
                char[] seats = rowBuf.toCharArray();

                for (int seat = 0; seat < seats.length; seat++) {
                    if (seats[seat] == '1') {
                        TheaterBookingCenter.bookSeat(newTheater, row+1, seat+1);
                    }
                }
            }

            reader.close();
            return newTheater;
        } catch (IOException e) {
            return null;
        }
    }
}