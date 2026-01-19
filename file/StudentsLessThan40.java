package file;
import java.io.*;

public class StudentsLessThan40 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("students.csv");
		BufferedReader br = new BufferedReader(fr);
		String line;
		while((line = br.readLine())!=null)
		{
			String[] data = line.split(",");
			if(data[0].equals("id"))
			{
				continue;
			}
			int marks = Integer.parseInt(data[2]);
			
				if(marks < 40)
				{
					System.out.println(data[0] + " "+data[1]+" " + data[2]);
				}
			
			
		}
	}

}
