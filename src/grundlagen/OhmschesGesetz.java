package grundlagen;
public class OhmschesGesetz{
	public static void main(String[] args) {
		double U = 24;
		double R = 40;
		double I;

		I = U / R;

		System.out.println("U = " + U + "V");
		System.out.println("R = " + R + "Ω");
		System.out.println("I = U/R = " + I + "A");
	}
}
