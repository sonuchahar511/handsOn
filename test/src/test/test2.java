package test;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class test2 {
	
	public static void main(String arg[]){
	Integer[] numbers = {1, 1, 2, 1, 3, 4, 5};
		
	Set<Integer> uniqKeys = new TreeSet<Integer>();
	
	uniqKeys.addAll(Arrays.asList(numbers));
	
	System.out.println("uniqKeys: " + uniqKeys);
}
}