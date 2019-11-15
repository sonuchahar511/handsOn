package com.example.demo.BasicCoreConcept;

public class Spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3;
		int n = 3;
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		SpiralMat(m, n, arr);

	}

	static void SpiralMat(int n, int m, int a[][]) {
		int k = 0, l = 0;
		int j = 0;

		while (k < m && l < n) {
			for (int i = l; i <= n; i++) {

				System.out.println(a[k][i]+" ");

			}
			k++;
			
			

		}
	}

}
