package methoden;
import helper.SavitchIn;

public class PrintSum {
    public static void printSum(int a, int b) {
        System.out.println("a + b = " + (a + b));
    }
	public static void main(String[] args) {
        System.out.printf("Zahl 1: ");
        int x = SavitchIn.readLineInt();

        System.out.printf("Zahl 2: ");
        int y = SavitchIn.readLineInt();

        printSum(x, y);
    }
}
