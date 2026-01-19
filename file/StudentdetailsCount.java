package file;
import java.io.*;

public class StudentdetailsCount {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("students.csv");
		BufferedReader br = new BufferedReader(fr);
		String line;
		int count=0;
		line = br.readLine();
		while((line = br.readLine())!=null)
		{
			count++;
		}
		System.out.println(count);
		br.close();
		
		

	}

}
