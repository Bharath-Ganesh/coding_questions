package com.practice;

import java.util.HashMap;

public class FindPairWithGivenSumInArray {
	
	
	public static void sum(int[] a,int sum) {
	
		
		HashMap<Integer,Integer> arrayMap=new HashMap<>();
		
		for (int i = 0; i < a.length; i++) {
			
			if(arrayMap.containsKey(sum-a[i])) {
				System.out.println("found");
				
				
				break;
			}
			arrayMap.put(a[i], i);
		}
		
		for (int i : arrayMap.keySet()) {
			System.out.println(i + " : " + arrayMap.get(i));
		}
	}
	
	
	
	public static void main(String args[]) {
//		Scanner scn=new Scanner(System.in);
//		scn.next();
//		scn.next();
		
		int[] a= { 8, 7, 2, 5, 3, 1 };
		sum(a,10);
		
	}

}
