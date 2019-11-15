package test;

import java.util.HashMap;
import java.util.Map;

public class map1 {
	 public static void main(String args[])
	 {
		 Map<Integer,String> map= new HashMap<Integer,String>();
		 {
			 map.put(1, "A");
			 map.put(2, "B");
			 map.put(3, "C");
			 map.put(4, "D");
			 map.put(5, "E");
			 for(Map.Entry<Integer, String> m:map.entrySet())
			 {
				 System.out.println(m.getKey()+" "+m.getValue());
			 }
		 }
	 }

}
