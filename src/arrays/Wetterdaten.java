package arrays;

import helper.SavitchIn;

public class Wetterdaten {
    public static void main(String[] args) {
        System.out.printf("Number of days to analyse: ");
        int numOfDays = SavitchIn.readLineInt();

        int[] data = new int[numOfDays];
        for (int i = 1; i <= numOfDays; i++) {
            System.out.printf("Enter Temperature for the %d. day: ", i);
            data[i-1] = SavitchIn.readLineInt();
        }
        
        double mittel = arrays.SumAndAverageExtended.calcMittel(data);

        int daysAbove = 0;
        int daysBelow = 0;

        for(int j = 0; j < data.length; j++) {
            if(data[j] < mittel)
                daysBelow++;
            if(data[j] > mittel)
                daysAbove++;                
        }

        System.out.printf("\nDer Mittelwert beträgt %.2f °C", mittel);
        System.out.printf("\n%d Tage liegen über und %d Tage liegen unter dem Mittelwert.", daysAbove, daysBelow);
    }
}
