package arrays.multidimension;

/*
Lesen Sie eine Dimension ein (zw. 3 und 10)
Erstellen Sie eine sog. Additions
Tabelle nach dem Beispiel unten.
    0   1   2   3   ...
0   0   1   2   3   ...   
1   1   2   3   4   ...
2   2   3   4   5   ...
3   3   4   5   6   ...
...  ... ... ... ... ...
*/

public class AddTab {
    public static void main(String[] args) {
        int dimension = 0;
        while (dimension < 3 || dimension > 10) {
            System.out.print("Bitte eine Zahl zwischen 3 und 10 eingeben: ");
            dimension = helper.SavitchIn.readLineInt();
        }

        dimension += 1;

        int[][] addTab = new int[dimension][dimension];

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                addTab[i][j] = i + j;
            }
        }

        System.out.println("Die Additions-Tabelle ist:");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(addTab[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
