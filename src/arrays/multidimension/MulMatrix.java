package arrays.multidimension;

/*
Lies int Werte für 2 Matrizen ein (3x3). Kann auch durch Zufallszahen geschehen.
Gib die Matrizen aus und Berechne die Multiplikation (C= A*B) (c_ij = summe( a_ik * b_kj).
Gib die Matrix C aus.
*/

public class MulMatrix {
    public static void main(String[] args) {
        int size = 3;
        int[][] A = new int[size][size];
        int[][] B = new int[size][size];
        int[][] C = new int[size][size];

        System.out.println("Matrix A:");
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                A[i][j] = tortuga.Piratenschlacht.getPoints(0, 10);
                System.out.print("[" + A[i][j] + "] ");
            }
            System.out.println(" ");
        }

        System.out.println("\nMatrix B:");
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                B[i][j] = tortuga.Piratenschlacht.getPoints(0, 10);
                System.out.print("[" + B[i][j] + "] ");
            }
            System.out.println(" ");
        }

        System.out.println("\nMatrix C (A * B):");
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                C[i][j] = 0;
                for(int k = 0; k < size; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
                System.out.print("[" + C[i][j] + "] ");
            }
            System.out.println(" ");
        }
    }
}
