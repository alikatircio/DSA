package com.example.dsa.arrays;

public class OneDimensionalArrayMain {

    public static void main(String[] args) {

        SingleDimensionArray sda = new SingleDimensionArray(10);
        sda.insert(0,0);
        sda.insert(1,10);
        sda.insert(2,20);
        sda.insert(1,30);
        sda.insert(12,120);

        var firstElement = sda.arr[0]; //O(1)
        System.out.println(firstElement);

        System.out.println("Array traversal");
        sda.traverseArray();
        sda.searchInArray(20);
        sda.searchInArray(40);
        sda.deleteValue(0);
        System.out.println(sda.arr[0]);

    }
}
