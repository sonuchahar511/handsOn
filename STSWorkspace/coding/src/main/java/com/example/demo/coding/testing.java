package com.example.demo.coding;

// Power funtion using without using multiplication using addition
public class testing {

	
		// TODO Auto-generated method stub

		/*
		 * System.out.println("Hello"+10+5);
		 * 
		 * System.out.println(10+5+"hello");
		 */
		
		static int pow(int a, int b) 
	    { 
	        if (b == 0) 
	            return 1; 
	              
	        int answer = a; 
	        int increment = a; 
	        int i, j; 
	          
	        for (i = 1; i < b; i++) { 
	            for (j = 1; j < a; j++) { 
	                answer = answer+increment; 
	            } 
	            increment = answer; 
	        } 
	          
	        return answer; 
	    } 
	  
	    // driver program to test above function 
	    public static void main(String[] args) 
	    { 
	        System.out.println(pow(3, 3)); 
	    } 
	} 



