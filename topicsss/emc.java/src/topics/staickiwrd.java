package topics;

class student{// static is based on the class not on the object;
	  // use class name to access the variable not in object name
   static	int mark =0;
	
}

public class staickiwrd {
public static void main(String[] args) {
	student s1= new student();
	student.mark=53;
	student s2= new student();
	student.mark=78;
	
	
	student.mark=94;// the last value is changed in all the type
	
	System.out.println(student.mark);

	System.out.println(student.mark);
}}
 // we can also use function to access the variable
	// only static member can access the static value;
	// we also having static block which is 
//	static{
//		System.out.println("hey there!");
//	} class load agara apo mattu static block 1st load aagu


