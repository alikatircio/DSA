package com.example.dsa.arrays;

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        int index = 0, first = 0, second = 0, i = 0;
        boolean flag = true;
        while (flag) {

            first = nums[index];
            if (target - first == nums[i] && i != index){

                second = nums[i];
                flag = false;
            } else {

                if (i == nums.length-1){
                    i = 0;
                    index++;
                }
                if (index == nums.length)
                    index = 0;
            }
            i++;
        }

        return new int[] {index, i-1};
    }


    //Bestway

    public static int[] solution2 (int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            int exp = target - nums[i];
            for (int j = 0; j < nums.length; j++) {

                if (j !=i && exp == nums[j]){

                    return new int[] {i, j};
                }
            }
        }
        return new int[0];
    }
    public static void main(String[] args) {

        int[] arr3 = {3,2,4};
        System.out.println(Arrays.toString(twoSum(arr3, 6)));
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr, 9)));
        int[] arr2 = {2,3,4};
        System.out.println(Arrays.toString(twoSum(arr2, 6)));
        int[] arr4 = {3,3};
        System.out.println(Arrays.toString(twoSum(arr4, 6)));
        System.out.println("------------------");
        System.out.println("------------------");
        System.out.println(Arrays.toString(solution2(arr3, 6)));
        System.out.println(Arrays.toString(solution2(arr, 9)));
        System.out.println(Arrays.toString(solution2(arr2, 6)));
        System.out.println(Arrays.toString(solution2(arr4, 6)));
    }
}
