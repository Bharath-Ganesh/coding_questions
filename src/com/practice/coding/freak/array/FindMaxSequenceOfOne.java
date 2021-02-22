package com.practice.coding.freak.array;

/**
 * int[] A = { 0, 0, 1, 0, 1, 1, 1, 0, 1, 1 }; 
 * Given a binary array, find the
 * index of 0 to be replaced with 1 to get the maximum length sequence of
 * continous one
 */
public class FindMaxSequenceOfOne {

	// Find the index of 0 to replace with 1 to get the maximum sequence
	// of continuous 1's
	public static int findIndexofZero(int[] A) {
		int max_count_one = 0; // stores maximum number of 1's (including 0)
		int max_index = -1; // stores index of 0 to be replaced

		int prev_zero_index = -1; // stores index of previous zero
		int countZero = 0; // stores current count of zeros
		//int[] A = { 0, 0, 1, 0, 1, 1, 1, 0, 1, 1 };
		// consider each index `i` in the array
		for (int i = 0; i < A.length; i++) {
			// if the current element is 1
			if (A[i] == 1) {
				countZero++;
			}
			// if the current element is 0
			else {
				// reset count to 1 + number of ones to the left of current 0
				countZero = i - prev_zero_index;

				// update `prev_zero_index` to the current index
				prev_zero_index = i;
			}

			// update maximum count and index of 0 to be replaced if required
			if (countZero > max_count_one) {
				max_count_one = countZero;
				max_index = prev_zero_index;
			}
		}

		// return index of 0 to be replaced or -1 if the array contains all 1's
		return max_index;
	}

	public static void main(String[] args) {
		int[] A = { 0, 0, 1, 0, 1, 1, 1, 0, 1, 1 };

		int index = findIndexofZero(A);

		if (index != -1) {
			System.out.print("Index to be replaced is " + index);
		} else {
			System.out.print("Invalid input");
		}
	}
}
