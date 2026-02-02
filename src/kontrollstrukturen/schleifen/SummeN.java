package kontrollstrukturen.schleifen;
import helper.SavitchIn;

public class SummeN{
	public static void main(String[] args){
		
		System.out.println("Natürliche Zahl eingeben:");
		int n = SavitchIn.readLineInt();
		int i = 1;
		int summ = 0;
		
		while ( i <= n ) {
			summ += i;
			//i ++;
			i += 1;
		}
		
		System.out.printf("Summe von 1...%d = %d", n, summ);
	}
}