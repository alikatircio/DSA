package com.example.dsa.arrayList.questions;

public class Question2 {


    //Create a function which prints to the console the pairs from given array.
    //Find time complexity for the created method

    /**
     * Time Complexity O(n^2)
     * @param arr
     */
    public static void findPairsInArray (int[] arr) {

        for (int i = 0; i < arr.length; i++) { //O(n)

            for (int j = 0; j < arr.length; j++) { //O(n)

                System.out.print(arr[i]+""+arr[j]+", "); //O(1)
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,2};
        findPairsInArray(arr);
    }

}
