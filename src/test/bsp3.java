package test;

import java.util.Arrays;

public class bsp3 {
    public static void main(String[] args) {
        int[] arr = new int[9];

        for (int i = 45; i >= 37; --i) {
            arr[i - 37] = i;
        }
        System.out.println(Arrays.toString(arr));
        
        int[] arr2 = new int[9];

        int j = 45;
        while (j >= 37) {
            arr2[j-37] = j;
            --j;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
