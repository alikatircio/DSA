package com.example.dsa.arrays.solutions;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateMatrix {

    public static boolean rotate(int[][] arr) {

        if (arr.length == 0 && arr.length > arr[0].length)
            return false;
        int n = arr.length;
        for (int layer = 0; layer < n/2; layer++){

            int first = layer;
            int last = n-1-layer;
            for (int i = first; i<last; i++) {

                int offset = i - first;
                int top = arr[first][i];
                arr[first][i] = arr[last-offset][first];
                arr[last-offset][first] = arr[last][last-offset];
                arr[last][last-offset] = arr[i][last];
                arr[i][last] = top;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);
        System.out.println(Arrays.deepToString(arr));
    }
}
