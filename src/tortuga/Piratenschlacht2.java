package tortuga;
import java.util.Random;

import helper.SavitchIn;

/*/
    Random rand = new Random();
    int points = rand.nextInt( max - min + 1 ) + min;
*/

public class Piratenschlacht2 {
    
    static int ReadCannon() {
        int kanonen;

        while (true) {
            System.out.printf("Anzahl der Kanonen am Schiff: ");
            kanonen = SavitchIn.readLineInt();

            if ((kanonen >= 6) && (kanonen <= 12) && (kanonen % 2 == 0)) {
                break;
            }
        }
        return kanonen;
    }

    static void Einschiessen(int cannon, String captain) {
        System.out.printf("\nArrr, schießt die %d. Kanone ein, dass die See bebt!", cannon);

        Random rand = new Random();
        int targetError = 5;
        int shot = 0;

        do {
            shot++;
            targetError = rand.nextInt(0,21);
            System.out.printf("\n    %d. Kanonenschlag: %d Meter Abstand", shot, targetError);
        } while(targetError >= 5);

        System.out.printf("\nKapitän %s, Kanone %d nach %d Schüssen eingeschossen.\n", captain, cannon, shot);
    }
    
    public static void main(String[] args) {
        System.out.printf("Name des Captain: ");
        String captain = SavitchIn.readLine();
        System.out.printf("Name des Schiffes: ");
        String ship = SavitchIn.readLine();
        int cannons = ReadCannon();

        System.out.println("\nMänner, wir müssen uns für den nächsten Angriff auf Fort Cumberland besser vorbereiten.");
        System.out.printf("Schießt die %d Kanonen der %s ein!", cannons, ship);
        System.out.printf("\n\nAye Kapitän %s!\n", captain);

        for(int i = 1; i <= cannons; i++) {
            Einschiessen(i, captain);
        }
    }
}
