package com.practice.coding.freak.array;

import java.util.HashMap;

public class SubArrayWithSumZero {

	public static void main(String args[]) {

		int[] arr = { 2, 5, -5, 2, -2, 3, 6 };

		int sum = 0;
		int index = -1;
		HashMap<Integer, Integer> arrayHashMap = new HashMap<>();
		arrayHashMap.put(sum, index);
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (arrayHashMap.containsKey(sum)) {

				System.out.println("[" + (arrayHashMap.get(sum) + 1) + "," + i + "]");
			} else {
				arrayHashMap.put(sum, i);
			}
		}

	}

}
