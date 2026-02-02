package tortuga;
import java.util.Random;

import helper.SavitchIn;

public class Piratenschlacht {

    public static int getPoints(int min, int max) {
        Random rand = new Random();
        int points = rand.nextInt( max - min + 1 ) + min;
        return points;
    }

    public static void main(String[] args) {

        System.out.println("Die Belagerung von Fort Cumberland:");

        System.out.printf("%nDie Piraten starten mit einer Energie von: ");
        int pointPirate = SavitchIn.readLineInt();

        System.out.printf("%nDie Rotröcke starten mit einer Energie von: ");
        int pointRed = SavitchIn.readLineInt();

        int i = 1;
        int fightPirate = 0;
        int fightRed = 0;

        int min = 5;        // minimal offense strengh
        int max = 15;       // maximal offense strengh
        
        while (true) {
            System.out.printf("%n%n%d. Angriffswelle:", i);

            fightPirate = getPoints(min, max);
            fightRed = getPoints(min, max);

            System.out.printf("%nDie Piraten fügen den Rotröcken einen Schaden von %d zu.", fightPirate);
            System.out.printf("%nDie Rotröcke kontern den Überfall mit einem Schaden von %d.", fightRed);

            pointPirate -= fightRed;
            pointRed -= fightPirate;

            System.out.printf("%nVerbleibende Energiepunkte: Piraten (%d), Rotröcke (%d)", pointPirate, pointRed);
            
            i++;

            if (pointPirate <= 0 || pointRed <= 0) {
                break;
            }
        }

        if (pointPirate <= 0 && pointRed <= 0) {
            System.out.printf("%n%nDas Fort liegt in Trümmern, und der Schatz ist verloren!");
        } else if (pointPirate > pointRed) {
            System.out.printf("%n%nDie Piraten haben gesiegt! Der Schatz gehöt uns, uuaarrgh!");
        } else {
            System.out.printf("%n%nDer Angriff wurde abgewehrt. Die Rotröcke triumphieren!");
        }
    }
}
