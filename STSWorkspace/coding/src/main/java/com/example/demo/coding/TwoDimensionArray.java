package com.example.demo.coding;

import java.util.Scanner;

public class TwoDimensionArray {

	/* INPUT= */
	// 1 1 1 0 0 0
	//0 1 0 0 0 0
	//1 1 1 0 0 0
	//0 0 2 4 4 0
	//0 0 0 2 0 0
	//0 0 1 2 4 0


	//1 1 1   1 1 0   1 0 0   0 0 0
	//  1       0       0       0
	//1 1 1   1 1 0   1 0 0   0 0 0

	//0 1 0   1 0 0   0 0 0   0 0 0
	//  1       1       0       0
	//0 0 2   0 2 4   2 4 4   4 4 0

	//1 1 1   1 1 0   1 0 0   0 0 0
	//  0       2       4       4
	//0 0 0   0 0 2   0 2 0   2 0 0

	//0 0 2   0 2 4   2 4 4   4 4 0
	//  0       0       2       0
	//0 0 1   0 1 2   1 2 4   2 4 0


// output sum =19
	//2 4 4
	//  2
	//1 2 4

	
	
	public static void main(String[] args) {

		int arr[][] = new int[6][6];

		printAdditionMaxofSubMAtrix(arr);

	}

	static void printAdditionMaxofSubMAtrix(int arr[][]) {

		int sum = 0, finalSum = 0;

		try (Scanner sc = new Scanner(System.in)) {

			for (int i = 0; i < arr.length; i++) {
				String[] arrRowItems = sc.nextLine().split(" ");
				/* sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?"); */

				for (int j = 0; j < arr.length; j++) {

					int arrItem = Integer.parseInt(arrRowItems[j]);
					arr[i][j] = arrItem;

					/* System.out.print(arr[i][j] + " "); */

				}

				System.out.print("\n");

			}

			for (int i = 0; i < arr.length - 2; i++) {
				for (int j = 0; j < arr.length - 2; j++) {
					/* System.out.print(arr[i][j] + " "); */

					sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
							+ arr[i + 2][j + 1] + arr[i + 2][j + 2];

					System.out.println(arr[i][j] + " " + arr[i][j + 1] + " " + arr[i][j + 2] + " " + arr[i + 1][j + 1]
							+ " " + arr[i + 2][j] + " " + arr[i + 2][j + 1] + " " + arr[i + 2][j + 2]);

					if (sum > finalSum) {
						finalSum = sum;
					}

				}

				System.out.print("\n");

			}

		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();
		}

		System.out.println(finalSum);

	}

}
