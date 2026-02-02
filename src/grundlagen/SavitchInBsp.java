package grundlagen;
import helper.SavitchIn;

public class SavitchInBsp{
	public static void main(String[] args) {
		int numberInt;
		double numberDouble;
		String string;
		
		System.out.println("Int eingeben: ");
		numberInt = SavitchIn.readLineInt();
		
		System.out.println("Double eingeben: ");
		numberDouble = SavitchIn.readLineDouble();
		
		System.out.println("String eingeben");
		string = SavitchIn.readLine();
		
		System.out.printf("Eingegebene Werte:%n%nInteger: %d%nDouble: %f%nString: %s",numberInt,numberDouble,string);
	}
}