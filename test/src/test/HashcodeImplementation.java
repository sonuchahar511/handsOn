package test;

import java.util.HashMap;
import java.util.Map;

public class HashcodeImplementation {
	
	public static void main(String[] args) {
		
		HascodeExample has= new HascodeExample();
		has.setId(1);
		has.setName("A");
	
		
		HascodeExample has1= new HascodeExample();
		has1.setId(2);
		has1.setName("D");
		
		
		HascodeExample has2= new HascodeExample();
		has2.setId(1);
		has2.setName("E");
		
		HascodeExample has3= new HascodeExample();
		has3.setId(3);
		has3.setName("B");
		
		
		
		Map<Integer, HascodeExample> maps = new HashMap<Integer,HascodeExample>();
		
		maps.put(has.hashCode(),has);
		maps.put(has1.hashCode(),has1);
		maps.put(has2.hashCode(),has2);
		maps.put(has3.hashCode(),has3);

		System.out.println(maps);
		
		
	}
	
	


}
