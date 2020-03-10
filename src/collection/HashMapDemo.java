package collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "abc");
		map.put(2, "pqr");
		map.put(3, "xyz");
		
		//Step 1 fetch the keys
		
		/*Set<Integer> set = map.keySet();
		
		
		
		//Iterate
		
		for(Integer abc: set) {
			System.out.println(abc);
		}
		*/
		
		for(Entry<Integer, String> abc: map.entrySet()) {
			System.out.println(abc.getKey()+" "+abc.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
