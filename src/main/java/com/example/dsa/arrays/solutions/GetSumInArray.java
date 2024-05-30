package com.example.dsa.arrays.solutions;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GetSumInArray {

    //Naive Solution
    public static boolean checkSumInArray(int[] array, int sum) {

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] + array[j] == sum)
                    return true;
            }
        }
        return false;
    }

    public static boolean checkSumInArray2(int[] array, int sum) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int j : array) {

            if (list.contains(j))
                return true;
            list.add(sum - j);
        }
        return false;
    }

    public static void main(String[] args) {

        int[] array = {1,2,3,9};
        int[] array2 = {1,2,4,4};
        System.out.println("With Naive Solution " + checkSumInArray(array, 8));
        System.out.println("With Naive Solution " + checkSumInArray(array2, 8));
        System.out.println("With Better Solution " + checkSumInArray2(array, 8));
        System.out.println("With Better Solution " + checkSumInArray2(array2, 8));
    }
}
