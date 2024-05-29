package com.example.dsa.arrays;

public class SingleDimensionArray {

    int[] arr = null;

     public SingleDimensionArray(int sizeOfArray) {

         arr = new int[sizeOfArray];
         for (int i = 0; i < arr.length; i++) {

             arr[i] = Integer.MIN_VALUE;
         }
     }

     public void insert(int location, int value) { //Time complexity O(1)
         try {

             if (arr[location] == Integer.MIN_VALUE) {  //O(1)

                 arr[location] = value; //O(1)
                 System.out.println("Inserted."); //O(1)
             } else
                 System.out.println("This cell is already occupied."); //O(1)
         }catch (ArrayIndexOutOfBoundsException e) {
             System.out.println("Invalid index to access array!"); //O(1)
         }
     }
}
