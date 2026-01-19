package collections;
import java.util.*;

public class HashMapTest2 {

	public static void main(String[] args) {
		HashMap<Integer,String> hash = new HashMap<>();
		hash.put(101,"America");
		hash.put(102,"China");
		hash.put(103,"India");
		
		for(Integer k : hash.keySet())
		{
			System.out.println(k+" "+hash.get(k));
		}
		
		

	}

}
