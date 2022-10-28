package smartgraduates;
import java.util.Scanner;

public class Program27 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter invested amount: ");
		final double investment = scan.nextDouble();
		
	
		double value = investment;
		
		
		value += investment*0.4;		
		System.out.println("First year 40% increase in value: " + value);
	
		
		value -= 1500;
		System.out.println("Second year 1500 decrease in value: " + value);
		
		
		value += value*0.2;
		System.out.println("Thrd year 20% increase in value: " + value);
		
	}

}
