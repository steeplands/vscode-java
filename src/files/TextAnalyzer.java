package files;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

// a = 97 | z = 122
// A = 65 | Z = 90

public class TextAnalyzer {
    public static int toLowerChar(int c) {
        if (c >= 'A' && c <= 'Z') {
            c += 32;
        }
        return c;
    }

    public static int[] analyzeText(String fileName) {
        int[] table = new int[26];

        try {
            FileReader reader = new FileReader(fileName);
            boolean run = true;
            while (run) {
                int cbuf = reader.read();
                if (cbuf == -1) {
                    break;
                }
                cbuf = toLowerChar(cbuf);
                if ('a' <= cbuf && cbuf <= 'z') {
                    table[cbuf - 97] += 1;
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return table;
    }

    public static void saveResult(String fileName) {
        String fileNameOut = fileName + ".out";
        try {
            BufferedWriter bWriter = new BufferedWriter(new FileWriter(fileNameOut));

            bWriter.write("Analyzed text: " + fileName);
            bWriter.newLine();

            int[] data = analyzeText(fileName);
            
            char abc = 'A';
            for (int i = 0; i < data.length; i++) {
                if (data[i] > 0) {
                    bWriter.newLine();
                    bWriter.write((char)(abc + i) + " | " + data[i]);
                }
            }

            bWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        final String PATH = "res/smiley.txt";

        int[] result = analyzeText(PATH);
        saveResult(PATH);
        
        char abc = 'A';
        for (int i : result) {
            System.out.printf("%s | %d\n", abc++, i);
        }
    }
}
