package emc.java;
import java.util.*;

public class factonum {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter ur number: ");
		int num=scan.nextInt();
		
		
	
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}	
		System.out.println("factorial of "+num +" is "+fact);
	}
}

