package com.example.demo.coding.naggrow;

public class CountVariableCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "GooGle";

		char[] chr = str.toCharArray();

		int[] ch = new int[122];

		for (int i = 0; i < chr.length; i++) {
			ch[chr[i]]++;

		}

		for (int i = 0; i <ch.length; i++) {

			if (ch[i] > 0) {
				
				System.out.print(" " +ch[i]);
				
				ch[i]=0;

			}

		}

	}

}
