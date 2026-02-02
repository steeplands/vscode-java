package arrays.multidimension;

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
        
        System.out.println();

        for (int i = 0; i < drei.length; i++) {
            for (int j = drei[drei.length -1 -i].length; j > 0; j--) {
                System.out.print(" ");
            }
            for (int el : drei[i]) {
                System.out.printf("%d ",el);
            }
            System.out.println();
        }
    }
}
