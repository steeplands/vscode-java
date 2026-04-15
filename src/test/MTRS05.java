package test;

public class MTRS05 {
    public static void main() {
        double value;
        double volt = 220.0;
        double current = 5;
        for (int abtast = 2; abtast < 10; abtast++) {
            value = 0;
            for (int i = 0; i < abtast; i++) {
                double sinvolt = Math.sin(2 * Math.PI * i / abtast);
                double sincurrent = Math.sin(2 * Math.PI * i / abtast + 2 * Math.PI * 45 / 360);
                value += sinvolt * sincurrent;
            }
            value *= volt * current / abtast;
            System.out.printf("%d\nP: %f\nFehler: %f%%\n\n", abtast, value, value / (volt * current));
        }
    }
}
