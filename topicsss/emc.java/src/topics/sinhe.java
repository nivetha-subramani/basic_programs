package topics;

class animals//super // single inheritance one super class one derived class means it is single inheritance

{
	void eat()
	{
		System.out.println("this animal eats well");
	}
}


class dogs extends animals//derived
{
	void barks()
	{
		System.out.println("barking dog dont bite");
	}
}
public class sinhe {
public static void main(String[] args) {
	dogs d1 = new dogs();
	d1.barks();
	d1.eat();
}
}
