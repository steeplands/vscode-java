package kontrollstrukturen.verzweigungen;
import helper.SavitchIn;

public class SwitchNeu {
    public static void main(String[] args) {
        System.out.printf("Operator eingeben: ");
        char operator = SavitchIn.readChar();

        switch (operator) {
            case '+' -> {
                System.out.println("Plus");
            }
            case '-' -> {
                System.out.println("Minus");
            }
            default -> {
                System.out.println("ungültig");
            }
        }
    }
}
