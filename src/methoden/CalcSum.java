package methoden;
import helper.SavitchIn;

public class CalcSum {
	
	public static int calcSum(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	public static void main(String[] args) {
		
		System.out.printf("Zahl 1: ");
		int z1 = SavitchIn.readLineInt();
		
		System.out.printf("Zahl 2: ");
		int z2 = SavitchIn.readLineInt();
		
		int result = calcSum(z1, z2);
		
		System.out.println("a + b = " + result);
	}
}