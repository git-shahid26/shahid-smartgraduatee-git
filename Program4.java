package smartgraduates;
import java.util.Scanner;

public class Program4 {
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n=scan.nextInt();
		scan.close();
		boolean f=false;
		
		for(int i=2;i<=n/2;i++){
			if(n%i==0) {
				f=true;
				break;
	
			}
			
		}
		if(f==false) {
			System.out.println("The number"+ n +"is prime number");
		}
		else {
			System.out.println("The number"+ n +"is not a prime number");
		}
		
	
	}
	

}
