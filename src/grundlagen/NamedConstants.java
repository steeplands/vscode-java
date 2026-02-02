package grundlagen;
import helper.SavitchIn;

public class NamedConstants{
	public static void main(String[] args){
		
		//define
		//final double PI = 3.14;
		final double PI = Math.PI;
		double radius;
		double durch;
		double circum;
		double area;
		
		//input
		System.out.println("Radius eingeben:");
		radius = SavitchIn.readLineDouble();
		
		//calculate
		durch = 2*radius;
		circum = durch*PI;
		area = radius*radius*PI;
		
		//output
		System.out.println("Radius:       " + radius);
		System.out.println("Durchmesser:  " + durch);
		System.out.println("Umfang:       " + circum);
		System.out.println("Fläche:       " + area);
	}
}