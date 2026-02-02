package kontrollstrukturen.schleifen;
public class WhileFaculty {
	public static void main(String[] args) {
		int max = 20;
		int i = 1;
		long fac = 1;
		
		while (i <= max) {
			fac = fac * i;
			System.out.printf("!%d = %d%n", i, fac);
			i++;
		}
	}
}