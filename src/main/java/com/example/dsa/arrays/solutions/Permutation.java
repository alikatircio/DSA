package com.example.dsa.arrays.solutions;

public class Permutation {

    public static boolean isPermutation (int[] arr1, int[] arr2) {

        if (arr1.length == arr2.length) {
            int sum1 = 0, sum2 = 0, mul1 = 1, mul2 = 1;

            for (int i = 0; i < arr1.length; i++) {

                sum1 += arr1[i];
                sum2 += arr2[i];
                mul1 *= arr1[i];
                mul2 *= arr2[i];
            }
            return mul1 == mul2 && sum1 == sum2;
        } else
            return false;
    }

    public static void main(String[] args) {

        int[] arr  = {1,2,3,4,5,6};
        int[] arr2 = {3,6,4,2,5,1};

        System.out.println(isPermutation(arr, arr2));
    }
}
