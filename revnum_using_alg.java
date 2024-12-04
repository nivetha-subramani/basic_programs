package emc.java;

public class revnum_using_alg {

	public static void main(String[] args) {
		// using algorithm
		
		/*int num=9876;
		
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		    
		}*/
		
		
		// using stringbuffer
		
		/*int num=5678;
		
		StringBuffer rev;
		
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		
		    rev= sb.reverse();*/
		
		
		// string bulider
		
		
		int num=12345;
		StringBuilder sb=new StringBuilder();
		
		sb.append(num);
		
		StringBuilder rev= sb.reverse();
		
		
		
		
		
		
		
		System.out.println("the reverser num is:"+rev);
	}

}
