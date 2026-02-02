package grundlagen;
import java.util.Scanner;

public class ScannerBsp {
	public static void main (String[] args){
		System.out.println("Zahl eingeben: ");
		Scanner scanner = new Scanner(System.in);
		double value = scanner.nextDouble();
		System.out.println("Zahl: " + value);
		scanner.close();
	}
}