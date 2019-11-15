package test;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		

		 Scanner sc = new Scanner(System.in);
		 int m = sc.nextInt();
		char ch='a';
		if(ch >=1)
		{
			for( ch = 'E' ; ch >= 'A' ; ch-- )
			{
		         System.out.print(ch);
		         System.out.print(" ");
			}
			System.out.print("\n");
		}
		

	}

}
