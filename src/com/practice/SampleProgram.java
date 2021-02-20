package com.practice;

public class SampleProgram {
	
	public static int sumRecursive(int[] arr,int n) {
		
		if(n<0) {
			return 0;
		}else {
			return arr[n] + sumRecursive(arr,--n);
		}
		
	}
	
	public static void main(String args[]) {
		
		int sum=0;
		int[] arr= {2,4,5,6};
		
		for (int i : arr) {
			sum+=i;
		}
		
		System.out.println(sumRecursive(arr,3));
	}

}
