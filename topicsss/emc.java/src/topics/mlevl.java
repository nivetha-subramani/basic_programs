package topics;// multilevel inheritance

class anmals
{
	void ate()
	{
		System.out.println("its ready to eat the meat");
	}
}

class kiti extends anmals{
	void meoww()
	{
		System.out.println("it likes milki");
	}
}

class dogi extends kiti{
	void barkkk()
	{
		System.out.println("biteing the cat");
	}
}

public class mlevl {
	
	public static void main(String[] args) {
		dogi ob1= new dogi();
		ob1.ate();
		ob1.meoww();
		ob1.barkkk();
	}

}
