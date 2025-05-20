package topics;

public class constror {
	
	int mark;
	String  subject;
	
	constror(int a,String b)
	{
	    mark=a;
	    subject=b;
		
	}
	
	public static void main(String[] args) {
		constror c1= new constror(82,"tamil");
		System.out.println(c1.mark);
		System.out.println(c1.subject);
	
		
	}

}
 