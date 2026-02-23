package com.programming.dsa.doublylinkedlist.prepend;

public class DoublyLinkedList {
    Node head;
    Node tail;
    int length;
    class Node{
        int value;
        Node next;
        Node prev;
        Node(int value){
            this.value=value;
        }
    }
    public DoublyLinkedList(int value){
        Node node = new Node(value);
        head=node;
        tail=node;
        length=1;
    }
    public void append(int i) {
        Node newNode = new Node(i);
        if(length==0){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
        length++;
    }

    public void printList() {
      Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nDoubly Linked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void prepend(int i) {
        Node newNode = new Node(i);
        if(length==0){
            head=newNode;
            tail=newNode;
        }else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        length++;
    }
}
