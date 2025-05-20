package topics;


class dady {
	dady(String advise)// by using the super key word we can access the parent class;
					  // we can call function as well that is in another file sperkiiwrd;
	{
		System.out.println("read for the xam");
	}
}

class son extends dady{

	son()
	{
		super("hear my word");
		System.out.println("i will read tomorow");
	}
}

public class sperkiword {

	public static void main(String[] args) {
		son s1= new son();
		
		
	}

}
