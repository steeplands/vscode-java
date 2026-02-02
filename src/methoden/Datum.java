package methoden;
import helper.SavitchIn;

public class Datum {

	public static boolean isFoundInt(int[] array, int target) {
		boolean found = false;

		for (int n : array) {
			if (n == target) {
				found = true;
				break;
			}
		}
		return found;
	}

	public static int getDay(int monat, boolean schalt) {
		int day30[] = {4, 6, 9, 11};
		int day31[] = {1, 3, 5, 7, 8, 10, 12};
		
		if (schalt && monat == 2){
			return 29;
		}

		if (isFoundInt(day30, monat)) {
			return 30;
		} else if (isFoundInt(day31, monat)) {
			return 31;
		} else {
			return 28;
		}
	}

	public static String getMonat(int i) {
		String[] month = { "Jänner", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September",
				"Oktober", "November", "Dezember" };
		return month[i-1];
	}

	public static boolean isSchaltjahr(int jahr) {
		boolean schalt = false;

		if (jahr % 400 == 0)
			schalt = true;
		else if (jahr % 100 == 0)
			schalt = false;
		else if (jahr % 4 == 0)
			schalt = true;

		return schalt;
	}
	
	public static void main(String[] args) {

		System.out.printf("Jahr eingeben: ");
		int year = SavitchIn.readLineInt();

		int month = 0;

		while (1 > month || 12 < month) {
			System.out.printf("Monat eingeben: ");
			month = SavitchIn.readLineInt();
		}

		/*
		int month = 0;
		
		do {
			System.out.printf("Monat eingeben: ");
			month = SavitchIn.readLineInt();
		} while(1 > month || 12 < month);
		*/

		boolean schalt = isSchaltjahr(year);
		String text = getMonat(month);

		int day = 0;
		int dayMax = getDay(month, schalt);

		while (1 > day || dayMax < day) {
			System.out.printf("Tag eingeben: ");
			day = SavitchIn.readLineInt();
		}

		System.out.printf("%d. %s %d%n", day, text, year);

		if (schalt == true)
			System.out.println(year + " ist EIN Schaltjahr");
		else
			System.out.println(year + " ist KEIN Schaltjahr");

	}
}