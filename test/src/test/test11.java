package test;

import java.util.Arrays;

public class test11 {
	public static void main(String args[])
	{
		
		int[]input1 = {8,3,5,7,2,1};

		
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
		
		System.out.println(input1);
		
		/*int arr[] = {8,3,5,7,2,1};

        Arrays.sort(arr);
        
        for(int i=0; i <arr.length; i++){
        	 
            System.out.print(arr[i]);
 
	}
*/
}
}
