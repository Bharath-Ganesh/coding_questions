package com.practice.coding.freak.array;

public class PrefixSumAlgorithm {

	public static void main(String args[]) {

		int[] arr = { 6, 3, -2, 4, -1, 0, -5 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			arr[i] = sum;
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
