package arrays;

public class Revert {
    public static int[] revertArray(int[] array) {
        int[] out = new int[array.length];
        int j = 0;

        for(int i = (array.length - 1); i >= 0; i--) {
            out[j++] = array[i];
        }
        return out;
    }
    public static void main(String[] args) {
        int[] one = {1, 2, 3, 4, 5};

        for (int index = 0; index < one.length; index++) {
            System.out.print(one[index]);
        }

        System.out.println();

        int[] two = revertArray(one);

        for (int index = 0; index < one.length; index++) {
            System.out.print(two[index]);
        }
    }
}
