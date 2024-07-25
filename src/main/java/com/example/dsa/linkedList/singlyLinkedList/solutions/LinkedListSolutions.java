package com.example.dsa.linkedList.singlyLinkedList.solutions;

import com.example.dsa.linkedList.singlyLinkedList.Node;

public class LinkedListSolutions {

    static Node head;
    static Node tail;

    static int size;

    public static void main(String[] args) {

        addNodeEndOfLinkedList(5);
        addNodeEndOfLinkedList(10);
        traverseSinglyLinkedList();
        System.out.println(popNode().value);
        System.out.println(tail.value);
        System.out.println(popNode().value);
        System.out.println(tail.value);
    }

    public static void traverseSinglyLinkedList() {

        if (head == null)
            System.out.println("Singly linked list doesn't exist"); //O(1)
        else {

            Node tempNode = head; //O(1)
            for (int i = 0; i < size; i++){ //O(n)

                System.out.print(tempNode.value); //O(1)
                if (i != size - 1)
                    System.out.print(" -> "); //O(1)
                tempNode = tempNode.next; //O(1)
            }
        }
        System.out.println("\n"); //O(1)
    }

    public static void addNodeEndOfLinkedList(int nodeValue) {

        Node node = new Node(); //O(1)
        node.value = nodeValue; //O(1)
        if (head == null) {

            node.next = null;
            head = node;
            tail = node;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    public static Node popNode() {

        Node node;
        node = head;
        Node rm = new Node();

        for (int i = 0;i < size ;i++ ) {

            if (tail == head){

                rm = node;
                node.next = null;
                tail = null;
                head = null;
                break;
            }
            if(i == size-1){
                rm = node.next;
                node.next = null;
                tail = node;
            }
        }
        size--;
        return rm;
    }

}
