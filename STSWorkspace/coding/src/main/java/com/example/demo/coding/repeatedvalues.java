package com.example.demo.coding;

public class repeatedvalues {

	public static void main(String[] args) {

		
		int arr[] = { 1, 2, 2, 3, 4, 4, 5, 6 };
		int arr1[] = new int[6];
		
		  for(int i=1;i<8;i++) 
		  { 
		  arr1[arr[i]]++; 
	
		  System.out.print(arr1[i]);
		  
			/* System.out.print(arr[i]); */
		  
		  }
		  
		/*
		 * for(int i=0;i<7;i++) { if(arr1[i]>1) { System.out.print(arr[i]); } }
		 */
		 

	}

}
