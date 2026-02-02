package kontrollstrukturen.verzweigungen;
import helper.SavitchIn;

public class Wuerfeln{
	public static void main(String[] args){
		int rand = (int)(Math.random() * 6 + 1);

		System.out.println("Zahl von 1-6 eingeben:");
		int userIn = SavitchIn.readLineInt();

		System.out.println("Zufallszahl: " + rand);
		System.out.println("Eingabe: " + userIn);

		if (userIn == rand) {
			System.out.println("super getippt!");
		}
	}
}
