package smartgraduates;

public class Program22 {
	public int a = 10;
	private int b = 20;
	protected int c = 30;
	int d = 40;
	
	public void test0() {
		System.out.println("Inside public method...");
	}
	private void test1() {
		System.out.println("inside private method...");
	}
	
	protected void test2() {
		System.out.println("inside protected method...");
	}
	
	void test3() {
		System.out.println("Inside default method...");
	}
}

public class Prog22 {
	public static void main(String[] args) {
	
		tester ts = new tester();
		

		System.out.println(ts.a);
	
		System.out.println(ts.c);
		System.out.println(ts.d);
		
		
		ts.test0();
	
		ts.test2();
		ts.test3();
	}

}
