package files;

import java.io.FileWriter;
import java.io.IOException;

import helper.SavitchIn;

public class WriteTextfile {
    public static void main(String[] args) {

        String path = "res/einkauf.txt";

        try {
            FileWriter writer = new FileWriter(path);

            System.out.print("Enter text to be saved to 'einkauf.txt': ");
            String userIn = SavitchIn.readLine();
            writer.write(userIn);

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
