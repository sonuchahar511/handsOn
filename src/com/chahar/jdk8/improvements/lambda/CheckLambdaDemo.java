package com.chahar.jdk8.improvements.lambda;

public class CheckLambdaDemo {
	public static void main(String[] args) {
		ICheckLambda iCheckLambda=(String p)->{
			System.out.println(p+"HELLO");
		};
		iCheckLambda.doAction("hello");
	}
	
}
