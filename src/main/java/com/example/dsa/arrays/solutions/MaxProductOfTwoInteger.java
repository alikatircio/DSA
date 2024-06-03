package com.example.dsa.arrays.solutions;

public class MaxProductOfTwoInteger {

    public static String maxProduct( int[] intArray ) {

        int first = 0, second = 0;
        for (int j : intArray) {

            if (j > first) {

                second = first;
                first = j;
            } else if (j < first && j > second)
                second = j;
        }
        return first+","+second;
    }

    public static String maxProductSolution2(int[] arr) {

        int maxProduct = 0;
        String pairs = "";
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++) {

                if (arr[i] * arr[j] > maxProduct) {
                    maxProduct = arr[i] * arr[j];
                    pairs = arr[i]+","+(arr[j]);
                }
            }
        }
        return pairs;
    }

    public static void main(String[] args) {

        int[] myArray = {10,20,30,40,50};
        System.out.println(maxProduct(myArray));
        System.out.println(maxProductSolution2(myArray));
        int[] myArray2 = {50,20,10,40,30};
        System.out.println(maxProduct(myArray2));
        System.out.println(maxProductSolution2(myArray2));


        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }

        long startTime = System.currentTimeMillis();
        String result1 = maxProduct(array);
        long endTime = System.currentTimeMillis();
        System.out.println("maxProduct completion time: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        String result2 = maxProductSolution2(array);
        endTime = System.currentTimeMillis();
        System.out.println("maxProductSolution2 completion time: " + (endTime - startTime) + " ms");
    }
}
