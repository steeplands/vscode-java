package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import helper.SavitchIn;

public class SaveName {
    public static void main(String[] args) {

        final String PATH = "res/username.txt";
        File file = new File(PATH);

        try {
            if (!file.exists()) {
                FileWriter writer = new FileWriter(PATH);
                BufferedWriter bufferedWriter = new BufferedWriter(writer);

                System.out.print("Kein Benutzer gefunden. Bitte name eingeben: ");
                String name = SavitchIn.readLine();

                bufferedWriter.write(name);

                bufferedWriter.close();
                writer.close();
            } else {
                FileReader reader = new FileReader(PATH);
                BufferedReader bufferedReader = new BufferedReader(reader);

                String name = bufferedReader.readLine();

                System.out.printf("Hallo %s!", name);

                bufferedReader.close();
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
