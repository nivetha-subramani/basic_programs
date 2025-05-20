package functionss;
import java.util.*;

public class returnusername {
public static void main(String[] args) {
	
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter your input:");
	
	String name= scan.next();
	
	String result=details(name);
	System.out.println(result);
}

static String details(String name) {
	String msg = name;
	return msg;
}
}
