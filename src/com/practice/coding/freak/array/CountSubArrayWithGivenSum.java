package com.practice.coding.freak.array;

import java.util.HashMap;
import java.util.Map;

public class CountSubArrayWithGivenSum {

	public static void main(String args[]) {

		Map<Integer, Integer> subArrayMap = new HashMap<>();
		int sum = 0;
		int len = 0;
		int index = -1;
		int ending_index = 0;
		subArrayMap.put(sum, index);
		int arr[] = { 3, 9, -2, 4, 1, -7, 2, 6, -5, 8, -3, -7, 6, 2, 1 };
		// int arr[] = { 2,3 };
		int given_sum = 5;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (subArrayMap.containsKey(sum - given_sum) && len < i - subArrayMap.get(sum - given_sum)) {
				len = i - subArrayMap.get(sum - given_sum);
				ending_index = i;

			} else {

				subArrayMap.put(sum, i);

			}
		}

		System.out.println("[" + (ending_index - len + 1) + ", " + ending_index + "]");

	}

}
