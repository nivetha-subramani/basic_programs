package topics;
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
import java.io.FileReader;
public class Filereader {

	public static void main(String[] args) {
		try {
			FileReader fr= new FileReader("output.txt");
			int c = fr.read();// it will read one by one character.
			System.out.println((char)c);
			c = fr.read();
			fr.close();
			
		}
		catch (Exception err) 
		{
			
		}
		
		

	}

}
