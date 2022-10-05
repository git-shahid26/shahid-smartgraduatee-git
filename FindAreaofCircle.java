package smartgraduates;

import java.util.Scanner;

public class FindAreaofCircle {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the radius:");
		
		double radius=scanner.nextDouble();
		
		double area=Math.PI*(radius*radius);
		System.out.println("The area of circle is:"+area);
		
		double circumference=Math.PI*radius;
		System.out.println("The circumferenc of the circle is:"+circumference);
	}

}
