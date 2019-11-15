package com.example.demo.coding;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try
		{
			int array[]= new int[10];
			
			
			array[10] =30/0;
			
		}
		catch (Exception | ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println();
			
		}
	}

}
