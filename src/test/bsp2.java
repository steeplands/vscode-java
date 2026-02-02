package test;

public class bsp2 {
    public static void main(String[] args) {

        for (int i = 3; i <= 23; i+=5) {
            System.out.printf("%d: ", i);

            for (int j = 1; j < i; j++) {
                if(i % j == 0) {
                    System.out.printf("%d, ", j);
                }
            }
            
            System.out.printf("%d\n", i);
        }
    }
}
