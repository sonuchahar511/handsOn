package test;

import java.util.Scanner;

public class test13  {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long len= s.length();
    
        long tp= n/len;
        int count =0;
  
		for (int i = 0; i <  s.length(); i++)
		{
			 char ch = s.charAt(i);
			if (ch == 'a')
			{
				count++;
 
			}
			
		}
		/*System.out.println(+count);*/
		long v= count*tp; 
		System.out.println(+v);
long st=0;
		for (int i = 0; i < st; i++)
		{
			if ((s.charAt(i) == 'a'))
			{
				count++;
 
			}
		}
		System.out.println(+count);

    }
}

