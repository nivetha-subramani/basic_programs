package emc.java;
import java.util.*;
public class fibonum {

	public static void main(String[] args) {
	int fnum=0; 
	int snum=1;
	int nextnum;
	
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	int i=0;
	while(i<=num) {
		System.out.print(fnum+", ");
		nextnum=fnum+snum;
		fnum=snum;
		snum=nextnum;
		
		i++;
	}

	}

}
