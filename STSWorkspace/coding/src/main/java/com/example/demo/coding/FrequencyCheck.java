package com.example.demo.coding;

public class FrequencyCheck {

	static final int maxsize = 256;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "13131223324456";

		int count[] = new int[maxsize];

		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}

		for (int j = 0; j < str.length(); j++) {
			System.out.print(str.charAt(j) +"="+count[str.charAt(j)]+",");
		}

	}

}
