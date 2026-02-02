package arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] data = {2, 4, 5, 3, 1};

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
        }

        System.out.println();

        for (int i = 0; i < data.length; i++) {

            for (int j = 0; j < data.length - 1; j++) {

                int a = data[j];
                int b = data[j + 1];

                if (a > b) {
                    data[j] = b;
                    data[j + 1] = a;
                }

                for (int k = 0; k < data.length; k++) {
                    System.out.print(data[k]);
                }

                System.out.println();
            }
        }
    }
}
