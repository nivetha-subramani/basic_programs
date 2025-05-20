package topics;
import java.util.*;
public class swtchcase {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		//String fruits=scan.next();
		
		/*
		 * switch(fruits) {
		 * 
		 * case "MAngo": System.out.println("yummy"); break; case "cherry":
		 * System.out.println("sourr"); break; case "apple":
		 * System.out.println("my favoo"); break; default:
		 * System.out.println("enter vaild input");
		 * 
		 * }
		 */
		 System.out.print("Enter ur input:");
   int day=scan.nextInt();
  
   switch(day) {
  
   case 1-> System.out.println("monday");
   case 2-> System.out.println("tuesday");
   case 3-> System.out.println("wednesday");
   case 4-> System.out.println("thrusday");
   case 5-> System.out.println("friday");
   }
   
	}

}
