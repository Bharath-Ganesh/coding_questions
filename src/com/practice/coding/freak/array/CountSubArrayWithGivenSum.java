package com.practice.coding.freak.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Provided with a array and a given sum . You have to find longest subarray
 * with the given sum int arr[] = { 3, 9, -2, 4, 1, -7, 2, 6, -5, 8, -3, -7, 6,
 * 2, 1 }; int given_sum = 5;
 */
public class CountSubArrayWithGivenSum {

	public static void main(String args[]) {

		int arr[] = { 3, 9, -2, 4, 1, -7, 2, 6, -5, 8, -3, -7, 6, 2, 1 };
		int given_sum = 5;
		int ending_index = -1;
		int initial_index = -1;
		int sum = 0;
		int length_of_array = -1;
		Map<Integer, Integer> subarrayMap = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (subarrayMap.containsKey(sum - given_sum) && length_of_array < i - (subarrayMap.get(sum - given_sum))) {

				ending_index = i;
				initial_index = subarrayMap.get(sum - given_sum) + 1;

			} else {
				subarrayMap.put(sum, i);
			}
		}
		System.out.println("[" + initial_index + "," + ending_index + "]");
	}

}
