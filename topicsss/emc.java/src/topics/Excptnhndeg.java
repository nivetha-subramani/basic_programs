package topics;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Excptnhndeg {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		try {
			int a= scan.nextInt();
			int b=10/0;
			
		}
		catch(InputMismatchException  err)
		{
			System.out.println(err);
		}
		catch(ArithmeticException err)
		{
			System.out.println(err);
		}
		
		
		
			System.out.println("Welcome learning");
	}

}


/*exception handling
 * try {
			int a = scan.nextInt();
		}
		
		catch(Exception err){
			System.out.println(err);
		}// it is input  mismatch error
		
		
try {
			int a=10/0;
		}
		catch(Exception err)
		{
			System.out.println(err);
		}// arithmetic exception
		
	
try {
			int a= scan.nextInt();
			int b=10/0;
			
		}
		catch(InputMismatchException  err)
		{
			System.out.println(err);
		}
		// it will not handle the exception becz we tell them to handle only the ipmismatch error;
		 * 
		
 * we use try & catch block
 * decently shows the error in bule line are else it will shows like para red line
 * 
 *  we have different type of exception this one is input missmatch exception*/

 