package com.example.demo.coding;

public class SimpleSymbols {

	public static void main(String[] args) {

		String str = "+d+=3=+s+";

		char ch[] = str.toCharArray();

		char ch1[] = new char[123];

		int findchar[] = new int[9];

		for (int i = 0; i < ch.length; i++) {

			findchar[i] = ch[i];

		}

		for (int j = 0; j < findchar.length; j++) {

			if (findchar[j] >= 97 && findchar[j] <= 122) {
				System.out.print(findchar[j] + " ");

			}
			
			

		}
	}

}
