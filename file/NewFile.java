package file;
import java.io.*;

public class NewFile {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("students.csv");
		BufferedReader br = new BufferedReader(fr);
		String line;
		File file = new File("passed_students.csv");
		FileWriter fw = new FileWriter("passed_students.csv");
		file.createNewFile();
		
		while((line=br.readLine())!=null)
		{
			String[] data = line.split(",");
			if(data[0].equals("id"))
			{fw.write(data[0]+","+data[1]+","+data[2]);
				continue;
			}
			int mark = Integer.parseInt(data[2]);
			if(mark >=50)
			{
				fw.write(data[0]+","+data[1]+","+data[2]+"\n");
			}
		}
		
		fw.close();
	
		br.close();

	}

}
