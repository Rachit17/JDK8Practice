package com.practice.jdk8;

import java.util.HashSet;
import java.util.Set;

public class CheckArraySubset {
	
	public static void main(String[] args) {
	   int[] arr1 = new int[]{1,2,3,4};
	   int[] arr2 = new int[]{2,1,4,1};
	   
	  Boolean b= checkIfSubset(arr1,arr2);
	  System.out.println("arr2 is subset of arr1 "+b);
	}

	private static Boolean checkIfSubset(int[] arr1, int[] arr2) {
		
		Set<Integer> set = new HashSet<>();
		Boolean b = true;
		
		for(int i=0;i<arr1.length;i++)
			set.add(arr1[i]);
		
		for(int j=0;j<arr2.length;j++) {
			if(!set.contains(arr2[j]))
				b=false;
		}
		System.out.println(3<<1);
		System.out.println(3>>1);
			
			
		return b;
		
		
	}

}
