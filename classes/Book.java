package classes;

public class Book {
	String bookname;
	String genre;
	String author;
	Book()
	{
		bookname = "Alice in wonderland";
		genre="Fatancy";
		 author = " V.A Antony";
	}
	Book(String bookname,String genre,String author)
	{
		this.bookname = bookname;
		this.genre = genre;
		this.author = author;
	}
	void display()
	{
		System.out.println("Name :"+ bookname);
		System.out.println("Genre :"+ genre);
		System.out.println("Author :"+ author);
		
	}
	public static void main(String[] args)
	{
		Book b1 = new Book();
		Book b2 = new Book("Alchemist","Fatancy","Paulo");
		b1.display();
		b2.display();
	}
}
