package com.bptn.course._04_arrays;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		int i0 = 4;
		int i1 = 5;
		int i2 = 7;
		int i3 = 2;
		int i4 = 19;
		int i5 = 14;
		int i6 = 35;
		int i7 = 46;
		int i8 = 71;
		int i9 = 28;
		
		int[] nums = { 4, 5, 7, 2, 19, 14, 35, 46, 71, 28, 11, 13}; 
		//             0  1  2  3   4   5   6   7   8   9  10  11 
		
				
		int[] nums2 = new int[10];
				
		
		// traditional for loop
		/*for (int i = 0; i < nums.length; i++) {
			
			System.out.println(nums[i]);
		}*/
		
		
		nums[0] = 100;
		nums[11] = 200;
		
		// for-each
		/*for (int num : nums2) {
			System.out.println(num);
		}*/
		
		//System.out.println(Arrays.toString(nums));
			
		String[] strs = { "Hello", "I", "love", "Java" };
		
		for (String str : strs) {
			System.out.println(str);
		}
		
		String[] strs2 = new String[10];
		
		strs2[0] = "Hello BPTN";
		
		System.out.println(Arrays.toString(strs2));
		
		String str1 = null;
	}

}
