package com.example.demo.BasicCoreConcept;

public class StaticConcept  {

	public static void main(String[] args) {
		Aaa a =new Baaa();
		a.method();

	}
	public static void method() {
	System.out.println("sop from StaticConcept class");
	}

}
class Aaa{
	public static void method() {
		System.out.println("sop from a class");
	}
}


class Baaa extends Aaa {
	public static void method() {
		System.out.println("sop from bbbb class");
	}
}