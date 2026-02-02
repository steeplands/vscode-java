package kontrollstrukturen.verzweigungen;
import helper.SavitchIn;

public class Schaltjahr{
	public static void main(String[] args){
		
		System.out.println("Jahr eingeben:");
		int jahr = SavitchIn.readLineInt();
		boolean schalt = false;

		if (jahr % 400 == 0)
			schalt = true;
		else if (jahr % 100 == 0)
			schalt = false;
		else if (jahr % 4 == 0)
			schalt = true;

		if (schalt == true)
			System.out.println(jahr + " ist EIN Schaltjahr");
		else
			System.out.println(jahr + " ist KEIN Schaltjahr");
	}
}

