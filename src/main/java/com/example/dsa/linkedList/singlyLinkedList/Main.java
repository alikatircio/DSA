package com.example.dsa.linkedList.singlyLinkedList;

public class Main {

    public static void main(String[] args) {


        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.createSinglyLinkedList(5);
        System.out.println(singlyLinkedList.head.value);

        singlyLinkedList.insertInLinkedList(6,0);
        System.out.println(singlyLinkedList.head.value);

        singlyLinkedList.insertInLinkedList(7,1);
        System.out.println(singlyLinkedList.head.next.value);

        singlyLinkedList.insertInLinkedList(8,3);
        singlyLinkedList.insertInLinkedList(9,4);
        System.out.println(singlyLinkedList.head.next.next.next.value);
        System.out.println(singlyLinkedList.tail.value);
        singlyLinkedList.traverseSinglyLinkedList();
        singlyLinkedList.searchSinglyLinkedList(9);
        singlyLinkedList.deleteNode(3);
        singlyLinkedList.traverseSinglyLinkedList();
        singlyLinkedList.deleteSinglyLinkedList();
        singlyLinkedList.traverseSinglyLinkedList();

    }
}
