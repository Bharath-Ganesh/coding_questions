package com.practice.coding.freak.array;

/**
 * Given an array . Sort the array using bubble sort algorithm o(n^2)
 */
public class BubbleSortAlgorithm {

	public static void main(String args[]) {
		int[] arr = { 2, 4, 3, 65, 32, 89, 0, 1, 43 };
		for (int i = 1; i <= arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr,j,j+1);
				}
			}
		}
		for (int element : arr) {
			System.out.println(element);
		}

	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}
