package collections;
import java.util.*;

public class ArrayListTest5 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("orange");
		
		list.add("mango");
		if(list.contains("apple"))
		{
			System.out.println("apple present");
		}
		else {
		
				System.out.println("apple not present");
		}
			
		
	}

}
