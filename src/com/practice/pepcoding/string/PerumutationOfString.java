package com.practice.pepcoding.string;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string. You have to find all the combinations of the string
 * 
 */
public class PerumutationOfString {

	public static void main(String[] args) {

		String inputString = "abc";
		List<String> permutationStrings = stringPerumation(inputString);
		for (String element : permutationStrings) {
			System.out.println(element);
		}

	}

	public static int factorialRecursive(int number) {
		if (number < 1) {
			return 1;
		} else {
			return number * factorialRecursive(number - 1);
		}

	}

	public static int factorial(int number) {

		int factorial = 1;
		while (number > 0) {
			factorial *= number;
			number--;
		}
		return factorial;
	}

	/**
	 * 
	 * @param inputString
	 * @return
	 */
	public static List<String> stringPerumation(String inputString) {

		List<String> permutationStrings = new ArrayList<>();
		String newString = "";
		int fact = factorialRecursive(inputString.length());

		for (int i = 0; i < fact; i++) {
			StringBuilder inputStringBuilder = new StringBuilder(inputString);
			int temp = i;
			newString = "";
			for (int div = inputString.length(); div >= 1; div--) {
				int remainder = temp % div;
				int quotient = temp / div;
				newString += inputStringBuilder.charAt(remainder);
				inputStringBuilder.deleteCharAt(remainder);
				temp = quotient;
			}
			permutationStrings.add(newString);

		}
		return permutationStrings;

	}

}
