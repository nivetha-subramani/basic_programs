package emc.java;
import java.util.*;
public class plainrome {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in) ;
		System.out.println("enter ur number:");
		
		
		//(............int palinrome...........)
		
		
		/*int num=scan.nextInt();
		
		int rev=0;
		
		int orglvl=num;
		
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
		if(orglvl==rev) {
			System.out.println(orglvl+"it a palinrome");
		}
		
		else
		{
			System.out.println(orglvl+"no it a not a plainrome");
		}*/
		
		
		///.(............... palinrome string..........)
		
		
		String name="MadaM";
		String rev="";
		
		String orgvl=name;
		
		int len=name.length();
		
		for(int i=len-1;i>=0;i--) {
			
			
			rev=rev+name.charAt(i);
		}
		
		if(orgvl.equals(rev)) {
			System.out.println(orgvl+"it is a palinrome");
		}
		else
		{
			System.out.println(orgvl+"not a palinrome");
		}
		
			
		System.out.println( rev);

	}

}
