package com.example.demo.Datastructure;

public class Stack {

	int stack[] = new int[6];
	int top = 0;

	public void push(int data) {
		stack[top] = data;
		top++;

	}

	public void show() {
		for (int i = 0; i < stack.length; i++)

			System.out.print(stack[i] + " ");
	}

	public int pop() {
		int data;
		top--;
		data = stack[top];
		stack[top] = 0;

		return data;

	}

	public int peek() {
		int data;

		data = stack[top - 1];

		return data;

	}

}
