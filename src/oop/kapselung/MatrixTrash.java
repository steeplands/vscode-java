package oop.kapselung;

public class MatrixTrash {
    private double matrix[][];

    public MatrixTrash(int n, int m) {
        if (n < 2) n = 2;
        if (m < 2) m = 2;
        
        this(new double[m][n]);
    }

    public MatrixTrash(double[][] values) {
        int n = values[0].length;
        int m = values.length;
        this(m, n);
    }

    public MatrixTrash(MatrixTrash other) {
        this(other.getNrOfColumns(), other.getNrOfRows());
    }

    public void print() {
        System.out.println("*".repeat(40));
        System.out.println("Matrix");

        System.out.println("-".repeat(40));
        System.out.println("Dimension: " + this.getNrOfRows() + 'x' + this.getNrOfColumns());
        System.out.println("-".repeat(40));

        for (double[] row : matrix) {
            for (double item : row) {
                System.out.print(item + ' ');
            }
            System.out.print('\n');
        }
        System.out.println("*".repeat(40));
    }

    /*
    ***************************************
    Matrix
    ---------------------------------------
    Dimension: 3x4
    ---------------------------------------
    1 2 3 4
    5 6 7 8
    9 10 11 12
    ***************************************
    */

    public int getNrOfRows() {
        return this.matrix.length;
    }

    public int getNrOfColumns() {
        return this.matrix[0].length;
    }

    public double getElement(int i, int j) {
        return this.matrix[i-1][j-1];
    }

    public void setElement(int i, int j, double value) {
        this.matrix[i-1][j-1] = value;
    }

    /*
    public boolean equals(Matrix other)
    public static boolean equals(Matrix first, Matrix second)

    public void add(Matrix summand)
    public static Matrix add(Matrix summand1, Matrix summand2)

    public void subtract(Matrix subtrahend)
    public static Matrix subtract(Matrix minuend, Matrix subtrahend)

    public void multiply(double lambda)
    public static Matrix multiply(Matrix matrix, double lambda)

    public void multiply(Matrix other)
    public static Matrix multiply(Matrix first, Matrix second)
    */
}
