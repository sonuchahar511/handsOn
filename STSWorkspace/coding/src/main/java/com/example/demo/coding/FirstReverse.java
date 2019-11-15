package com.example.demo.coding;

import java.util.Scanner;

public class FirstReverse {

	public static String FirstReverse(String str) {
		// code goes here

		String str1 = "";

		char ch[] = str.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			str1 = str1 + ch[i];
		}

		return str1;
	}

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		System.out.print(FirstReverse(s.nextLine()));
	}

}
