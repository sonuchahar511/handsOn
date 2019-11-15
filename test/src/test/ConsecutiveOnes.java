package test;

import java.util.Scanner;

public class ConsecutiveOnes {
	
	
	/*public static void main(String args[])
	{
		
	String arr="111001101011001111101011";
			
	String [] arr1=arr.split("0");
	
	int count=0;
	for(String arr2:arr1)
		
		if(arr2.length()>1)
		{
			count++;
		}
	System.out.println(count);	
		
	}*/
	
		 private static final Scanner scanner = new Scanner(System.in);

	     public static void main(String[] args) {
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	int count = 0;
	int consecutiveone = 0;
	        while(n > 0) {
	if(n % 2 == 0) {
	count = 0;
	} 
	if(n%2 == 1) {
	count++;
	if(count >= consecutiveone) {
	consecutiveone = count;
	} 
	}
	n= n/2;
	}
	System.out.println(consecutiveone);
	scanner.close();
	    }

		
		
	}
	

