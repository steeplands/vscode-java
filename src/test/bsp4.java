package test;
public class bsp4 {
    public static void main(String[] args) {
        int[] array = {21, 22, 22, 23, 23, 21, 23, 21, 19, 21};
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        sum /= array.length;
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] - sum < 2 && array[i] - sum > -2) {
                System.out.printf("%d: %d", number, array[i]);
                number++;
            }
        }
    }
}

// ka... ist Moritz' Code