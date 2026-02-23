package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextfileBuffered {
    public static void main(String[] args) {
        String filepath = "resources/smiley.txt";
        try {
            FileReader reader = new FileReader(filepath);
            BufferedReader buffReader = new BufferedReader(reader);

            while (true) {
                String Line = buffReader.readLine();
                if (Line == null) {
                    break;
                }
                System.out.println(Line);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
