package com.bptn.course.week5.challenge;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BinarySearch {

    // Binary search method that takes an unsorted array and a key element to search for
    public static int binarySearch(int[] arrInput, int key) {
        // Sort the array before applying binary search
       int[] arr =  Arrays.stream(arrInput).sorted().toArray() ;



        // Initialize low and high pointers for the start and end of the array respectively
        int lowPtr = 0;
        int highPtr = arr.length -1 ;


        // Keep looping until the high pointer is greater than or equal to the low pointer
        while (lowPtr <= highPtr) {
            // Calculate the middle index
            int midPtr = lowPtr + ((highPtr - lowPtr)/2 );

            // If the element at the middle index is equal to the key, return the index
            if (arr[midPtr] == key) {
                return midPtr;

            }
            // If the element at the middle index is less than the key, move the low pointer to the middle + 1
            else if (arr[midPtr] < key) {
                lowPtr = midPtr + 1;
            }
            // If the element at the middle index is greater than the key, move the high pointer to the middle - 1
            else if (arr[midPtr] > key)  {
                highPtr = midPtr  - 1;
            }
        }
        // If the key is not found, return -1
        return -1 ;

    }

    //Do not modify the code below
    public static void main(String[] args) {

        // Create an Array of integers
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        // Key to be searched for:
        int key = 22;

        // Perform binary search on the Array
        int result = binarySearch(arr, key);

        // Print the result
        if (result == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}

