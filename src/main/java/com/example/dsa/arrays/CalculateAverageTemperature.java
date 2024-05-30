package com.example.dsa.arrays;

import java.util.Scanner;

public class CalculateAverageTemperature {

    public static void calculateTemp () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days' temperatures?");
        int numDays = scanner.nextInt();
        int[] temp = new int[numDays];
        int sum = 0;
        for (int i = 0; i < numDays; i++) {

            System.out.println("Day "+(i+1)+" 's high temp:");
            temp[i] = scanner.nextInt();
            sum += temp[i];
        }
        double avg = (double) sum / numDays;
        System.out.println();
        System.out.println("Average Temp: "+ avg);

        for (int i = 0; i < temp.length; i++) {

            if (temp[i] > avg){

                System.out.println("Day "+(i+1)+" temperature above the average.");
            }
        }
    }

    public static void main(String[] args) {

        calculateTemp();
    }
}
