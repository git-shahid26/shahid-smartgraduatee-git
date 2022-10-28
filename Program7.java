package smartgraduates;
import java.util.Arrays;

public class Program7 {
	public static void main(String[] args) {
		int[] arr = {7,3,9,1,2};
		
		int temp;
		
		System.out.println("Array unsorted: ");
		System.out.print(Arrays.toString(arr));
		System.out.println();
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Ascening order: ");
		System.out.print(Arrays.toString(arr));
		System.out.println();
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] > arr[i]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("Descending Order: ");
		System.out.print(Arrays.toString(arr));
	}

}
