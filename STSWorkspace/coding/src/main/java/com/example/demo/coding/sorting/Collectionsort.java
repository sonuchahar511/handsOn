package com.example.demo.coding.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collectionsort {
	
	
	public static void main(String[] args) {
		

		
		
		List<Integer>list = new ArrayList<Integer>();
		
		list.add(41);
		list.add(4);
		list.add(46);
		list.add(40);
		
		/* Collections.sort(list,Collections.reverseOrder()); */
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
	}

}
