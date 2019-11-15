package test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class test10 {
	public static int[] alternateSorting(int[] input1)
    {

		for (int number :input1) 

         Arrays.sort(input1);
		 int temp[] = input1;
	      
	        int small=0, large=input1.length-1;
	      
	        
	        boolean flag = true;
	      
	        // Store result in temp[]
	        for (int i=0; i<input1.length-1; i++)
	        {
	            if (flag)
	                temp[i] =input1[large--];
	            else
	                temp[i] = input1[small++];
	      
	            flag = !flag;
	        }
	      
	        // Copy temp[] to arr[]
	        input1  = temp.clone();
		return input1;
       /* int n=input1.length-1, temp;
		for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (input1[i] > input1[j]) 
                {
                    temp = input1[i];
                    input1[i] = input1[j];
                    input1[j] = temp;
                }
            }
        }
		for (int i = 0; i < n - 1; i++) 
        {
			 int tem[] = new int[n];
		      
		        
		        int small=0, large=n-1;
		      
		        boolean flag = true;
		      
		        for (int i=0; i<n; i++)
		        {
		            if (flag)
		                temp[i] = arr[large--];
		            else
		                temp[i] = arr[small++];
		      
		            flag = !flag;
		        }
		      
		      
		        arr  = temp.clone();
		    }
	         
        }*/
	 
	 }




 public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int[] output = null;
        int ip1_size = 0;
        ip1_size = Integer.parseInt(in.nextLine().trim());
        int[] ip1 = new int[ip1_size];
        int ip1_item;
        for(int ip1_i = 0; ip1_i < ip1_size; ip1_i++) {
            ip1_item = Integer.parseInt(in.nextLine().trim());
            ip1[ip1_i] = ip1_item;
        }
        output = alternateSorting(ip1);
        for(int output_i=0; output_i < output.length; output_i++) {
	        	System.out.println(String.valueOf(output[output_i]));
	            }
    }

}
