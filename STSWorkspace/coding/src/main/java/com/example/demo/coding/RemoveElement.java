package com.example.demo.coding;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Remove element arr from i
		
		
		int arr[] = { 3, 7, 10, 13, 12, 15 };
		for (int i = 3; i <= 15; i++) {
			for (int j = 0; j <arr.length; j++) {

				if (i == arr[j]) {
					break;

				}
				
				if(j==5)
				
				System.out.print(i + " ");
				
				

			}
			
			
		
		}

	}
}