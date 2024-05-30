package com.example.dsa.arrays;

import java.util.Arrays;

public class BestTwoScore {

    public static int[] findTopTwoScores(int[] array){

        int firstHighestScore = Integer.MIN_VALUE;
        int secondHighestScore = Integer.MIN_VALUE;
        for (int score : array) {

            if (score > firstHighestScore) {

                secondHighestScore = firstHighestScore;
                firstHighestScore = score;
            } else if (score > secondHighestScore && score < firstHighestScore){

                secondHighestScore = score;
            }
        }
        return new int[]{firstHighestScore, secondHighestScore};
    }

    public static void main(String[] args) {

        int[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        System.out.println(Arrays.toString(findTopTwoScores(myArray)));
    }
}
