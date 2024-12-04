package emc.java;


class Animals
{
	String name;
	int age;
	
	void makesouns()
	{
		System.out.println("animal makes sounds");
	}
}

class Dog extends Animals
{
	String breed;
	void makesouns()
	{
		System.out.println("barksss lolll");
	}
	void fetch()
	{
		System.out.println("dog is fetching");
	}
   }

class cat extends Animals
{
	
	String colour;
	
	void makesouns()
	{
		System.out.println("cat meowsssssssw");
	}
	
	void climb()
	{
		System.out.println("cat is climbing.");
	}
	
	
}


public class inheraceegcodes {

	public static void main(String[] args) {
		cat c1= new cat();
		c1.makesouns();
		c1.climb();
		c1.colour="white";
		System.out.println(c1.colour);
	
	}

}
