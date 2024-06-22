package com.example.dsa.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IntroductionArrayList {

    public static void traversalArrayList () {

        ArrayList<String> strings = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
        for (int i = 0; i < strings.size(); i++) { // Time Complexity O(N) Space Complexity O(1)
            System.out.println(strings.get(i));
        }

        for (String s : strings) { // Time Complexity O(N) Space Complexity O(1)

            System.out.println(s);
        }

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) { // Time Complexity O(N) Space Complexity O(1)

            System.out.println(iterator.next());
        }
    }

    /**
     * Time Complexity O(N)
     * Space Complexity O(1)
     */
    public static void  searchInArrayList () {

        ArrayList<String> strings = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
        for (String s : strings) {

            if (s.equals("D")) {

                System.out.println("Element is found");
                break;
            }
        }

        int index = strings.indexOf("C");
        System.out.println("The element index "+ index);

    }

    /**
     * Time Complexity O(N)
     * Space Complexity O(1)
     */
    public static void  deleteInArrayList () {

        ArrayList<String> strings = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
        strings.remove(2);
        strings.remove("D");
        System.out.println(strings);
    }
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>(); //default 10 time complexity O(1) space complexity O(n)
        System.out.println(numbers);
        ArrayList <Integer> nums = new ArrayList<Integer>(Arrays.asList(1,2));
        System.out.println(nums);
        numbers.add(1); //time and space complexity O(1)
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers);
        numbers.add(2,4); // time complexity O(N), space complexity O(1)
        System.out.println(numbers);

        ArrayList<String> strings = new ArrayList<String>();
        strings.add("A");
        strings.add("B");
        System.out.println(strings);
        strings.add(1, "C");
        System.out.println(strings);
        System.out.println(strings.get(1)); //time and space complexity O(1)
        System.out.println(strings.get(0));
        traversalArrayList();
        searchInArrayList();
        deleteInArrayList();

    }
}
