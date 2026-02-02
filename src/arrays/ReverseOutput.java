package arrays;

public class ReverseOutput {
    public static void main(String[] args) {
        int data[] = new int[5];

        for (int i = 1; i <= data.length; i++) {
            data[i - 1] = i;
        }
        
        for (int j = data.length - 1; j >= 0; j--) {
            System.out.println(data[j]);
        }
    }
}
