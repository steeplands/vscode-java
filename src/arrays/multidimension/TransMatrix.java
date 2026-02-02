package arrays.multidimension;

/*
Schreiben Sie ein Programm, dass eine quadratische Matrix transponiert. Beim Transponieren,
wird die Matrix an ihrer Hauptdiagonale gespiegelt. Das Element a, dass in der i ten Zeile und
j ten Spalte steht, steht in de r transponierten Matrix in der j ten Zeile und i ten Spalte.
*/

public class TransMatrix {
    public static void main(String[] args) {
        System.out.print("Bitte die Dimension der quadratischen Matrix eingeben: ");
        int dimension = helper.SavitchIn.readLineInt();

        int[][] matrix = new int[dimension][dimension];
        int[][] transposedMatrix = new int[dimension][dimension];

        // Matrix mit Zufallszahlen füllen
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matrix[i][j] = (int) (Math.random() * 10); // Zufallszahlen zwischen 0 und 9
            }
        }

        // Transponieren der Matrix
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        // Originalmatrix ausgeben
        System.out.println("Originalmatrix:");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // Transponierte Matrix ausgeben
        System.out.println("Transponierte Matrix:");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print
                (transposedMatrix[i][j] + " ");
            }
            System.out.println();
        } 
    }
}
