package com.example.demo.BasicCoreConcept;

public class Concept1 {
	
	
	// i am passing character instead of int or float it will excute properly
	//call int method print the output 99(small c value is 99 )
	
	// if only float method are 
	
	
	public void methods(float j)
	{
		System.out.println(j);
	}
	
	/*
	 * public void methods(int i) { System.out.println(i); }
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Concept1 con = new Concept1();
		
		con.methods('c');
		
		
	}

}
