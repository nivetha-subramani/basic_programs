package topics;
// abstract: its a method should be present in the abstract class.
// abstract method should not having  a body{}.
// all child class will access the abstract method.


abstract class vehicle{
	
	abstract void speed();
	
	void brand()
	{
		System.out.println("royalenfield");
	}
	
	
}

class bike extends vehicle{
	void speed() {
		System.out.println("56km");
	}
}

class car extends vehicle
{

	@Override
	void speed() {
		// TODO Auto-generated method stub
		
	}
	
}

public class abtractmethd {

	public static void main(String[] args) {
		car c1= new car();
		c1.speed();
	}

}
