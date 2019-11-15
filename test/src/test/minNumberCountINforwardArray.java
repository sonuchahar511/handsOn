package test;

import java.util.ArrayList;
import java.util.List;

public class minNumberCountINforwardArray {

	public static void main(String[] args) {

		int arr[] = { 3, 4, 9, 6, 1 };
		int count = 0;

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++) {

				if (arr[j] < arr[i]) {
					count++;
				}

			}
			list.add(count);
			count = 0;
		}

		System.out.println(list);

	}

}
