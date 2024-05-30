package com.example.dsa.arrays;

import java.util.Arrays;

public class Sum2DArray {

    public static int sumDiagonalElements(int[][] array) {
        int sum = 0;
        int numRows = array.length;
        for (int i = 0; i < numRows; i++) {

            sum += array[i][i];
        }
        return sum;
    }

    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(sumDiagonalElements(arr));
    }
}
