package kontrollstrukturen.schleifen;
public class Schleifen02 {
    public static void main(String[] args) {
        double max = 160;
        double min = 125;
        double steps = 10;

        double incre = (160 - 125) / steps;

        System.out.println("while");

        double i = min;

        while (max >= i) {
            System.out.printf("%.2f; ", i);
            i += incre;
        }

        System.out.println("\ndo while");

        i = min;
            
        do {
            System.out.printf("%.2f; ", i);
            i += incre;
        } while (max > i);

        System.out.println("\nfor");

        for (double j = min; j <= max; j += incre) {
            System.out.printf("%.2f; ", j);
        }
    }
}
