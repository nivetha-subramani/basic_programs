package topics;// 
class anmalss
{
	void ate()
	{
		System.out.println("its ready to eat the meat");
	}
}

class naai extends anmalss{
	void kaadikum()
	{
		System.out.println("it likes meat");
	}
}

class cat  extends anmalss{
	void meesound()
	{
		System.out.println("can meeowwwg ");
	}
}

public class hirakinhe {
	public static void main(String[] args) {
	cat c1 = new cat();
	c1.ate();
	c1.meesound();
 
		
	}

}
