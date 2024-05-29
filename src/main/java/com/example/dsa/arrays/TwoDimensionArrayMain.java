package com.example.dsa.arrays;

import java.util.Arrays;

public class TwoDimensionArrayMain {

    public static void main(String[] args) {

        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray(0,0);
        twoDimensionalArray.creatingTwoDimensionalArray();
        TwoDimensionalArray tda = new TwoDimensionalArray(3,3);
        tda.insert(0,0 ,10);
        tda.insert(0,0 ,20);
        tda.insert(0,1 ,20);
        tda.insert(1,0 ,30);
        tda.insert(2,1 ,40);
        System.out.println(Arrays.deepToString(tda.arr));
        tda.accessCell(0,1);
        tda.traverse2DArray();
        tda.searchValueIn2DArray(30);
        tda.searchValueIn2DArray(120);
        tda.deleteValue(1,0);
        tda.deleteValue(1,3);
        System.out.println(Arrays.deepToString(tda.arr));
    }
}
