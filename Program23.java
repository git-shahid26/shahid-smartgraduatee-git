package smartgraduates;

public class Program23 {
	
	Pro23 pr = new Pro23();
	
	
	void manipulate(int a) {
		System.out.println("The number is: " + pr.num);
		System.out.println("Manipulating a protected member from other class...");
		pr.num = a;
		System.out.println(pr.num);
	}
	public static void main(String[] args){
	
		Program23 pr23 = new Program23();
		
		pr23.manipulate(5);	
		System.out.println("Manipulated Successfully!");
	}
}


class pro23{
	protected int num = 10;


}
