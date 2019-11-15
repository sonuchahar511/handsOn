package test;

import java.util.Scanner;

public class niit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer val = sc.nextInt();
		Integer N = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= N; i++) {

			if (i % val == 0 && i != val) {
				while (i > 0) {

					sum = sum + i % 10;
					i = i / 10;

				}
				System.out.println(i);
			}

		}

	}

}
