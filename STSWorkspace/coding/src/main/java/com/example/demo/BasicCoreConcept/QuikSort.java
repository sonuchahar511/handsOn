package com.example.demo.BasicCoreConcept;

public class QuikSort {

	int partion(int arr[], int low, int high) {

		int pivot = arr[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;

	}

	void sort(int arr[], int high, int low)

	{
		if (low < high) {
			int pi = partion(arr, low, high);

			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);

		}
	}

	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; ++i) {
			System.out.println(arr[i] + " ");
			System.out.println();
		}

	}

	public static void main(String[] args) {
		
		int arr[] = {10,7,8,9,1,5};
		
		int arlen= arr.length;
		
		QuikSort quik = new QuikSort();
		quik.sort(arr,0,arlen-1);
		System.out.println("print Array");
		printArray(arr);
		
		
	}

}
