package collections;
import java.util.*;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1,"god");
		map.put(2,"alina");
		map.put(3,"anitta");
		map.put(4,"malu");
		map.put(5,"ali");
		
		for(Integer k : map.keySet())
		{
			System.out.println(k + ":" +map.get(k));
		}
		
		
	}

}
