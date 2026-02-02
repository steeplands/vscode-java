package arrays.multidimension;

import java.util.Arrays;

import helper.SavitchIn;

public class PascalschesDreieck {
    public static void main(String[] args) {
        System.out.print("n eingeben: ");
        int n = SavitchIn.readLineInt();

        int[][] drei = new int[n][];

        for (int i = 0; i < drei.length; i++) {
            drei[i] = new int[i+1];
        }

        for (int i = 0; i < drei.length; i++) {

            drei[i][0] = 1;
            drei[i][drei[i].length - 1] = 1;

            for (int j = 0; j < drei[i].length; j++) {
                if(drei[i][j] == 1) {
                    continue;
                } else {
                    drei[i][j] = drei[i - 1][j - 1] + drei[i - 1][j];
                }
            }
        }

        for (int[] is : drei) {
            System.out.println(Arrays.toString(is));
        }
    }
}
