package grundlagen;
import helper.SavitchIn;

public class Expressions{
	public static void main(String[] args){
		int a, b;
		double c;
		
		System.out.println("Wert für a eingeben: ");
		a = SavitchIn.readLineInt();
		
		System.out.println("Wert für b eingeben: ");
		b = SavitchIn.readLineInt();
		
		System.out.println("Wert für c eingeben: ");
		c = SavitchIn.readLineInt();
		
		System.out.printf("%n(a,b)");
		System.out.printf("%na+b = %d%na-b = %d%na*b = %d%na/b = %d%na mod b = %d%n", a+b, a-b, a*b, a/b, a%b);
		
		System.out.printf("%n(b,c)");
		System.out.printf("%nb+c = %f%nb-c = %f%nb*c = %f%nb/c = %f%nb mod c = %f%n", b+c, b-c, b*c, b/c, b%c);
		
		System.out.printf("%n(a,c)");
		System.out.printf("%na+c = %f%na-c = %f%na*c = %f%na/c = %f%na mod c = %f", a+c, a-c, a*c, a/c, a%c);
	}
}