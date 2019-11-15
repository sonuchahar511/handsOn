package com.example.demo.coding.sorting;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arr = { 2, 10, 5, 6, 1, 11, 15, 17 };
		
	    Arrays.sort(arr, Collections.reverseOrder()); 
		
		System.out.println(	Arrays.toString(arr));

	}

}
