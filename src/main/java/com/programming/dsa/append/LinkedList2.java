package com.programming.dsa.append;

public class LinkedList2 {
    Node head;
    Node tail;
    int length;
    class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }
    public LinkedList2(int value){
        System.out.println("2");
       Node newNode = new Node(value);
       head = newNode;
       tail = newNode;
       length = 1;
        System.out.println("Head :"+head.value);
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void append(int i) {
        Node newNode = new Node(i);
        if(length>0){
            tail.next = newNode;
            tail = newNode;
        }else{
            head = newNode;
            tail = newNode;
        }
        length++;
    }

    public void getHead() {
        if(head==null){
            System.out.println("Head : Null");
        }else{
            System.out.println("Head :"+head);
        }
    }

    public void getTail() {
        if(tail==null){
            System.out.println("Tail : Null");
        }else{
            System.out.println("Tail :"+tail);
        }
    }

    public void getLength() {
        System.out.println("Length : "+length);
    }

    public void printList() {
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
