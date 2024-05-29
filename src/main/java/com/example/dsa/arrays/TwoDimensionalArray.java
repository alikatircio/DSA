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

}
