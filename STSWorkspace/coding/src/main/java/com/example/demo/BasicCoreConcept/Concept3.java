package com.example.demo.BasicCoreConcept;

public class Concept3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A obj = new B();

		obj.show();
		// The method show() from the type A is not visible

	}

}

class A {

	private void show() {
		System.out.println("Hello i am in A");
	}

}

class B extends A {
	private void show() {
		System.out.println("Hiiii i am in B");
	}
}