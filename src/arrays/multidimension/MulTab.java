package arrays.multidimension;

/*
wie bei arrays.multidimension.AddTab.java
aber eine Multiplikations Tabelle.
*/

public class MulTab {
    public static void main(String[] args) {
        int size = 0;
        while (size < 3 || size > 10) {
            System.out.print("Bitte eine Zahl zwischen 3 und 10 eingeben: ");
            size = helper.SavitchIn.readLineInt();
        }

        int[][] mulTab = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mulTab[i][j] = (i + 1) * (j + 1);
            }
        }

        System.out.println("Multiplikationstabelle:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%4d", mulTab[i][j]);
            }
            System.out.println();
        }
    }
}
