package com.bptn.course.week4.challenge;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public void Start(){

        int[] array = {3, 6, 1, 4, 2, 9, 7, 8, 5, 0};
        int key = 1;


        Arrays.sort(array);

        //sort array
        int result = binarySearch(array,key);

        //Print values in array after sort
        System.out.println(result);

    }

    int binarySearch(int[] arr, int key){
        // put your code here.
        int left = 0;
        int right = arr.length - 1;
        int mid = (left + right + 1) / 2 ;
        while (left < right ) {
//            System.out.println(mid + " - " + key);
            if (mid == key) {
                return mid ;
            } else if (key > mid) {
                left = mid + 1 ;
                mid = (left + right + 1) / 2 ;
            } else  {
                right = mid - 1 ;
                mid = (left + right + 1) / 2 ;
            }
        }
        return -1  ;
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.Start();
    }
}
