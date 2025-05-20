package topics;
import java.util.Scanner;
import java.util.*;
class InvalidAgeException extends Exception{
	public InvalidAgeException( String ans)
	{
		super(ans);
	}
}

class AgeValidator{
	void checkAge(int age)
	{
		try {
			if(age<0 || age>150)
			{
				throw new InvalidAgeException("age is invalid");
			}
			else
			{
				System.out.println("valid age");
			}
			
		}
		catch(Exception err)
		{
			System.out.println(err);
		}
		
		
	}
	
}

public class excptegss {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int age=scan.nextInt();
		AgeValidator A1= new AgeValidator();
		A1.checkAge(age);
		
	}

}
// example one.
//class DivisionExample{
//	void divideNumbers(int numerator, int denominator)
//	{
//		try {
//			int result=numerator/denominator;
//			System.out.println("result is "+result);
//		}
//		catch(ArithmeticException err){
//			if(denominator==0) {
//				System.out.println("cannot divide by zero");
//				

//Scanner scan=new Scanner(System.in);
//int n1=scan.nextInt();
//int n2=scan.nextInt();
//
//DivisionExample d1=new DivisionExample();
//d1.divideNumbers(n1,n2);
//			}
//		}
//	}
//}