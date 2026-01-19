package file;
import java.io.*;

import java.io.FileReader;

public class SudentDetailsRead {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("students.csv");
		BufferedReader br = new BufferedReader(fr);
		String line;
		while((line = br.readLine())!=null)
		{
			String[] data = line.split(",");
			for(String value : data)
			{
				System.out.print(value+" ");
			}
			System.out.println();
		}
		br.close();

	}

}
