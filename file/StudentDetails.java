package file;
import java.io.*;

public class StudentDetails {

	public static void main(String[] args) throws IOException {
		
		File file = new File("students.csv");
		file.createNewFile();
		FileWriter fw = new FileWriter("students.csv");
		fw.write("id,name,marks\n");
		fw.write("101,Ravi,78\n"); 
		fw.write("102,Anita,85\n");
		fw.close();
		
	}

}
