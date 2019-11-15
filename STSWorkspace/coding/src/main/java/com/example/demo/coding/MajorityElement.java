package com.example.demo.coding;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 5 };

		int count = 1;
		int temp = 0;

		int arr1[] = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			
			arr1[arr[i]]++;

		}
	}

}
