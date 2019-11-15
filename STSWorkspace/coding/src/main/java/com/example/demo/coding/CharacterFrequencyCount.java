package com.example.demo.coding;

public class CharacterFrequencyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="geekforgeeks";
		
		char ch[]=str.toCharArray();
		int arr[] = new int[122];
		
		for(int i=0;i<str.length();i++)
		{
			arr[ch[i]]++;
		}
		
		
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]>0)
			{
			
				/* System.out.print(arr[i]+" "); */
				
				System.out.print(arr[i]+" "); 
			}
		}
		
		
	}

}
