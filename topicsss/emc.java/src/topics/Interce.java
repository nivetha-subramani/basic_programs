package topics;
interface wanimal{

	int mark=20;//public static final ... we cannot change this value further
    void sound();	
}
class caat implements wanimal{

	@Override
	public void sound() {
		System.out.println("meeroww");
		
	}
	
}
	

public class Interce {
//	animal a1= new animal();// we cant create a object for animal
	public static void main(String[] args) {
		 caat c11= new caat();
		    c11.sound();
	}
   
    
    
    
}


//void display() {
//
//} default it will take it as abstract cls.so it should not have body.

// after the java8 version, we came to know that 
// we can create body for abstract class by using static void disply()& default void displ()