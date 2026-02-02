package arrays.multidimension;

/*
Erzeugen sie eine zweidimensionales (int) Matrix, mit je n Spalten und Zeilen und befüllen sie
die Matrix zeilenweise von links nach rechts, bzw. von rechts nach links alternierend
(mäand erförmig) aufsteigend mit den natürlichen Zahlen. Geben sie es mit den jeweiligen
Quersummen der Zeilen wie abgebildet aus. Definieren sie n als leicht änderbare Konstante,
sodass das Verfahren mit beliebigen n>2 funktioniert.
*/

public class Maeander {
    public static void main(String[] args) {
        final int N = 5;
        int[][] matrix = new int[N][N];
        int counter = 1;

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < N; j++) {
                    matrix[i][j] = counter++;
                }
            } else {
                for (int j = N - 1; j >= 0; j--) {
                    matrix[i][j] = counter++;
                }
            }
        }

        System.out.println("Mäander Matrix mit Quersummen:");
        for (int i = 0; i < N; i++) {
            int rowSum = 0;
            for (int j = 0; j < N; j++) {
                System.out.printf("%4d", matrix[i][j]);
                rowSum += matrix[i][j];
            }
            System.out.printf(" | Quersumme: %d%n", rowSum);
        }
    }
}
