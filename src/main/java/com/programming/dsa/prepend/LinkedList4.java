package com.programming.dsa.prepend;

import com.programming.dsa.removelast.LinkedList3;

public class LinkedList4 {
    Node head;
    Node tail;
    int length;
    public LinkedList4(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
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
            System.out.println("Head : NUll");
        }else{
            System.out.println("Head:"+head.value);
        }
    }

    public void getTail() {
        if(tail==null){
            System.out.println("Tail : NUll");
        }else{
            System.out.println("Tail:"+tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length "+length);
    }

    public void printList() {
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void prepend(int i) {
        Node newNode = new Node(i);
        if(length==0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head=newNode;
        }
        length++;
    }

    class Node{
        int value;
        Node next;
        public Node(int value){
            this.value=value;
        }
    }
}
