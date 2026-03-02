package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import helper.SavitchIn;

public class SaveName {
    public static void main(String[] args) {

        final String PATH = "res/username.txt";
        File file = new File(PATH);

        try {
            if (!file.exists()) {
                System.out.print("Kein Benutzer gefunden. Bitte name eingeben: ");

                BufferedWriter bWriter = new BufferedWriter(new FileWriter(PATH));
                bWriter.write(SavitchIn.readLine());

                bWriter.close();
            } else {
                BufferedReader bReader = new BufferedReader(new FileReader(PATH));

                String name = bReader.readLine();
                System.out.printf("Hallo %s!", name);

                bReader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
