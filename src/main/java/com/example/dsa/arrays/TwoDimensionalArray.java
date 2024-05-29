package com.example.dsa.arrays;

import java.util.Arrays;

public class TwoDimensionalArray {

    //Creating two-dimensional array
    // Step 1 - Declare
    // Step

    /**
     * Creating two-dimensional array
     * Step 1 - Declare
     * Step 2 - Instantiate
     * Step 3 - Initialize
     * Space Complexity O(mn)
     * Time Complexity all together O(1)
     * Time Complexity step by step O(mn)
     */
    public void creatingTwoDimensionalArray () {
        /*
        * Step 1 - Declare
        * Step 2 - Instantiate
        * Step 3 - Initialize
        * */
        int[][] int2DArray; //O(1)
        int2DArray = new int[2][2]; //O(1)
        int2DArray[0][0] = 1; //O(1)
        int2DArray[0][1] = 2; //O(1)  ---- O(mn)
        int2DArray[1][0] = 3; //O(1)  ----
        int2DArray[1][1] = 4; //O(1)
        System.out.println(Arrays.deepToString(int2DArray));

        //All Together
        String[][] string2DArray = {{"a", "b"}, {"c", "d"}}; //O(1)
        System.out.println(Arrays.deepToString(string2DArray));
    }
    int[][] arr = null;

    /**
     * Constructor
     * @param numberOfRows size of row
     * @param numberOfColumns size of column
     */
    public TwoDimensionalArray(int numberOfRows, int numberOfColumns) {
        this.arr = new int[numberOfRows][numberOfColumns];
        for (int row = 0; row < numberOfRows; row++){
            for (int col = 0; col < numberOfColumns; col++){

                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    /**
     * Inserting value in the array
     * Time Complexity O(1)
     * Space Complexity O(1)
     * @param row row index
     * @param col row column
     * @param value insert value
     */
    public void insert(int row, int col, int value) {

        try {

            if (arr[row][col] == Integer.MIN_VALUE){  //O(1)

                arr[row][col] = value; //O(1)
                System.out.println("The value inserted"); //O(1)
            } else
                System.out.println("This cell is already occupied!"); //O(1)
        }catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid index for 2D array!"); //O(1)
        }
    }

    /**
     * Accessing cell value from given array
     * Time Complexity O(1)
     * Space Complexity O(1)
     * @param row index
     * @param col index
     */
    public void accessCell(int row, int col) {
        System.out.println("\nAccesing Row#"+ row + ", Col#"+col); //O(1)
        try {
            System.out.println("Cell value: "+ arr[row][col]); //O(1)
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array!"); //O(1)
        }
    }

    /**
     * Traverse 2D Array
     * Time Complexity O(mn)
     * Space Complexity O(1)
     */
    public void traverse2DArray() {

        for (int row = 0; row < arr.length; row++){ //O(m)

            for (int col = 0; col < arr.length; col++) { //O(n)

                System.out.print(arr[row][col] + " "); //O(1)
            }
            System.out.println(); //O(1)
        }
    }

}
