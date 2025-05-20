package topics;

class cal{
	void div() throws Exception// who calls me they can handle the error that is throws
	{
		int a=10/0;
		
		// i know it throws error we use try catch 
	}
}
public class thowwssssskiw {
	public static void main(String[] args) {
		cal c1= new cal();
         try {
        		c1.div();
		}
		catch(Exception err)
		{
			System.out.println(err);
		}
	
		
	}

}
