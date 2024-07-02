package com.example.dsa.linkedList.singlyLinkedList;

public class SinglyLinkedList {

    public Node head;
    public Node tail;
    public int size;

    /**
     *
     * Time Complexity O(1)
     * Space Complexity O(1)
     * @param nodeValue
     * @return
     */
    public Node createSinglyLinkedList(int nodeValue) {

        head = new Node();  //O(1)
        Node node = new Node(); //O(1)
        node.next = null;  //O(1)
        node.value = nodeValue;  //O(1)
        head = node; //O(1)
        tail = node; //O(1)
        size = 1; //O(1)
        return head;
    }
}
