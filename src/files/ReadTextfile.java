package files;

import java.io.FileReader;
import java.io.IOException;

public class ReadTextfile {
    public static void main(String[] args) {
        String filepath = "res/smiley.txt";
        try {
            FileReader reader = new FileReader(filepath);

            while (true) {
                int buffer = reader.read();
                if (buffer == -1) {
                    break;
                }
                System.out.print((char)buffer);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        
    }
}
