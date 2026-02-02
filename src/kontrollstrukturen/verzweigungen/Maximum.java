package kontrollstrukturen.verzweigungen;
import helper.SavitchIn;

public class Maximum{
	public static void main(String[] args){
		
		System.out.println("Zahl1:");
		double z1 = SavitchIn.readLineDouble();
		
		System.out.println("Zahl2:");
		double z2 = SavitchIn.readLineDouble();
		
		if (z1 > z2) {
			System.out.printf("%nDas Maximum ist: %f", z1);
		} else {
			System.out.printf("%nDas Maximum ist: %f", z2);
		}
	}
}