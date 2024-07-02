package com.example.dsa.arrayList.questions;

import java.util.Arrays;

public class Questions3 {

    // Create a method which takes an array as a parameter and reverses it
    // Find the runtime of the created method

    /**
     * Time complexity O(N)
     * @param arr
     */
    public static void reverse(int[] arr) {

        for (int i = 0; i < arr.length/2; i++) { //O(n/2) --> O(n)

            int other = arr.length - i -1; //O(1)
            int temp = arr[i]; //O(1)
            arr[i] = arr[other]; //O(1)
            arr[other] = temp; //O(1)
        }
        System.out.println(Arrays.toString(arr)); //O(1)
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        reverse(arr);
    }
}
