package com.example.demo.CodeByte;

import java.util.*;

class TimeConvert {

	public static String TimeConvert(int num) {
		// code goes here
		String hours = "", min = "";
		int i = 0;

		String timeConverter = "";

		i = num % 60;

		min = Integer.toString(i);

		hours = Integer.toString((num - i) / 60);

		timeConverter = hours + ":" + min;

		return timeConverter;
	}

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		int str = s.nextInt();

		String convert = TimeConvert(str);

		System.out.print(convert);
	}

}