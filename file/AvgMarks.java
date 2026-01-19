package file;
import java.io.*;

public class AvgMarks {

	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("students.csv");
		BufferedReader br = new BufferedReader(fr);
		String line;
		int sum =0;
		int avg =0;
		int count = 0;
		while((line = br.readLine())!=null)
		{
			
			String[] data = line.split(",");
			if(data[0].equals("id"))
					{
				continue;
				
			}
			count++;
			int mark = Integer.parseInt(data[2]);
			sum = sum + mark;
			
			
		}
		avg = sum/count;
		System.out.println("Average is "+avg);
		
		

	}

}
