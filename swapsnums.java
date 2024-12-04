package emc.java;

public class swapsnums {

	public static void main(String[] args) {
	  int a=75;
	  int b=82;
	  
	  System.out.println("before swap a="+a+"b="+b);
	  
	  a=a+b;
	  b=a-b;
	  a=a-b;
	  
	  System.out.println("after swap a="+a+"b="+b);
	}

}
