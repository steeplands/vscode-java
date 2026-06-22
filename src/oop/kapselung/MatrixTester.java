package oop.kapselung;

public class MatrixTester {
    public static void main(String[] args) {
        System.out.println("=== STARTING MATRIX TEST ===\n");

        // 1. Test: Gültige Matrix erstellen
        System.out.println("--- 1. Gültige Matrix (3x3) ---");
        Matrix m1 = new Matrix(3, 3);
        m1.setElement(0, 0, 1);
        m1.setElement(0, 1, 2);
        m1.setElement(1, 0, 3);
        m1.setElement(1, 1, 4);
        m1.print();

        // 2. Test: Fallback auf 2x2 bei ungültigen Werten (z.B. 1x1)
        System.out.println("--- 2. Ungültige Dimensionen (1x1) -> Fallback auf 2x2 ---");
        Matrix mInvalid = new Matrix(1, 1);
        mInvalid.print();

        // 3. Test: Matrix-Multiplikation (Falk-Schema)
        System.out.println("--- 3. Matrix-Multiplikation (2x3 * 3x2) ---");
        double[][] dataA = {
            {1, 2, 3},
            {4, 5, 6}
        };
        double[][] dataB = {
            {7, 8},
            {9, 1},
            {2, 3}
        };
        
        Matrix matA = new Matrix(dataA);
        Matrix matB = new Matrix(dataB);
        
        System.out.println("Matrix A:");
        matA.print();
        System.out.println("Matrix B:");
        matB.print();
        
        System.out.println("Ergebnis A * B:");
        Matrix matResult = Matrix.multiply(matA, matB);
        if (matResult != null) {
            matResult.print();
        }

        // 4. Test: Ungültige Multiplikation (Dimensionen passen nicht)
        System.out.println("--- 4. Falsche Dimensionen bei Multiplikation -> Fallback auf leere 2x2 ---");
        // matA ist 2x3, matResult ist 2x2 -> (2x3 * 2x2) ist mathematisch unmöglich
        Matrix matWrongMul = Matrix.multiply(matA, matResult);
        matWrongMul.print();

        // 5. Test: Skalarmultiplikation
        System.out.println("--- 5. Skalarmultiplikation (Matrix A * 2) ---");
        Matrix matScalar = Matrix.multiply(matA, 2.0);
        matScalar.print();
        
        System.out.println("=== TEST FINISHED ===");
    }
}