package arrays.multidimension;

public class Print2DArrays {
    public static void main(String[] args) {
        int[][] data = { {1, 2, 3, 4, 5}, {4, 3, 2, 1} };

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
