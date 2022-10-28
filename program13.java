package smartgraduates;
import java.util.Scanner;
import java.util.Arrays;

public class program13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	
		int[][] arr = new int[10][2];
		int total = 0;
		double average;
		System.out.println("Enter 10 student's serial number and then their marks: ");
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				arr[row][col]=scan.nextInt();
				if(col==1) {
					total += arr[row][col];	
				}
			}
			System.out.println("Next student");
		}
		System.out.println();
		System.out.println("The array: ");
		System.out.println(Arrays.deepToString(arr));
		System.out.println();
		
		average = (double)total/10;
		
		
		System.out.println("Student no.     " + "   Marks");
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				System.out.print(arr[row][col] + "                        ");
			}
			System.out.println();
		}
		System.out.println("students: 10" + "     Total result:   " + total + "     Average marks:  " + average );
	}

}
