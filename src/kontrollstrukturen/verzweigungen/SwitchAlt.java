package kontrollstrukturen.verzweigungen;
import helper.SavitchIn;

public class SwitchAlt {
    public static void main(String[] args) {
        System.out.printf("Operator eingeben: ");
        char operator = SavitchIn.readChar();

        switch (operator) {
            case '+':
                System.out.println("Plus");
                break;
        
            case '-':
                System.out.println("Minus");
                break;

            default:
                System.out.println("ungültig");
                break;
        }
    }
}
