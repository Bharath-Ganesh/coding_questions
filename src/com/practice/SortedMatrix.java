/**
 * 
 */
package com.practice;

import java.util.Scanner;

public class SortedMatrix {

	/*
	 * Given a matrix of size n x m, where every row and column is sorted in
	 * increasing order, and a number x. Find whether element x is present in the
	 * matrix or not.
	 * 
	 */
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			int mat[][] = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++)
					mat[i][j] = sc.nextInt();
			}

			int x = sc.nextInt();

			System.out.println(new Sol().matSearch(mat, n, m, x));
		}

	}
}// } Driver Code Ends

class Sol {
	public static int matSearch(int a[][], int n, int m, int x) {
		int r = 0, c = m - 1;
		while (r < n && c >= 0) {
			if (a[r][c] == x)
				return 1;
			else if (a[r][c] > x)
				c--;
			else
				r++;
		}
		return 0;
	}
}