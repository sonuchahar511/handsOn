package com.example.demo.coding;

import java.util.Scanner;

public class frequenyofCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {
			/*
			 * String str = "GooGle";
			 */
			String str = sc.nextLine();

			int count = 1;
			char s1[] = str.toCharArray();

			for (int i = 0; i < s1.length; i++) {

				for (int j = i + 1; j < s1.length; j++) {
					if (s1[i] == s1[j]) {

						count++;

						System.out.print(count + "" + s1[i] + " ");
						count = 1;

					}
					
				}
				
				
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}

	}

}
