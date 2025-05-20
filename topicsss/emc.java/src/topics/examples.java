
package topics;
import java.util.*;

public class examples {

String passorfail(int score)
{
	if(score<35)
	{
		return "fail";
	}
	else
	{
		return "pass";
	}
}
	 
	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter ur num");
	int num=scan.nextInt();
	examples e1=new examples();
	String answer=e1.passorfail(num);
	System.out.println(answer);
	
	}

}
