package com.example.demo.CodeByte;

import java.util.Scanner;

class SimpleAdding {

	public static int SimpleAdding(int num) {
		// code goes here

		int sum1 = 0;
		for (int i = 1; i <= num; i++) {
			sum1 = sum1 + i;
		}

		return sum1;
	}

	public static void main(String[] args) {
		// keep this function call here

		Scanner s = new Scanner(System.in);
		System.out.print(SimpleAdding(Integer.parseInt(s.nextLine())));

	}
}