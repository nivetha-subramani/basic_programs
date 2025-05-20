package topics;
 import java.io.FileWriter;
 import java.io.BufferedWriter;

public class Fillwrtier {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("output.txt",true);
			BufferedWriter bw= new BufferedWriter(fw);
			bw.write("hii im nivetha");
			bw.newLine();
			bw.write("\"currently studing fullstack\"");
			bw.close();
			
			
			System.out.println("success");
			
		}
		catch (Exception err)
		{
			System.out.println("somthing has happend");
		}
		
		

	}
//	try {// this is for only filewriter.
//		FileWriter fw = new FileWriter("output.txt",true);
//		fw.append("world");
//		fw.close();
//		System.out.println("success");
//		
//	}
//	catch (Exception err)
//	{
//		System.out.println("somthing has happend");
//	}

}


