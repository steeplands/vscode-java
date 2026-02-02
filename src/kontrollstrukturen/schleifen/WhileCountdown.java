package kontrollstrukturen.schleifen;
public class WhileCountdown{
	public static void main(String[] args){
		int i = 100;
		int stop = 50;
		
		while (i >= stop) {
			System.out.printf("%4d ", i);
			i--;
			
			if (i % 10 == 0) {
				System.out.printf("%n");
			}
		}
	}
}