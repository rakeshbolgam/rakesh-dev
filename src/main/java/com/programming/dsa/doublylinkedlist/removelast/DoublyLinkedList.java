package com.programming.dsa.doublylinkedlist.removelast;

public class DoublyLinkedList {
    Node head;
    Node tail;
    int length;

    public Node removeLast() {
        if(length==0)return null;
        Node temp=tail;
        if(length==1){
            head=null;
            tail=null;
        }else{
           tail=temp.prev;
           tail.next=null;
           temp.prev=null;
        }
        length--;
        return temp;

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
}
