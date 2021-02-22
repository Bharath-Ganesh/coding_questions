package com.practice.coding.freak.array;

import java.util.HashMap;
import java.util.Map;

/*
 * Find duplicate element in a limited range array
 */
public class DuplicateElement {

	// Function to find a duplicate element in a limited range array
	public static int findDuplicate(int[] arr) {

		// create a visited array of size `n+1`
		// we can also use a map instead of a visited array

		int duplicate=0;
		Map<Integer, Integer> duplicateMap = new HashMap<>();
		int i=0;
		for (int element : arr) {
			i++;
			if(duplicateMap.containsKey(element)) {
				duplicate=element;
				System.out.println("Duplicate element : " + element);
			}
			duplicateMap.put(element,i);
		}		

		return duplicate;
	}

	public static void main(String[] args) {
		// input array contains `n` numbers between 1 and `n-1`
		// with one duplicate, where `n` is the array's length
		int[] A = { 1, 2, 3, 4, 4 };

		System.out.println("The duplicate element is " + findDuplicate(A));

	}

}
