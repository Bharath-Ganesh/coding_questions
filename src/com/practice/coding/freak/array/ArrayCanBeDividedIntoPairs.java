package com.practice.coding.freak.array;

/**
 * Given an integer array , determine if can be divided into pairs such that sum
 * of the elements in each pair is divisible by a given integer k
 * 
 * Input: arr[] = { 3, 1, 2, 6, 9, 4 } k = 5 Output: Pairs can be formed
 * Explanation: Array can be divided into pairs {(3, 2), (1, 9), (4, 6)} where
 * the sum of elements in each pair is divisible by 5.
 *
 */
public class ArrayCanBeDividedIntoPairs {

	public static boolean findPairsWithSumK(int[] arr, int k) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int sum = arr[i] + arr[j];
				if (sum % k == 0) {

					return true;
				}
			}
		}
		return false;

	}

	public static void main(String[] args) {
		int[] arr = { 2, 9, 4, 1, 3, 5 };
		int k = 6;

		if (findPairsWithSumK(arr, k)) {
			System.out.println("Pairs can be formed");
		} else {
			System.out.println("Pairs cannot be formed");
		}
	}
}
