package files;

import java.io.IOException;
import java.io.FileReader;

// a = 97 | z = 122
// A = 65 | Z = 90

public class TextAnalyzer {
    public static int toLowerChar(int c) {
        if (c >= 'A' && c <= 'Z') {
            c += 32;
        }
        return c;
    }
    public static int[] analyzeText(String filename) {

        int[] table = new int[26];

        try {
            FileReader reader = new FileReader(filename);
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
    public static void main(String[] args) {
        int[] result = analyzeText("res/smiley.txt");
        char abc = 'A';
        for (int i : result) {
            System.out.printf("%s | %d\n", abc++, i);
        }
    }
}
