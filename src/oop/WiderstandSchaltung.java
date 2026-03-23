package oop;

public class WiderstandSchaltung {
    public static void main(String[] args) {

        // Test 1
        Widerstand r1 = new Widerstand(5);
        Widerstand r2 = new Widerstand(5);

        System.out.println("Test 1:");
        System.out.println("R1 = " + r1 + ", R2 = " + r2);

        Widerstand serie = r1.seriell(r2);
        Widerstand parallel = r1.parallel(r2);

        System.out.println("R1 + R2 = " + serie);
        System.out.println("R1 || R2 = " + parallel);
        System.out.println();

        // Test 2
        Widerstand r = new Widerstand(12);

        System.out.println("Test 2:");
        System.out.println("R = " + r);

        Widerstand result = r.seriell(
            r.parallel(
                r.seriell(
                    r.parallel(r))));

        System.out.println("R + R || R + R || R || R = " + result);
    }
}
