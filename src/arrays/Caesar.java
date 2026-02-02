package arrays;

import helper.SavitchIn;

public class Caesar {

	public static char[] doCipher(char[] data, int key) {
		for (int j = 0; j < data.length; j++) {

			char c = data[j];

			if (c >= 'a' && c <= 'z') {
				c += key;

				while (c > 'z') {
					c -= 26;
				}
			}

			if (c >= 'A' && c <= 'Z') {
				c += key;

				while (c > 'Z') {
					c -= 26;
				}
			}

			data[j] = c;
		}
		return data;
	}

	public static char[] undoCipher(char[] data, int key) {
		return doCipher(data, 26 - key);
	}

	public static void main(String[] args) {
		while (true) {
			System.out.println("Select operation mode:");
			System.out.println("e. Encrypt");
			System.out.println("d. Decrypt");
			System.out.println("Q. Quit");
			System.out.println("-------------------------");

			char choose = SavitchIn.readChar();

			switch (choose) {
				case 'e' -> {
					System.out.println("e");
					break;
				}
				case 'd' -> {
					System.out.println("d");
					break;
				}
				default -> {
					System.out.println("exiting...");
					break;
				}
			}
		}
	}
}