package com.example.dsa.arrayList.questions;

public class Question1 {

    /**
     * Question;

     * Create a function which calculates the sum and product of elements
     * Find the time complexity for created method

     * Time Complexity O(n)
     * @param array
     */
    public static void spofArray(int[] array) {

        int sum = 0;   //O(1)
        int product = 1;  //O(1)
        for (int i = 0; i < array.length; i++) {  //O(n)

            sum += array[i]; //O(1)
        }
        for (int i = 0; i < array.length; i++) { //O(n)

            product *= array[i]; //O(1)
        }
        System.out.println(sum+ ", "+product); //O(1)
    }

    public static void main(String[] args) {

        int[] arr = {1,3,4,5};
        spofArray(arr);
    }
}
