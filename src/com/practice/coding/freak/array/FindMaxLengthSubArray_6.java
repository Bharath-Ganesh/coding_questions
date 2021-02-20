package com.practice.coding.freak.array;

import java.util.HashMap;
import java.util.Map;

/*
 * Find maximum length sub-array having given sum
 * 
 * 
 * A[] = { 5, 6, -5, 5, 3, 5, 3, -2, 0 }
	Sum = 8
 */

public class FindMaxLengthSubArray_6 {

	public static void main(String args[]) {

		Map<Integer, Integer> subarrayMap = new HashMap<>();
		subarrayMap.put(0, -1);
		int sum = 0;
		int max_subarray_length = 0;
		int initailIndex = 0;
		// int[] arr = { 2, 8, -3, -5, 2, -4, 6, 1, 2, 1, -3, 4 };
		int[] arr = { 5, 6, -5, 5, 3, 5, 3, -2, 0 };

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

			if (subarrayMap.containsKey(sum)) {
				initailIndex = subarrayMap.get(sum);
				int temp = i - initailIndex;
				if (max_subarray_length < temp) {
					max_subarray_length = temp;
					initailIndex = subarrayMap.get(sum);
				}
				System.out.println();
			} else {
				subarrayMap.put(sum, i);
			}
		}

	}

}
