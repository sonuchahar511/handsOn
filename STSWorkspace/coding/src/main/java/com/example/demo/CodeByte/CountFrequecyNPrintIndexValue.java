package com.example.demo.CodeByte;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CountFrequecyNPrintIndexValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 2, 8, 9, 2, 8, 9, 3, 4, 5, 2, 3, 5, 9 };

		List<Integer> list1 = null;

		Set<Integer> sets = new HashSet<>();

		Map<Integer, List<Integer>> map1 = new HashMap<Integer, List<Integer>>();

		for (int i = 0; i < arr.length; i++) {
			sets.add(arr[i]);

		}
		for (Integer in : sets) {
			int i = 0;

			list1 = new ArrayList<>();
			for (int j = i + 1; j < arr.length; j++) {

				if (in == arr[j]) {

					list1.add(j);

				}

			}

			map1.put(in, list1);

			i = 0;

		}
		System.out.println(map1);
	}
}


