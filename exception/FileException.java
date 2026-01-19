package exception;
import java.io.*;

public class FileException {

	public static void main(String[] args) {
		
		FileReader fr = null;
		try
		{
			
			fr = new FileReader("yyt.txt");
			int ch;
			while((ch = fr.read())!=-1)
			{
				System.out.println((char) ch);
			}
		}
		catch(IOException e)
		{
			System.out.println("file error occured");
		}
		finally
		{
			try
		{
				if(fr!=null)
				{
			fr.close();
			System.out.println("File closed");
		}
		}catch(IOException e)
		{
		System.out.println("Error while closing file");
		}
}
}
}
