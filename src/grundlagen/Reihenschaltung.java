package grundlagen;
public class Reihenschaltung {
	public static void main(String[] args) {
		int R1 = 560;
		int R2 = 1000;
		int R3 = 2200;
		int Rg;
		double Ug = 10;
		double I, U1;

		Rg = R1 + R2 + R3;
		I = Ug / Rg;
		U1 = I * R1;

		System.out.printf("R1 = %d Ohm, R2 = %d Ohm, R3 = %d Ohm, Ug = %f V %n", R1, R2, R3, Ug);
		System.out.printf("Rg = %d Ohm, U1 = %f V, I = %f A", Rg, U1, I);
	}
}
