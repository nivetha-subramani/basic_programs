package topics;

public class thsskiwrd {
	String myname;//null
	
	thsskiwrd()
	{
		System.out.println("heloo");
	}
	
	void setNAme(String myname)//,mark
	{
		this.myname=myname;
	}
	
	
	
	public static void main(String[] args) {
		thsskiwrd t1=new thsskiwrd();
		t1.setNAme("mark");
		System.out.println(t1.myname);
		
		
	}
}
