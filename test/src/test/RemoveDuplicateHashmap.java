package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> hash = new HashMap<Integer,String>();
	
		hash.put(1, "i");
		hash.put(2, "have");
		hash.put(3, "have");
		hash.put(4, "car");
				  
		Set<String> sets = new HashSet<String>();
		sets.addAll(hash.values());
				
		System.out.println(sets);
		
		
		
	}

}
