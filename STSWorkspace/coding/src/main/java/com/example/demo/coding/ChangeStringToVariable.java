package com.example.demo.coding;

public class ChangeStringToVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "this_is_variable";

		String arr[] = str.split("_");

		String str1 = arr[0];
		String str2 = "";

		for (int i = 1; i < arr.length; i++) {

			
			
			str2 = str2+arr[i].replaceFirst(Character.toString(arr[i].charAt(0)),
					Character.toString(arr[i].charAt(0)).toUpperCase());

		}

		
		System.out.println(str1.concat(str2));
	}
}
