package kontrollstrukturen.verzweigungen;
import helper.SavitchIn;

public class SwitchZuweisung {
    public static void main(String[] args) {
        System.out.println("Zahl eingeben:");
        int x = SavitchIn.readLineInt();
        int n = x % 2;
        boolean even = switch (n) {
            case 0 -> {
                yield true;
            }
            default -> {
                yield false;
            }
        };

        if (even)
            System.err.printf("Die Zahl %d ist gerade.", x);
        else
            System.out.printf("Zahl ist %d ungerade.", x);
    }
}
