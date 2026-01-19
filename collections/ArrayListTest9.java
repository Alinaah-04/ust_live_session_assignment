package collections;
import java.util.*;

public class ArrayListTest9 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("hlo");
		list.add("welcome");
		list.add("god");
		String s[] = list.toArray(new String[0]);
		for(int i = 0; i< s.length;i++)
		{
			System.out.println(s[i]);
		}
			
		
	}

}
