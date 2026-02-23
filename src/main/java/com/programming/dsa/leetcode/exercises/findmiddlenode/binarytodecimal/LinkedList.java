package com.programming.dsa.leetcode.exercises.findmiddlenode.binarytodecimal;

public class LinkedList{
    Node head;
    Node tail;
    int length;
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }
    public LinkedList(int value){
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }
    public void makeEmpty() {
        head=null;
        tail=null;
        length=0;
    }

    public int binaryToDecimal() {
        if(length==0) return 0;
        Node current = head;
        int num=0;
        while(current!=null){
            num=(num*2)+current.value;
            current=current.next;
        }
        return num;
    }
    // 1    0   1    1 =>
    // 2^3*1+    2^2*0+    2^1*1   +2^0*1

    public void printList() {
        Node temp = head;
        System.out.println("LinkedList : \n");
        while(temp!=null){
            System.out.println(temp.value+" ");
            temp=temp.next;
        }
    }

    public void append(int i) {
        Node newNode = new Node(i);
        if(length==0){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
        length++;
    }
}
