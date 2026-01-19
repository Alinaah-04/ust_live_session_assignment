package classes;

public class Library {
	int bookid;
	String title;
	String author;
	Library(int bookid,String title,String author)
	{
		this.bookid=bookid;
		this.title = title;;
		this.author = author;
		
	}
	boolean isAvailable()
	{
		if(bookid==1)
		return true;
		
		else
		return false;
		
	}
	public static void main(String[] ags)
	{
		Library b1 = new Library(1,"abc","Antony");
		boolean s = b1.isAvailable();
				if(s==true)
				{
					System.out.println("Available");
				}
				else
				{
					System.out.println("Not Available");
				}}}
		
	
	
