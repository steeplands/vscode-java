package kontrollstrukturen.schleifen;
import java.util.Random;

import helper.SavitchIn;

public class Zahlenraten {
    public static void main(String[] args) {
        Random random = new Random();
        int target = random.nextInt(20) + 1;
        int tryed = 0;
        int in;

        do {
            System.out.printf("Zahl zwischen 1 und 20 eingeben: ");
            in = SavitchIn.readLineInt();
            tryed++;
        } while(in != target);

        System.out.printf("Yippeee, %d Versuche", tryed);
    }
}
