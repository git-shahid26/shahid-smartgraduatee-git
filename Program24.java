package smartgraduates;
import java.util.Scanner;

public class Program24 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Taking user inputs
		System.out.println("Enter three numbers a,b,c and x, to compute quadratic equation: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int x = scan.nextInt();
		
		
		quad eq = new quad(a, b, c);
		int fx = eq.cal(x);				
		System.out.println(fx);
	}
}

class quad{
	
	int a;
	int b;
	int c;
	int x;

	
	quad(){
		a = 1;
		b = 1;
		c = 1;
	}
	
	
	quad(int num1, int num2, int num3){
		a = num1;
		b = num2;
		c = num3;
	}
	

	int cal(int num) {
		x = (a*num*num) + (b*num) + c;
		return x;
	}

}
