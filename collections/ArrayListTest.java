package collections;
import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>();
		array.add("alina");
		array.add("malu");
		array.add("anitta");
		array.add("ali");
		array.add("aleesha");
		
		for(int i = 0;i<array.size();i++)
		{
			System.out.println(array.get(i));
		}
		
		
		
	}

}
