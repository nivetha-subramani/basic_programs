package topics;
interface Readable{
	void read();
	
}
interface Writable{
	void write();
}
interface Storable{
	void store();
	
}

class File implements Readable,Writable,Storable{

	@Override
	public void store() {
		System.out.println("it will store");
		
	}

	@Override
	public void write() {
		System.out.println("it will write");
		
	}

	@Override
	public void read() {
		System.out.println("it  will read");
		
	}
	
}
public class infxam3 {
	public static void main(String[] args) {
		File f1=new File();
		f1.read();
		f1.write();
		f1.store();
		
	}

}
