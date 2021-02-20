package com.practice.pepcoding.stack;

import java.util.Stack;

public class BalanceBracket {

	public static void main(String[] args) {

		if (balanceBracket()) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not balanced");
		}
	}

	/**
	 * 
	 */
	public static boolean balanceBracket() {
		Stack<Character> st = new Stack<>();
		// String input = "[(a+b) + {(c+d) * (e/f)}]";
		String input = "[(a+b) + {(c+d) * (e/f)}]";

		for (int i = 0; i < input.length(); i++) {
			Character ch = input.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{') {
				st.push(ch);
			} else if (ch == ')') {
				if (!checkIfBracketAreOfSameSign(st, '(')) {
					return false;
				}
			} else if (ch == ']') {

				if (!checkIfBracketAreOfSameSign(st, '[')) {
					return false;
				}
			} else if (ch == '}') {
				if (!checkIfBracketAreOfSameSign(st, '{')) {
					return false;
				}
			}
		}

		return true;
	}

	/**
	 * @param st
	 */
	public static boolean checkIfBracketAreOfSameSign(Stack<Character> st, Character ch) {
		if (st.size() == 0) {
			return false;
		} else {
			if (st.peek() != ch) {
				return false;
			}
			st.pop();
		}
		return true;
	}

}
