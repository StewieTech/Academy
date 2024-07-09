package com.bptn.course.week5.challenge;

public class InsertionSort {
    // This method sorts an array in ascending order using insertion sort algorithm
    public static void insertionSort(int[] arr) {

        // Check if the array is null or has less than 1 element
        if (arr.length < 1 || arr == null ) {
            // Return if the array is null or has less than 1 element
            System.out.println("test");
            return  ;


        }
        int temp ;
        // Loop through the array starting from index 1 to length of the array
        for (int i = 1; i < arr.length ; i++ ) {
            // Store the current element
            temp = arr[i];

            // Initialize j with i - 1
            int j = i - 1 ;
//            System.out.println(arr[i]);

            // Inner loop to compare current element with elements before it in the array
            while (j > 0  && arr[j-1] > temp  ) {
                // Shift the element to the right
                System.out.println(arr[j] + arr[j-1]);
                arr[j] = arr[j-1];

                // Decrement j to compare with next element
                j--;

            }
            // Insert the current element at its correct position
            arr[j] = temp;

        }
    }
    //Do not modify below code
    public static void main(String[] args) {
        // Initialize the array
//        int[] arr = {3, 4, 1, -2, 4, 8};
        int[] arr = {};
        // Call the sort method to sort the array
        insertionSort(arr);
        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

