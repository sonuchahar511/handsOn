package test;

import java.util.Arrays;
import java.util.Collections;

public class thirdHigestSum {

	public static void main(String[] args) {

		Integer arr[] = { 3, 6, 2, 7, 8, 19, 13, 5 };

		int len = 3 ,sum=0;

		Arrays.sort(arr, Collections.reverseOrder());

		String str = Arrays.toString(arr);

		String[] splitStr = str.split(",");

		System.out.println(str);

		for (int i = 2; i <= len; i++) {

			sum = sum + Integer.parseInt(splitStr[i].trim());
		}

		System.out.println(sum);

	}

}
