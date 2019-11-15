package test;

import java.util.Scanner;

public class CalculateBracketPairingivenString {

	// Qs- Given a string containing characters and brackets, find if the
	// brackets are paired in the string.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		// String s="csdgf{djfhs[kdjO}KDND](";

		String s1 = str.replaceAll("([a-z,A-Z])", "");

		char[] ch = s1.toCharArray();

		for (int i = 0; i <= ch.length - 1; i++) {

			int asciiValue = (int) ch[i];

			System.out.println(ch[i] + " " + asciiValue);

			
			
			
			/*
			 * if (Character.isMirrored(ch[i]) == true) {
			 * System.out.println(ch[i]); }
			 */
			
			
			
			
			  
		}
		
		
		

	}

}
