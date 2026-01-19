package file;
import java.io.*;


public class HighestMark {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("students.csv");
		fw.write("103,Sunil,35\n");
		fw.write("104,Priya,92\n");
		fw.write("105,Aman,45\n");
		fw.close();
		FileReader fr = new FileReader("students.csv");
		BufferedReader br = new BufferedReader(fr);
		String line;
		int largest = 0;
		String toppername ="";
		while((line = br.readLine())!=null)
		{
			String data[] = line.split(",");
			if(data[0].equals("id")) {
				continue;
			}
			int mark = Integer.parseInt(data[2]);
			if(mark > largest)
			{
				largest = mark;
				toppername = data[1];
				
			}
		}
		System.out.println("Topper is "+toppername);
		System.out.println("largest is "+largest);
		

	}

}
