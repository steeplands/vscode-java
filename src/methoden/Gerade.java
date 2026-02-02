package methoden;
public class Gerade {
	
	public static double gerade(double x) {
		double y = 2 * x + 3;
		return y;
	}
	
	public static void main(String[] args) {
		
		double min = -3;
		double max = 4;
		
		double incre = 0.5;
		
		double i = min;
		double result;
			
		while (i <= max) {
			result = gerade(i);
			System.out.printf("%+4.1f | %+4.1f%n", i, result);
			
			i += incre;
		}
	}
}