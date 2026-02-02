package tortuga;
import helper.SavitchIn;

public class Zahltag {
    public static void main(String[] args){

        System.out.printf("Preis von Rudi Raubein: ");
        double price = SavitchIn.readLineDouble();

        System.out.printf("Angebot von Kapitän Goldzahn: ");
        double offer = SavitchIn.readLineDouble();

        if (offer / 0.9 < price)
            System.out.println("Verzieh dich, Landratte!");
        else if (offer / 1.2 > price)
            System.out.println("Da stimmt etwas nicht du Schurke! Versucht du mich zu betrügen?");
        else
            System.out.println("Wir haben eine Abmachung, Kamerad!");
    }
}