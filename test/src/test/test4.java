package test;

public class test4 {

	 public static void main (String[] args)
	{
		 int input1[] = {10, 5, 3, 4, 3, 5, 6};
		
		 int input2[] = {10, 1, 7, 4, 67, 5, 6};
		 
		 boolean fun = false;

         for(int i = 0; i <  input1.length; i++)
         {
             fun = false;

             for(int j = 0; j < input2.length; j++)
             {
                 if(input1[i]==input2[j])
                 {
                     fun= true;
                 }

             }
             if(!fun)
             {

                 System.out.print(input1[i]+" "+"$");
             }

         }
         for(int i = 0; i < input2.length; i++)
         {
             fun = false;

             for(int j = 0; j < input1.length; j++)
             {
                 if(input2[i]==input1[j])
                 {
                     fun = true;
                 }
             }
             if(!fun)
             {
                 System.out.print(input2[i]+" "+"$");

             }
         }
         } 
	}

