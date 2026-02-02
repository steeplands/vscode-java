package arrays.multidimension;

import helper.SavitchIn;

/*
Lesen Sie eine zahl ein (darf nur z wischen 3 und 10) sein:
Erstellen Sie eine 2 dim Matrix und schreiben Sie 1 und 0 auf folg. Weise ein und
geben Sie die Matrix aus:

Beispiel: (6 wurde eingegeben)
100000
110000
111000
111100
111110
111111
*/

public class Arr1010 {
    public static void main(String[] args) {
        int userIn = 0;
        while (userIn < 3 || userIn > 10) {
            System.out.print("Bitte eine Zahl zwischen 3 und 10 eingeben: ");
            userIn = SavitchIn.readLineInt();
        }

        int[][] matrix = new int[userIn][userIn];

        for (int i = 0; i < userIn; i++) {
            for (int j = 0; j < userIn; j++) {
                if (j <= i) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }

        System.out.println("Die erstellte Matrix ist:");
        for (int i = 0; i < userIn; i++) {
            for (int j = 0; j < userIn; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
    
}