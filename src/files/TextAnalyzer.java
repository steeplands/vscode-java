package files;

import java.io.IOException;
import java.io.FileReader;

public class TextAnalyzer {
    public static int[] analyzeText(String filename) {
        try {
            FileReader reader = new FileReader(filename);



            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
