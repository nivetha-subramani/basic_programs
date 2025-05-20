package topics;

 class animal{
	 
	 int age =21;
	 animal(String name)
	 {
		 System.out.println(":its an animal");
	 }
	 // by using super keyword we can call a function also;
	 
	 void makesound()
	 {
		 System.out.println("lollolll");
	 } 
 }
 
 class dog extends animal{
	 dog()
	 {
		super("key");
		super.makesound();
		System.out.println(super.age);
		 System.out.println(":its a golderdertiver dog!");
	 }
 }


public class sperkiiwrd {

	public static void main(String[] args) {
		dog d1 = new dog();
		

	}

}
