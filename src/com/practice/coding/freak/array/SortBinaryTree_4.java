package com.practice.coding.freak.array;

import java.util.Arrays;


/*
 * Sort a binary array in linear time
 */
public class SortBinaryTree_4 {

	public static void main(String args[]) {
		int[] arr = { 1, 0, 1, 0, 1, 0, 0, 1 };
		// extracted(arr);
		// sort(arr);

		swapZero(arr);

	}

	public static void swapZero(int[] arr) {

		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			// System.out.println(arr[i]);
			if (arr[i] < 1) {
				swap(arr, i, j);
				j++;
			}
		}

		for (int i : arr) {
			System.out.println(i);
		}

	}

	public static void swap(int[] arr, int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		System.out.println("swapping zero and one " + i + " : " + j);
	}

	public static void sort(int[] A) {
		// `k` stores index of next available position
		int k = 0;

		// do for each element
		for (int i : A) {
			// if the current element is zero, put 0 at the next free
			// position in the array
			if (i == 0) {
				A[k++] = 0;
			}
		}

		// fill all remaining indices by 1
		for (int i = k; i < A.length; i++) {
			A[k++] = 1;
		}
	}

	/**
	 * 
	 */
	public static void extracted(int[] arr) {

		Integer[] arrs = new Integer[arr.length];
		int countOne = 0;
		int countZero = 0;

		// Here maintained the count of zero and one
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				countZero += 1;
			} else {
				countOne += 1;
			}
		}

		// Fill all the elements of the array with zero
		Arrays.fill(arr, 0);
		while (countOne > 0) {
			arrs[countZero++] = 1;
			countOne -= 1;

		}

	}

}
