package com.example.dsa.arrays.solutions;

public class BestTimeToBuySellStock {

    public static int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
        int[] prices4 = {3,2,6,5,0,3};
        System.out.println(maxProfit(prices4));
    }
}
