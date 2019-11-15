package com.example.demo.coding;

import java.util.Scanner;

public class MaximalSquare {

	public static void main(String[] args) {
		// keep this function call here
		try(Scanner s = new Scanner(System.in))
		{

		String str = s.nextLine();

		String[] st = str.split(",");

		MaximalSquare(st);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		/* System.out.println(MaximalSquare(st)); */
	}

	public static String MaximalSquare(String[] strArr) {

	int count =0; char[] arrI =null;
		for (int i = 0; i < strArr.length; i++) {

			 arrI = strArr[i].toCharArray();
			 
			int[] arr= new int[strArr.length-1];
			
			for (int j = 0; j < arrI.length; j++) {
				
				System.out.print(arrI[j]+" ");
				
				
				
				if(j < arrI.length-1) {
				
				if(arrI[j]==arrI[j+1])
				{
					count++;
				}
			
				arr[i]=count;
				
				}
				/*
				 * if(i>0 && j<4) { if((strArr[i-1].charAt(j)=='1' &&
				 * strArr[i].charAt(j)=='1')&& (strArr[i-1].charAt(j+1)=='1' &&
				 * strArr[i].charAt(j+1)=='1')) { count++; } }
				 */
			}
			
			
			for(int x=0;x<=arr.length; x++)
			{
				if(arr[x]>=arr[x+1])
				{
					System.out.println(arr[x]);
					
				}
				
				else {
					System.out.println(arr[x+1]);
				}
			}
			System.out.print("\n");
		}
		
		System.out.println(count * count);
		
		
		
		return strArr[0];

	}

}
