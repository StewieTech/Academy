package com.bptn.course.week3;

import java.util.List;
import java.util.ArrayList;

public class Test1 {
    public static void moveSmallest(ArrayList<Integer> list) {
        int smallestIndex = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(smallestIndex)) {
//            	System.out.print(i);
                smallestIndex = i;
            }
            System.out.print(smallestIndex);
        }
        int smallestNum = list.remove(smallestIndex) ;
            list.add(0, smallestNum) ;
        
//        smallestIndex += 1 ;
        //move smallest to front
        // int temp = list.get(smallestIndex) ;
        // System.out.print(temp);
        // list.remove(temp);
        // list.add(0, list.get(temp));
    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {3, 11, 54, 7, 1, 22};
        for (int i = 0; i < nums.length; i ++) {
            values.add(nums[i]);
        }
        moveSmallest(values);
        System.out.println("Expected Result:\t [1, 3, 11, 54, 7, 22]");
        System.out.println("Your Result:\t\t " + values);
    }
}
