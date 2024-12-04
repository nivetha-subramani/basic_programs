package emc.java;import java.util.*;
public class armtrognnum {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		int n= scan.nextInt();
		
		int temp=n;
		int r,sum=0;
		
		while(n>0)
		{
			r=n%10;
			sum=n/10;
			sum=sum+r*r*r;
			
		}
		if(temp==sum) {
			System.out.println("its an armstrong number");
		}
		else
		{
			System.out.println("its not an armstrong number");
		}
	}

}
