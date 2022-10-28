package smartgraduates;

public class Program25 {
	public static void main(String[] args) {
		
		derived d = new derived();
		
		d.useD();
	}
}


class base{			
	String method() {
		return "Wow";
	}
}

class derived{
	public void useD() {
		base z = new base();
		System.out.println("base says: " + z.method());
	}

}
