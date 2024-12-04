package emc.java;
import java.util.*;
public class vowlprinstrg {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.println("enter ur str= ");
		String letter=scan.nextLine();
		
		int store=0;
		for(int i=0;i<letter.length();i++)
		{
			if(letter.charAt(i)=='a' || letter.charAt(i)=='e' || letter.charAt(i)=='i' || letter.charAt(i)=='o'||letter.charAt(i)=='u')
			{
				System.out.println("vowel present");
				store=1;
				break;
				
			}
		}
		if(store==0)
		{
			System.out.println(":no vowel is present in ur input");
		}
		
		
		
		
		
		

	}

}
