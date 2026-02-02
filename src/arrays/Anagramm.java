package arrays;

import java.util.*;
import helper.SavitchIn;

public class Anagramm {
	public static void main(String[] args) {
		
		System.out.print("Gib einen String ein: ");
		String s1 = SavitchIn.readLine();
		System.out.print("Gib einen String ein: ");
		String s2 = SavitchIn.readLine();
		
		s1 = s1.replace(" ", "");
		s2 = s2.replace(" ", "");
		
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);

		if (Arrays.equals(c1, c2)) {
			System.out.println("Ist ein Anagramm.");
		} else if (c1.length != c2.length) {
			System.out.println("Kein Anagramm.");
		} else {
			System.out.println("Kein Anagramm.");
		}
	}
}