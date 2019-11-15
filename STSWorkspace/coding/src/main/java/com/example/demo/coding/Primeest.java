package com.example.demo.coding;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Primeest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();

		if (start <= end) {

			for (int i = start; i <= end; i++) {

				findPrimeNumber(i);

			}
		} else {
			System.out.println("Number is not valid");
		}

		sc.close();

	}

	public static void findPrimeNumber(int i) {
		 ArrayList<Integer> lis = new ArrayList<Integer>();
		
		if (i == 0 || i == 1) {
			System.out.println("its not prime number");
		}
		int count = 0;
		for (int j = i; j >= 1; j--) {
			if (i % j == 0) {
				count = count + 1;
			}
		}

		if (count == 2) {
			lis.add(i);
			
		}
		
		
		for(int k:lis)
		{
		System.out.print(k);	
		}
		 
}
	
}
