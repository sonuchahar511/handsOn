package com.example.demo.CodeByte;

import java.util.Scanner;

public class code1 {

	/*
	 * Have the function LongestWord(sen) take the sen parameter being passed and
	 * return the largest word in the string. If there are two or more words that
	 * are the same length, return the first word from the string with that length.
	 * Ignore punctuation and assume sen will not be empty. Sample Test Cases
	 * Input:"fun&!! time"
	 * 
	 * Output:"time"
	 * 
	 * 
	 * Input:"I love dogs"
	 * 
	 * Output:"love"
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {

			String str = sc.nextLine();

			int s3 = 0, temp = 0;

			String ss = "";

			String[] s1 = str.split(" ");

			for (int i = 0; i < s1.length; i++) {
				for (int j = i + 1; j < s1.length; j++) {
					if (s1[i].replaceAll("[^a-zA-Z0-9]", "").length() > s1[j].replaceAll("[^a-zA-Z0-9]", "").length()) {

						s3 = s1[i].length();
						if (s3 > temp) {
							temp = s3;
							ss = s1[i];
							/* System.out.println(temp); */
						}

					}

					else {
						s3 = s1[j].length();
						if (s3 > temp) {
							temp = s3;
							ss = s1[j];
						}

					}
				}

			}
			System.out.println(temp + " " + ss);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
