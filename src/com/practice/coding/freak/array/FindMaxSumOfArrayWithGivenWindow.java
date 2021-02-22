package com.practice.coding.freak.array;

public class FindMaxSumOfArrayWithGivenWindow {

	public static void main(String args[]) {
		int[] arr = { 1, 9, -1, -2, 7, 3, -1, 2 };
		int window = 4;
		System.out.println(slidingWindowApproach(arr, window));

	}

	public static int slidingWindowApproach(int[] arr, int window) {
		int max_sum = 0;
		int window_sum = 0;
		for (int i = 0; i <= arr.length - 4; i++) {
			if (i <= (window - 1)) {
				window_sum += arr[i];
				max_sum = window_sum;
			} else if (i > (window - 1)) {
				window_sum += arr[i] - arr[i - window];
				if (window_sum > max_sum) {
					max_sum = window_sum;
				}
			}
		}
		return max_sum;
	}

	/**
	 * @param arr
	 * @param window
	 */
	public static int brureForceApproach(int[] arr, int window) {
		int max_sum = 0;
		int window_sum = 0;

		for (int i = 0; i <= arr.length - 4; i++) {
			window_sum = 0;
			for (int j = i; j < i + window; j++) {
				window_sum += arr[j];
			}
			if (window_sum > max_sum) {
				max_sum = window_sum;
			}
		}
		return max_sum;
	}
}
