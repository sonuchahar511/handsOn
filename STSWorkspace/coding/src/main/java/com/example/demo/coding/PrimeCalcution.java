package com.example.demo.coding;

import java.util.Stack;

public class PrimeCalcution extends Stack<Integer> {

	Stack<Integer> min = new Stack<>();

	void push(int x) {

		if (isEmpty() == true) {
			super.push(x);
			min.push(x);

		}

		else {
			super.push(x);
			int y = min.pop();
			min.push(y);

			if (x < y) {
				min.push(x);

			}

			else {
				min.push(y);
			}

		}

	}

	public Integer pop() {
		int x = min.pop();
		min.pop();

		return x;

	}

	int getmin() {

		int x = min.pop();
		min.push(x);
		return x;
	}
public static void main(String[] args) {
	
	PrimeCalcution pri= new PrimeCalcution();
	
	pri.push(10);
	pri.push(20);
	pri.push(30);
	System.out.println(pri.getmin());
	pri.push(5);
	System.out.println(pri.getmin());
	
}
}
