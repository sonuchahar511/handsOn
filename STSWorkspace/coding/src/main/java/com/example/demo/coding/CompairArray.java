package com.example.demo.coding;

public class CompairArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 17, 3, 10, 5, 7, 11, 13, 15 };

		int ar1[] = new int[19];

		
		  for (int i = 0; i < 8; i++) { 
			  ar1[arr[i]]++;
		  
			/* System.out.print(ar1[i]); */
		  
		  }
		 

		for (int i = 0; i <= 17; i++) {

		
			
			/* System.out.print(ar1[i]); */

			if (ar1[i] == 0 && i > 3) {
				 System.out.print(i+" "); 
			}
			/* System.out.print(i+" "); */
		}

	}

}
