package com.example.dsa.arrays.solutions;

import java.util.ArrayList;

public class ReverseString {

    public static String reverseString(String string) {

        char[] backwards = new char[string.length()];

        for (int i = string.length()-1; i >= 0  ; i--){

            backwards[string.length()-1 - i] = string.charAt(i);
        }

        return new String(backwards);
    }

    public static void main(String[] args) {

        System.out.println(reverseString("Hi my name is Ali"));
    }
}
