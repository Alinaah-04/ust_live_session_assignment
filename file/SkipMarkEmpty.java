package file;
import java.io.*;

public class SkipMarkEmpty {

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
			try {
				int mark = Integer.parseInt(data[2]);
			
			System.out.println(data[0]+" "+data[1]+" "+mark);
			}
		
			catch(NumberFormatException e)
			{
				continue;
			}
			
		}
		}}
		
		
		

	
	


