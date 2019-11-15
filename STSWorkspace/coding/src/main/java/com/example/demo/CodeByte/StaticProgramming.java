package com.example.demo.CodeByte;

public class StaticProgramming {

	static int i;
	static String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// both r the correct way to intialize the value

		/*
		 * SpiralProgramming.i=10; SpiralProgramming.name="supriya";
		 */

		StaticProgramming sp = new StaticProgramming();
		sp.i = 10;
		sp.name = "supriya";

		System.out.println(name + " " + i);

	}

}
