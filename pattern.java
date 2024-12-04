package emc.java;
import java.util.*;
public class pattern {

	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	int row= scan.nextInt();
	int col=scan.nextInt();
	
	for (int i=0; i<row;i++)
	{
		for(int j=0; j<col;j++)
		{
			if(i==0 || i==row-1 || j==0 || j==col-1)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		
		System.out.println();
		
	}
	}

}
 