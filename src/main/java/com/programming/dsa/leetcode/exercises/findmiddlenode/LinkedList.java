package com.programming.dsa.leetcode.exercises.findmiddlenode;


public class LinkedList {
    Node head;
    Node tail;
    int length;
    class Node{
        int value;
        Node next;
        public Node(int value){
            this.value=value;
        }
    }
   public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    public void makeEmpty() {
        head=null;
        tail=null;
        length=0;
    }

    public Node findMiddleNode() {
        if(length==0) return null;
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){//1 2 3 4
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public void append(int i) {
        Node newNode = new Node(i);
        if(length==0){
            head=newNode;
            tail=newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
}
