package test;

import java.util.HashMap;
import java.util.Map;

public class hashmapIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Map<Integer, String> maps = new HashMap<Integer, String>();
	
	maps.put(1, "i");
	maps.put(2, "have");
	maps.put(3, "have");
	maps.put(4, "car");
	
	for(Map.Entry<Integer, String> entry :maps.entrySet())
		
		System.out.println(entry);
		
		
		
	}

}
