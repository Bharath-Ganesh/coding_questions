/**
 * 
 */
package com.practice;

public class KadaneAlgorithum {

	/*
	 * Write an efficient program to find the sum of contiguous subarray within a
	 * one-dimensional array of numbers which has the largest sum.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { -2, -3, -4, -5, 112, -100, -8 };
		System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));

	}

	static int maxSubArraySum(int a[]) {
		int minimum = a[0];
		int max_so_far = 0;
		int max_sum = 0;

		for (int i = 0; i < a.length; i++) {

			if (minimum > a[i]) {
				minimum = a[i];
			}
			max_sum += a[i];
			if (max_sum < 0) {
				max_sum = 0;
			} else {
				if (max_sum >= max_so_far) {
					max_so_far = max_sum;
				}

			}

		}
		if(max_so_far==0 || max_sum==0)
		{
			return minimum;
		}
		return max_so_far;

	}

}

//int size = a.length;
//int max_ending_here = 0;
//int max_so_far = 0;
//int count = 0;
//
//for (int i = 0; i < size; i++) {
//
//	max_ending_here = max_ending_here + a[i];
//
//	if (max_ending_here > max_so_far) {
//		max_so_far = max_ending_here;
//	}
//	if (max_ending_here < 0) {
//		max_ending_here = 0;
//		count = count + 1;
//	}
//
//}
//
//if (count == size) {
//	max_so_far = a[0];
//	for (int i = 0; i < size; i++) {
//		if (max_so_far < a[i]) {
//			max_so_far = a[i];
//		}
//	}
//}
//return max_so_far;
//}