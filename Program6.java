package smartgraduates;
import java.util.Arrays;

public class Program6 {
	public static void main(String[] args) {
		
		int orgarr[] = {1, 2, 3, 4, 5};
		System.out.println("The original array: ");
		
		for(int i=0; i<orgarr.length; i++) {
			System.out.print(orgarr[i] + " ");
		}
		System.out.println();

		
		
		System.out.println("Resizing the array...");
		int rearr[] = Arrays.copyOf(orgarr, 10);
		rearr[5] = 6;
		rearr[6] = 7;
		rearr[8] = 9;
		rearr[7] = 8;
		rearr[9] = 10;
		System.out.println("after resize: ");
		
		System.out.println(Arrays.toString(rearr));
	}

}
