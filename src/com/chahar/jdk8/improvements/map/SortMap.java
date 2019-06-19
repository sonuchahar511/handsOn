package com.chahar.jdk8.improvements.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMap {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("C", "c");
		map.put("Z", "b");
		map.put("B", "z");
		List<Map.Entry<String, String>> sortedByKey = map.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toList());
		sortedByKey.forEach(System.out::println);
		List<Map.Entry<String, String>> sortedByValue = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toList());
		sortedByValue.forEach(System.out::println);
	}
}
