package com.example.dsa.linkedList.singlyLinkedList;

public class SinglyLinkedList {

    public Node head;
    public Node tail;
    public int size;

    /**
     *
     * Time Complexity O(1)
     * Space Complexity O(1)
     * @param nodeValue value
     * @return node
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

    /**
     *
     * Time Complexity O(n)
     * Space Complexity O(1)
     * @param nodeValue value
     * @param location location
     */
    public void insertInLinkedList(int nodeValue, int location) {

        Node node = new Node(); //O(1)
        node.value = nodeValue; //O(1)
        if (head == null) {

            createSinglyLinkedList(nodeValue); //O(1)
            return;
        } else if (location == 0) {

            node.next = head; //O(1)
            head = node; //O(1)
        } else if (location >= size) {

            node.next = null; //O(1)
            tail.next = node; //O(1)
            tail = node; //O(1)
        } else {

            Node tempNode = head; //O(1)
            int index = 0; //O(1)
            while (index < location - 1){ //O(n)

                tempNode = tempNode.next; //O(1)
                index++; //O(1)
            }
            Node nextNode = tempNode.next; //O(1)
            tempNode.next = node; //O(1)
            node.next = nextNode; //O(1)
        }
        size++; //O(1)
    }

    /**
     *
     * Time Complexity O(n)
     * Space Complexity O(1)
     */
    public void traverseSinglyLinkedList() {

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

    /**
     *
     * Time Complexity O(n)
     * Space Complexity O(1)
     * @param nodeValue node value
     * @return boolean result
     */
    public boolean searchSinglyLinkedList(int nodeValue) {

        if (head != null){  //O(1)

            Node tempNode = head; //O(1)
            for (int i = 0; i < size; i++){  //O(n)

                if (tempNode.value == nodeValue) { //O(1)

                    System.out.println("Foud the node at location: "+ i +"\n"); //O(1)
                    return true; //O(1)
                }
                tempNode = tempNode.next; //O(1)
            }
        }
        System.out.println("Node not found"); //O(1)
        return false; //O(1)
    }

    /**
     * Time Complexity O(n)
     * Space Complexity O(1)
     * @param location in linkedList
     */
    public void deleteNode(int location) {

        if (head == null){  //O(1)

            System.out.println("SinglyList does not exist");
        } else if (location == 0) {

            head = head.next;  //O(1)
            size--; //O(1)
            if (size == 0) {
                tail = null; //O(1)
            }
        } else if (location >= size) {

            Node tempNode = head;
            for (int i = 0; i < size-1; i++) {  //O(n)

                tempNode = tempNode.next;
            }
            if (tempNode == head){
                tail = head = null; //O(1)
                size--;  //O(1)
                return;  //O(1)
            }
            tempNode.next = null;  //O(1)
            tail = tempNode;  //O(1)
            size--;  //O(1)
        } else {

            Node tempNode = head;
            for (int i = 0; i < location - 1; i++){  //O(n)
                tempNode = tempNode.next; //O(1)
            }
            tempNode.next = tempNode.next.next; //O(1)
            size--; //O(1)
        }


    }
}
