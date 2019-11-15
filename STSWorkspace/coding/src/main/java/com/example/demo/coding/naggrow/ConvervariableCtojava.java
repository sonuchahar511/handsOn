package com.example.demo.coding.naggrow;

import java.util.Scanner;

public class ConvervariableCtojava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {

			String st1 = sc.nextLine();

			String[] arr = st1.split("_");

			for (int i = 0; i < arr.length; i++) {

				
				System.out.print(arr[i]);
				
			}

		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();
		}

	}

}
