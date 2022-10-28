package smartgraduates;
import java.util.Arrays;

public class Program9 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println("The array: ");
		System.out.println(Arrays.toString(arr));
		int temp;
		int a = arr.length - 1;	
		
		
		System.out.println("Reversed: ");
		for(int i=a; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
