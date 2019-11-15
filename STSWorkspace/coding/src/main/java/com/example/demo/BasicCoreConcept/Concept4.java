package com.example.demo.BasicCoreConcept;

public class Concept4 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aa a = new Bb();
		a.show();
		
		
	}

}
class Aa {

	static void show() {
		System.out.println("Hello i am in A");
	}

}

class Bb extends Aa {
	static void show() {
		System.out.println("Hiiii i am in B");
	}
}