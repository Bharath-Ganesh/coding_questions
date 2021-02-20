/**
 * 
 */
package com.practice;

public class Palindrome {

	/*
	 * Given an integer, check whether it is a palindrome or not.
	 * 
	 * 
	 */

	public static boolean isPalindrome(String word) {
		
		
		int i=0;
		int j=word.length()-1;
		
		while(i<=j) {
			if(word.charAt(i)!=word.charAt(j)) {
				return false;
			}else {
				i++;
				j--;
			}
		}
		
		return true;

	}

	public static void main(String[] args) {

//		int number = 787;
//		int temp = number;
//		int reverse = 0;
//		while (number > 0) {
//			int remainder = number % 10;
//			reverse = reverse * 10 + remainder;
//			number = number / 10;
//			System.out.println(reverse);
//
//		}
//
//		if (reverse == temp) {
//			System.out.println("Palindrome");
//		} else {
//			System.out.println("Not");
//		}
		
		System.out.println(isPalindrome("HINDI"));

	}

}
