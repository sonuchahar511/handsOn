package com.example.demo.coding;

import java.util.Scanner;

public class TwoDArrays {

	
    private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] arr = new int[6][6];

	        for (int i = 0; i < 6; i++) {
	            String[] arrRowItems = scanner.nextLine().split(" ");
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	            for (int j = 0; j < 6; j++) {
	                int arrItem = Integer.parseInt(arrRowItems[j]);
	                arr[i][j] = arrItem;
	              
	            }
	    
	        }

	        for (int i = 0; i < 4; i++) {
	        	
	        	for (int j = 0; j < 4; j++) {
	        		
	        		System.out.print(arr[i][j] + " ");
	        		
	        	}
	        }
	        
	        scanner.close();
	    }
		
		
}
