package com.example.dsa.arrays;

public class SingleDimensionArray {

    int[] arr = null;

     public SingleDimensionArray(int sizeOfArray) {

         arr = new int[sizeOfArray];
         for (int i = 0; i < arr.length; i++) {

             arr[i] = Integer.MIN_VALUE;
         }
     }

    /**
     * Insert value an array
     * Time Complexity O(1)
     * Space Complexity O(n)
     * @param location array index
     * @param value array value
     */
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

     //

    /**
     * Array Traversal
     * Time Complexity O(n)
     * Space Complexity O(1)
     */
    public void traverseArray() {

         try {

             for (int i = 0; i < arr.length; i++) {

                 System.out.print(arr[i] + " ");
             }
             System.out.println("\n");
         }catch (Exception e) {
             System.out.println("Array no longer exists!");
         }
    }

    //Search for an element in the given array

    /**
     * Search for an element in the given array
     * Time Complexity O(n)
     * Space Complexity O(1)
     * @param value searchValue
     */
    public void searchInArray(int value) {

        for(int i : arr){ //O(N)

            if (i == value){ //O(1)

                System.out.println("Value is found "+ i); //O(1)
                return; //O(1)
            }
        }
        System.out.println(value + " is not found"); //O(1)
    }

    /**
     * Delete value from array
     * Time Complexity O(1)
     * Space Complexity O(1)
     * @param valueIndex delete index
     */
    public void deleteValue(int valueIndex) {

        try {

            arr[valueIndex] = Integer.MIN_VALUE; // O(1)
            System.out.println("The value has been deleted successfully!"); // O(1)
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The value that is provided is not in the range of array!"); // O(1)
        }
    }
}
