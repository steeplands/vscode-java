package arrays;

import java.util.Random;

public class SumAndAverageExtended {
    public static int getRandom(int min, int max) {
        Random rand = new Random();
        int number = rand.nextInt(max - min + 1) + min;
        return number;
    }

    public static double calcMittel(int[] mittelData) {
        double mittel = 0;
        for (int j = 0; j < mittelData.length; j++) {
            mittel += mittelData[j];
        }
        mittel /= mittelData.length;
        return mittel;
    }

    public static int calcSumN(int n) {
        int sum = 0;
        for(int i = 1; n >= i; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int data[] = new int[5];

        for (int i = 0; i < data.length; i++) {
            data[i] = getRandom(0, 100);
        }

        System.out.println("Array:");
        for (int k = 0; k < data.length; k++) {
            System.out.println(data[k]);
        }

        System.out.println("Mittelwert:");
        System.out.println(calcMittel(data));
    }
}
