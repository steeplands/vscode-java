package test;

public class bsp33 {
    public static void main(String[] args) {
        int[][] arr = { {1,8,5}, {4,9,3}, {8,1,6} };

        int[] numbersCount = new int[9];

        for (int[] row : arr) {
            for (int i = 0; i < arr.length; i++) {
                numbersCount[row[i] - 1]++;
            }
        }

        for (int i = 0; i < 9; i++) {
            if (numbersCount[i] == 2) {
                System.out.println("duplicate: " + (i+1));
            } else if (numbersCount[i] == 0) {
                System.out.println("missing: " + (i+1));
            }
        }
    }
}
