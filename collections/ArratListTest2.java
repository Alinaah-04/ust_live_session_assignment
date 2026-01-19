package collections;
import java.util.*;

public class ArratListTest2 {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(5);
		array.add(4);
		for(int i=0;i<array.size();i++){
			System.out.println(array.get(i));
			
		}
		System.out.println("____________________________________");
		array.remove(4);
		for(int i=0;i<array.size();i++){
			System.out.println(array.get(i));
			
		}
		
	}

}
