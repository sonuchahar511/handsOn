package test;

import java.util.Scanner;

public class Scannarclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		Double d  = scan.nextDouble();
		String s  = scan.nextLine();
		
		/*int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println(a+"\n"+b+"\n"+c);*/
		
	/*	If  is odd, print Weird
		If  is even and in the inclusive range of  to , print Not Weird
		If  is even and in the inclusive range of  to , print Weird
		If  is even and greater than , print Not Weird*/
		/*if(n%2!=0)
		{
			System.out.println("Weird");
		}
		else if(n%2==0 && (n>=2 && n<=5))
		{
			System.out.println("Not Weird");
		}
		
		else if(n%2==0 && (n>=6 && n<=20))
		{
			System.out.println("Weird");
		}
		else if(n%2==0 && n>20)
		{
			System.out.println("Not Weird");
		}*/

		
		System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
		
		
		
	}

}
