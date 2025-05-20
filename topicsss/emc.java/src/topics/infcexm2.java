package topics;
/*how to acrhive multple inhertiance by using interface
 * it has implements two clss c implemnts a,b*/
interface Printable
{
	void display();
}
interface Showable
{
	void display();
	
}
class Document implements Printable,Showable
{

	@Override
	public void display() {
		System.out.println("it will display both the features");
		
	}
	
}
public class infcexm2 {
	public static void main(String[] args) {
		Document obd1= new Document();
		obd1.display();
		
		
	}

}
