package com.practice.pepcoding.stack;

import java.util.Stack;

/*
 * You are given an expression , but some of the pairs of bracket are extra or needless
 * You are required to print true if you detect extra brackets and false otherwise
 * 
 *  ((a+b) + (e+f)) -> false 
 *   a+b +  ((e+f))   -> true
 */
public class DuplicateBracket {

	public static void main(String args[]) {

		System.out.println(dupliclateBracket());
	}

	/**
	 * 
	 */
	public static boolean dupliclateBracket() {

		Stack<Character> st = new Stack<>();
		String inputString = "a+b +  ((e+f)) ";

		for (int i = 0; i < inputString.length(); i++) {

			char ch = inputString.charAt(i);

			if (ch == ')') {
				if (st.peek() == '(') {
					return true;
				} else {
					while (st.peek() != '(') {
						st.pop();
					}
					st.pop();
				}
			} else {
				st.push(ch);
			}
		}
		return false;
	}

}
