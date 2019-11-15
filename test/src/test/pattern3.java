package test;

import java.util.Scanner;

public class pattern3 {
	
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
		 int m = sc.nextInt();
		char ch;
     for(int i=1;i<=m;i++)
     {
    	 for( ch='A';ch<='E';ch++ )
         	 {
    		 System.out.print(ch);
    	 }
    	 System.out.print("\n");
     }

}
}