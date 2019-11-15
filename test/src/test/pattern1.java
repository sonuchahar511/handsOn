package test;

import java.util.Scanner;

public class pattern1 {

	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
		 int m = sc.nextInt();
		
		for(int i=1; i<=m;i++)
		{
			for(int j=1; j<=5;j++)
			{
				System.out.print(j);
				
			}
			System.out.print("\n");
		}
	}
}
