package file;
import java.io.*;

public class SearchStudentByName {

	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("students.csv");
		BufferedReader br = new BufferedReader(fr);
		String key = "ravi";
		String line;
		
		while((line = br.readLine())!=null)
		{
			String[] data =line.split(",");
		if(data[0].equals("id"))
		{
			continue;
		}
		if(data[1].equalsIgnoreCase(key))
		{
			System.out.println(data[0]+ " "+data[1]+ " "+ data[2]);
		}
		}
			

	}

}
