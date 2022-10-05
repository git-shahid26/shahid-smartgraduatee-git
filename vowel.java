package smartgraduates;

import java.util.Scanner;

public class vowel{
	public static void main(String[]args) {
		int num;
		System.out.println("Enter an integer number:");
		
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		
		if(num%2==0)
			System.out.println("Enter number is even");
		else
			System.out.println("Enter number is odd");
	}

}
