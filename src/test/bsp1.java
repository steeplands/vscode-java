package test;

import helper.SavitchIn;

public class bsp1 {
    public static void main(String[] args) {

        int size;
        do {
            System.out.print("Zahl zwischen 3 und 10 eingeben: ");
            size = SavitchIn.readLineInt();
        } while (size < 3 || size > 10);

        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                matrix[j][i] = (i + 1);
                
                if (i > j) {
                    matrix[j][i] = 0;
                }
            }
        }

        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%d ", num);
            }
            
            System.out.println();
        }
    }
}
