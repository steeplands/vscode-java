package arrays.multidimension;

/*
Lies int Werte für 2 Matrizen ein (3*3). Kann auch durch Zufallszahen geschehen.
Gib die Matrizen aus und
Berechne die Multiplikat ion (C= A+B) (c_ij = a_ij + b_ij).
Gib die Matrix C aus.
*/

public class AddMatrix {
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

        System.out.println("\nMatrix C (A + B):");
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print("[" + C[i][j] + "] ");
            }
            System.out.println(" ");
        }
    }
}
