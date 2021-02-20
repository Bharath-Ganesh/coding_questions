package com.practice;

import java.util.Arrays;

public class HelloWorld {

	public static void checkSum(int[] arr, int sum) {

		Arrays.sort(arr);

		int initial = 0;
		int highIndex = arr.length - 1;
		
		while (initial < highIndex) {

			if (arr[initial] + arr[highIndex] == sum) {
				System.out.println("The sum is found at index " + initial + " " + highIndex);
				break;
			} else {
				if (arr[initial] + arr[highIndex] < sum) {
					initial++;
				} else {
					highIndex--;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//// arr = [4, 5, 2, 1], sum = 7
		// sort the array
		// 1,2 ,4, 5
		int[] arr = { 4, 5, 2, 1 };
		checkSum(arr, 7);

	}

}
