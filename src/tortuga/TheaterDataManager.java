package tortuga;

import java.io.FileWriter;

public class TheaterDataManager {
    public static boolean saveTheater(boolean[][] theater, String filename) {
        try {
            FileWriter writer = new FileWriter(filename);

            writer.write(theater.length + "\n");
            
            for (boolean[] row : theater) {
                for (boolean seat : row) {
                    if (seat) writer.write("1");
                    else writer.write("0");
                }
                writer.write("\n");
            }
            
            writer.close();
            return true;            
        } catch (Exception e) {
            // e.printStackTrace();
            return false;
        }
    }

    public static boolean[][] loadTheater(String filename) {
        try {
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        int nrOfRows = 4; //read first line

        TheaterBookingCenter.createTheater(nrOfRows);
        return null;
    }
}