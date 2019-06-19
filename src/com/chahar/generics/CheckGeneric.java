package com.chahar.generics;

import java.util.ArrayList;
import java.util.List;

public class CheckGeneric {
	public static void main(String[] args) {
		List<CheckGeneric> floats = new ArrayList<>();
		floats.add(new DummyDTO());
//		floats.add(new CheckGeneric());
		printNumbers(floats);
	}
	public static void printNumbers(List<? extends CheckGeneric> floats) {
	    for (CheckGeneric number : floats) {
	        System.out.print(number);
	        System.out.print(", ");
	    }
	}
}
