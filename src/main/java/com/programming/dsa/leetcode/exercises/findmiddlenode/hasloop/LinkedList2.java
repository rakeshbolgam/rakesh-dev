package com.programming.dsa.leetcode.exercises.findmiddlenode.hasloop;

public class LinkedList2 {
    Node head;
    Node tail;
    int length;

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public boolean hasLoop() {
        if(length==0)return false;
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){// 1 2 3 4 5
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) return true;
        }
        return false;
        
    }

    public Node getHead() {
        return this.head;
    }

    public void append(int i) {
        Node newNode = new Node(i);
        if(length==0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node getTail() {
        return this.tail;
    }

    class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }
    public LinkedList2(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length=1;
    }

}
