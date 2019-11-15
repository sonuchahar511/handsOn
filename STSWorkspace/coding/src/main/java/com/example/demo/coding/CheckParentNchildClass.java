package com.example.demo.coding;

public class CheckParentNchildClass {

	public static void main(String[] args) {

		new B();

		
		/* B b = new A(); */ // not possible
		
		/*
		 * a.sum(5, 6);
		 * 
		 * 
		 * a.plus(3,4,5); // The method plus(int, int, int) is undefined for the type A
		 * 
		 * B c = new A(); // Type mismatch: cannot convert from A to B
		 * 
		 * B b = new B();
		 * 
		 * b.plus(2, 4, 6);
		 */

	}

}

class A {

	A() {
		System.out.println("i am in class A");
	}

	public void sum(int a, int b) {
		System.out.println(a + b);
	}

}

class B extends A {

	B() {
		System.out.println("i am in class B");
	}

	public void plus(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public void sum(int a, int b) {
		System.out.println(a + b);
	}

}