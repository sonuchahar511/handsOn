package com.example.demo.coding.naggrow;

public class RepeatElementMoreThanHalfFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 4, 4, 4, 4, 7, 7 };

		int len=arr.length;
		
		int ar1[] = new int[8];

		for (int i = 0; i < arr.length; i++) {

			ar1[arr[i]]++;
			
			
		}
		
		for(int i=0; i<ar1.length;i++)
		{
			if(ar1[i]==len/2)
			{
				System.out.print(ar1[i]);
			}
			
			
		}

	}

}
