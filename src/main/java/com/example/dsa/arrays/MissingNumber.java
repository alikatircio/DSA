package com.example.dsa.arrays;

public class MissingNumber {

    static int findMissingNumberInArray(int[] arr) {

        int n = arr.length + 1;
        int expectedSum = (n * (n + 1)) / 2;
        int sum = 0;
        for (int num : arr) {

            sum += num;
        }

        return expectedSum - sum;
    }

    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 4, 6};
        System.out.println(findMissingNumberInArray(myArray));
    }
}
