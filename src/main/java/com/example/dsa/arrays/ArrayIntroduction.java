package com.example.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayIntroduction {

    public static void main(String[] args) {

        //Create array
        int[] intArray; //O(1)
        intArray = new int[3]; //O(1)
        intArray[0] = 1; //O(1)
        intArray[1] = 2; //O(1)
        intArray[2] = 3; //O(1)

        System.out.println(Arrays.toString(intArray));

        //All step together
        String[] string = {"a", "b", "c"}; //O(1)
        System.out.println(Arrays.toString(string));
    }

}
