package arrays;

public class Tierlaute {
    public static void main(String[] args) {
        String[] animals = {"Katze", "Kuh", "Fisch"};
        String[] animalSounds = new String[3];
        String strIn;

        do {
            strIn = helper.SavitchIn.readLine();
        } while(strIn != "ENDE");
        
        System.out.println(animals);
        System.out.println(animalSounds);
    }
}

