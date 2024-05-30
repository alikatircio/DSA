package com.example.dsa.arrays;

import java.util.Arrays;

public class FindMiddleInArray {

    public static int[] middle(int[] array) {

        if (array.length < 2){

            return new int[0];
        }
        int len = array.length - 2;
        int[] mid = new int[len];
        for (int i = 1; i < array.length - 1; i++) {

            mid[i-1] = array[i];
        }
        return mid;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(middle(arr)));
    }
}
