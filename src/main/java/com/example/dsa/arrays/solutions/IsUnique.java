package com.example.dsa.arrays.solutions;

import java.util.Arrays;

public class IsUnique {

    public static boolean isUnique ( int[] nums ) {

        int i = 0, j = i + 1;
        while (i < nums.length-1){

            if (nums[i] == nums[j]){
                return true;
            }else {

                j++;
                if (j == nums.length){

                    i++;
                    j = i + 1;
                }
            }
        }
        return false;
    }

    public static boolean isUnique2 ( int[] nums ) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        int[] arr2 = {1,2,3,4,5,5};
        int[] arr3 = {1,2,3,1};
        int[] arr4 = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(isUnique(arr));
        System.out.println(isUnique2(arr));

        System.out.println(isUnique(arr2));
        System.out.println(isUnique2(arr2));
    }

}
