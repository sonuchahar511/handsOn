package com.example.demo.coding;

import java.util.Scanner;

public class LetterChange {

	public static void main(String[] args) {

		/*
		 * Integer i=null; System.out.println(i.MAX_VALUE+1);
		 * System.out.println(i.MAX_VALUE);
		 */

		Scanner sc = new Scanner(System.in);

		String strr = sc.nextLine();

		changeToNextCharacter(strr);

	}

	public static void changeToNextCharacter(String s1) {
		int arr1 = 0;
		int ar[] = new int[128];
		char ch[] = s1.toCharArray();
		char ch1[] = new char[128];

		for (int i = 0; i <= ch.length - 1; i++) {

			arr1 = ch[i];
			ar[i] = arr1 + 1;

		}

		for (int j = 0; j < ar.length; j++) {
			char c = (char) ar[j];

			ch1[j] = c;
		}

		changeVowelInUpperCase(ch1);

	}

	public static void changeVowelInUpperCase(char ch3[]) {
		char ch2[] = { 'a', 'e', 'i', 'o', 'u' };
		String newConcate = "";

		for (int i = 0; i < ch3.length; i++) {

			for (int j = 0; j < ch2.length; j++) {
				if (ch3[i] == ch2[j]) {
					newConcate = newConcate + Character.toUpperCase(ch3[i]);
				}

			}
		
	
				if (ch3[i] != 'a' && ch3[i] != 'e'&& ch3[i] != 'i'&& ch3[i] != 'o'&& ch3[i] != 'u') {
			newConcate = newConcate + ch3[i];
			
				
			}
			if (i == ch3.length-1) {
				System.out.print(newConcate);
			}
		}

	}

}
