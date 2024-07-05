package com.bptn.course.week4.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Set ;
import java.util.HashSet;

public class DeleteDuplicates {

    /*
     * This method deletes duplicates from an unsorted ArrayList.
     * @param nums the sorted ArrayList with duplicates
     * @return a sorted ArrayList without duplicates
     */
    public static List<Integer> deleteDuplicates(List<Integer> nums) {

        // Check if the list is null or empty, and return an empty list if so
        if (nums == null || nums.size() == 0) {
            return nums ;
        }
        /*if (nums.size() == 1 ) {
            return nums ;
        }*/



        // Implement the bigger details of your algorithm here...
        System.out.println("SetTest");
        Set<Integer> numSet = new HashSet<>(nums);
        System.out.println("ListTest:");
        List<Integer> numList = new ArrayList<>(numSet);
        for (int i = 0; i < numList.size(); i++ ) {
            for (int j =i+1; j < numList.size(); j++) {
                if (j < i ) {
                    int temp = numList.get(i);
                    numList.set(i, numList.get(j));
                    numList.set(j,temp);
                }
            }
        }
        // return sortedAndUnique arraylist
        return numList ;
    }

    public static void main(String[] args) {
        // Initialize a sample sorted ArrayList with duplicate values
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(3);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(5);

        // Call the deleteDuplicates method with the sample list as argument
        List<Integer> result = deleteDuplicates(nums);

        // Print the result to the console
        System.out.println(result);
    }
}