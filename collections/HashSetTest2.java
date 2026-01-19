package collections;
import java.util.*;

public class HashSetTest2 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("yellow");
		set.add("red");
		set.add("blue");
		set.add("green");
		set.add("yellow");
		for(String s : set)
		{
		System.out.println(s);
		}
		
		
	}

}
