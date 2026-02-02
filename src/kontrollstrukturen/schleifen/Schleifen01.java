package kontrollstrukturen.schleifen;
public class Schleifen01 {
    public static void main(String[] args) {
        int max = 100;
        int min = 50;

        System.out.println("while");

        int i = min;

        while (max >= i) {
            System.out.printf("%d, ", i);
            i += 2;
        }

        System.out.println("\ndo while");

        i = 0;
            
        do {
            System.out.printf("%d, ", i);
            i += 2;
        } while (max > i);

        System.out.println("\nfor");

        for (int j = min; j <= max; j += 2) {
            System.out.printf("%d, ", j);
        }
    }
}
