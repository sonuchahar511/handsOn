package test;

import java.util.Stack;

public class stackIMplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Stack<String> stack = new Stack<String>(); 
		    stack_push(stack); 
	        stack_pop(stack); 
	        stack_push(stack); 
	}
	
	
	   static void stack_push(Stack<String> stack) 
	    { 
		   String str="a,b,+";
		   
		   String []s1=str.split(",");
		   
		  
		   
	        for(int i = 0; i < 3; i++) 
	        { 
	            stack.push(s1[i]); 
	        } 
	    }
	
	   static void stack_pop(Stack<String> stack) 
	    { 
	        System.out.println("Pop :"); 
	  
	        for(int i = 0; i < 3; i++) 
	        { 
	        	String y = (String) stack.pop(); 
	        	
	        	
	            System.out.println(y); 
	        } 
	    }

}
