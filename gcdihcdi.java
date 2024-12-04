package emc.java;
import java.util.*;
public class gcdihcdi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter ur number:");
		int a=scan.nextInt();
		int b= scan.nextInt();
	    int g=0;
		for(int i=1;i<=a;i++){
			{
				if(a%i==0 && b%i==0) 
					g=i;
					
				
			}
			System.out.println("GCD ="+g);
			
		}
		
	}

}
