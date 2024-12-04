package emc.java;

public class reveser_string {

	public static void main(String[] args) {
		
		
		/*String str="ABCD";
		String rev=null;
		
		int len=str.length();//8
		
		for(int i= len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}*/
		
		String name="dharshini";
		String rev="";
		
		/*char a[]=name.toCharArray();
		
		int len=a.length;
		
		for(int i=len-1;i>=0;i--)
		{
			
			rev=rev+a[i];
		}*/
		
		
		StringBuffer sb= new StringBuffer(name  );
		System.out.println(sb.reverse());
		

	}

}
