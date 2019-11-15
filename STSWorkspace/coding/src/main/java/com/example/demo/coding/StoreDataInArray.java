package com.example.demo.coding;

import java.util.Scanner;

public class StoreDataInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int arr[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		int i=0;
		
		for( i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		
		for(int j=0;j<arr.length;j++)
		{
			System.out.println(arr[j]);
		}
		
		
		/*
		 * for(int i=0;i<=arr.length;i++) {
		 * 
		 * }
		 */
		
	}

}

