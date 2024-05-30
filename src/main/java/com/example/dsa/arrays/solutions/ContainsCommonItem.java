package com.example.dsa.arrays.solutions;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * Given 2 arrays, create a function that let's a user know (true/false) whether these two arrays contain any common items
 *
 * array1 = ['a','b','c', 'x']
 * array2 = ['z','y','i']
 * should return false
 *
 * array1 = ['a','b','c', 'x']
 * array2 = ['z','y','x']
 * should return true
 *
 */

public class ContainsCommonItem {

    public static boolean commonItem(String[] array1, String[] array2) {

        //O(a*b) time complexity
        //O(1) space complexity
        for (String string : array1) {

            for (String s : array2) {

                 if (string.contains(s))
                     return true;
            }
        }
        return false;
    }

    public static boolean commonItem2 (String[] array1, String[] array2) {

        //O(a+b)
        //O(a) space complexity
        HashMap<String, Boolean> hashMap = new HashMap<>();
        for (String string : array1) {

            if (!hashMap.containsKey(string)) {

                hashMap.put(string, true);
            }
        }

        for (String s : array2) {

            if (hashMap.containsKey(s))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {

        String[] array1 = {"a","b","c", "x"};
        String[] array2 = {"z","y",","};
        String[] array3 = {"a","b","c", "x"};
        String[] array4 = {"z","y","x"};
        System.out.println(commonItem(array1, array2));
        System.out.println(commonItem(array3, array4));
        System.out.println(commonItem2(array1, array2));
        System.out.println(commonItem2(array3, array4));
    }

}
