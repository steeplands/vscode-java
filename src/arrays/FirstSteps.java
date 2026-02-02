package arrays;

import helper.SavitchIn;

public class FirstSteps {
    public static void main(String[] args) {
        System.out.printf("Wie lange soll das Array sein? ");
        int length = SavitchIn.readLineInt();
        int[] intArray = new int[length];

        intArray[0] = 3;
        intArray[intArray.length - 1] = intArray.length;

        int wert = intArray[intArray.length - 1];
        System.out.printf("Länge des Arrays: %d\n\n", wert);

        for (int i = 0; i < intArray.length; i++) {
            System.out.printf("%2d -> %d\n", i+1 ,intArray[i]);
        }
    }
}
