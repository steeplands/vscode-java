package oop.kapselung;

public class Matrix {
    private double[][] data;
    private int rows;
    private int columns;

    // ==== CONSTRUCTOR ====
    public Matrix() {
        this.rows = 2;
        this.columns = 2;
        this.data = new double[2][2];
    }

    public Matrix(int n, int m) {
        if (n < 2 || m < 2) {
            this.rows = 2;
            this.columns = 2;
        } else {
            this.rows = n;
            this.columns = m;
        }
        this.data = new double[this.rows][this.columns]; // Alle Felder mit 0 initialisiert
    }

    public Matrix(double[][] values) {
        if (values == null || values.length < 2 || values[0] == null || values[0].length < 2) {
            this.rows = 2;
            this.columns = 2;
            this.data = new double[2][2];
        } else {
            this.rows = values.length;
            this.columns = values[0].length;
            this.data = new double[this.rows][this.columns];
            
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < this.columns; j++) {
                    if (values[i] != null && j < values[i].length) {
                        this.data[i][j] = values[i][j];
                    } else {
                        this.data[i][j] = 0.0;
                    }
                }
            }
        }
    }

    public Matrix(Matrix other) {
        if (other == null) {
            this.rows = 2;
            this.columns = 2;
            this.data = new double[2][2];
        } else {
            this.rows = other.rows;
            this.columns = other.columns;
            this.data = new double[this.rows][this.columns];
            
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < this.columns; j++) {
                    this.data[i][j] = other.data[i][j];
                }
            }
        }
    }

    // ==== GETTER & SETTER ====
    public double getNrOfRows() {
        return this.rows;
    }

    public double getNrOfColumns() {
        return this.columns;
    }

    public double getElement(int i, int j) {
        if (i < 0 || i >= rows || j < 0 || j >= columns) {
            return 0.0;
        }
        return data[i][j];
    }

    public void setElement(int i, int j, double value) {
        if (i >= 0 && i < rows && j >= 0 && j < columns) {
            data[i][j] = value;
        }
    }

    // ==== PRINT ====
    public void print() {
        System.out.println("*".repeat(25));
        System.out.println("Matrix");
        System.out.println("-".repeat(25));
        System.out.println("Dimension: " + this.getNrOfRows() + 'x' + this.getNrOfColumns());
        System.out.println("-".repeat(25));
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print( data[i][j] + "\t");   //tabstopp für Lesbarkeit
            }
            System.out.println();
        }
        System.out.println("*".repeat(25));
    }

    // ==== OPERATIONS ====
    public boolean equals(Matrix other) {
        if (other == null) return false;
        if (this.rows != other.rows || this.columns != other.columns) return false;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (this.data[i][j] != other.data[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean equals(Matrix first, Matrix second) {
        if (first == null) return second == null;
        return first.equals(second);
    }

    public void add(Matrix summand) {
        if (summand != null && this.rows == summand.rows && this.columns == summand.columns) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    this.data[i][j] += summand.data[i][j];
                }
            }
        }
    }

    public static Matrix add(Matrix summand1, Matrix summand2) {
        // Falls eine Matrix null ist oder Dimensionen nicht passen -> Fallback auf leere 2x2 Matrix
        if (summand1 == null || summand2 == null || summand1.rows != summand2.rows || summand1.columns != summand2.columns) {
            return new Matrix();
        }
        Matrix result = new Matrix(summand1);
        result.add(summand2);
        return result;
    }

    public void subtract(Matrix subtrahend) {
        if (subtrahend != null && this.rows == subtrahend.rows && this.columns == subtrahend.columns) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    this.data[i][j] -= subtrahend.data[i][j];
                }
            }
        }
    }

    public static Matrix subtract(Matrix minuend, Matrix subtrahend) {
        if (minuend == null || subtrahend == null || minuend.rows != subtrahend.rows || minuend.columns != subtrahend.columns) {
            return new Matrix();
        }
        Matrix result = new Matrix(minuend);
        result.subtract(subtrahend);
        return result;
    }

    public void multiply(double lambda) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.data[i][j] *= lambda;
            }
        }
    }

    public static Matrix multiply(Matrix matrix, double lambda) {
        if (matrix == null) {
            return new Matrix();
        }
        Matrix result = new Matrix(matrix);
        result.multiply(lambda);
        return result;
    }

    public void multiply(Matrix other) {
        if (other != null && this.columns == other.rows) {
            double[][] resultData = new double[this.rows][other.columns];

            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < other.columns; j++) {
                    double sum = 0;
                    for (int k = 0; k < this.columns; k++) {
                        sum += this.data[i][k] * other.data[k][j];
                    }
                    resultData[i][j] = sum;
                }
            }
            this.columns = other.columns;
            this.data = resultData;
        }
    }

    public static Matrix multiply(Matrix first, Matrix second) {
        if (first == null || second == null || first.columns != second.rows) {
            return new Matrix(); // Liefert eine leere 2x2 Matrix zurück, falls Multiplikation unmöglich
        }
        
        Matrix result = new Matrix(first.rows, second.columns);
        for (int i = 0; i < first.rows; i++) {
            for (int j = 0; j < second.columns; j++) {
                double sum = 0;
                for (int k = 0; k < first.columns; k++) {
                    sum += first.data[i][k] * second.data[k][j];
                }
                result.setElement(i, j, sum);
            }
        }
        return result;
    }
}