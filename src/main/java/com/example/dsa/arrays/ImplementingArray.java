package com.example.dsa.arrays;

import java.util.HashMap;

public class ImplementingArray {

    private int length;
    private HashMap<Integer, Object> data;
    public  ImplementingArray(){

        this.length = 0;
        this.data = new HashMap<>();
    }

    private Object get(int index){

        return this.data.get(index);
    }

    private void add(Object item){

        this.data.put(length, item);
        length++;
    }

    private void deleteLast() {

        data.remove(length-1);
        length--;
    }

    private void shiftItem(int index) {

        for (int i = index; i < length-1; i++){

            data.put(i, data.get(i + 1));
        }
        data.remove(length - 1);
        length--;
    }
    private Object delete(int index) {

        Object item = data.get(index);
        shiftItem(index);
        return item;
    }


    public static void main(String[] args) {

        ImplementingArray newArray = new ImplementingArray();
        newArray.add("hi");
        newArray.add("you");
        newArray.add("!");
        newArray.deleteLast();
        newArray.delete(1);
        System.out.println(newArray.data.toString());
    }
}
