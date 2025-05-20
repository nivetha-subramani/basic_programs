package topics;// custom exception 
import java.util.Scanner;
class NotVaildException extends Exception{
	NotVaildException(String ans)
	{
		super(ans);
		
	}
	
	
	
}
public class custmexcpeg {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		try {
			int age=scan.nextInt();
			if(age<18) {
				throw new  NotVaildException("your age should above 18" );
			}
			
			
		}
		catch (NotVaildException err)
		{
			System.out.println(err);
		}
		catch(Exception err)
		{
			System.out.println(err);
		}
	}

}
