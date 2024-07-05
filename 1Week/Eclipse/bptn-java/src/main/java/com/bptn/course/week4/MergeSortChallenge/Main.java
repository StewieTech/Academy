package com.bptn.course.week4.MergeSortChallenge;

import java.util.Arrays;

class Main {

    public static void main(String args[]) {
        int[] arr = { 12, 11, 13, 5, 6, 7 };
        System.out.print("Printing original array: ");
        System.out.println(Arrays.toString(arr));

        // sort array
        mergeSort(arr, 0, arr.length - 1);

        System.out.print("Printing sorted array: ");
        System.out.println(Arrays.toString(arr));

    }

    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    //
    // <https://www.hackerearth.com/practice/algorithms/sorting/merge-sort/tutorial/>
    static void merge(int arr[], int left, int middle, int right) {

        int arrayLeftIndex = 0;
        int arrayRightIndex = 0;
       int arrayFinalIndex = left;

        int[] arrayLeft = Arrays.copyOfRange(arr, left, middle + 1  ) ;
        int[] arrayRight = Arrays.copyOfRange(arr,middle+1,right + 1);
        System.out.println("Left Array: " + Arrays.toString(arrayLeft));
        System.out.println("Right Array: " + Arrays.toString(arrayRight));
//        System.out.println(arrayRight);
        while (arrayLeftIndex < arrayLeft.length && arrayRightIndex < arrayRight.length)  {
            if (arrayLeft[arrayLeftIndex] <= arrayRight[arrayRightIndex]) {
                arr[arrayFinalIndex] = arrayLeft[arrayLeftIndex] ;
            arrayLeftIndex++ ;
            } else {
                arr[arrayFinalIndex] = arrayRight[arrayFinalIndex] ;
                arrayRightIndex++ ;
            }
                arrayFinalIndex++;
        }
        while (arrayLeftIndex < arrayLeft.length) {
            arr[arrayFinalIndex] = arrayLeft[arrayLeftIndex] ;
            arrayLeftIndex++;
            arrayFinalIndex++;
        }
        while (arrayRightIndex < arrayRight.length) {
            arr[arrayFinalIndex] = arrayRight[arrayRightIndex];
            arrayRightIndex++ ;
            arrayFinalIndex++ ;
        }

        System.out.println("Merged Array: " + Arrays.toString(Arrays.copyOfRange(arr, left, right + 1)));
   }

    // Main function that sorts arr[l..r] using
    // merge()
    static void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            System.out.println("mergeSort called with: " + Arrays.toString(Arrays.copyOfRange(arr, l, r + 1)));

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
}

