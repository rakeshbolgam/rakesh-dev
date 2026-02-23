package com.programming.dsa.leetcode.exercises.findmiddlenode.swapnodesinpairs;

public class LinkedList {
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
        length=1;
    }

    public void swapPairs() {
        Node dummy = new Node(0);
        dummy.next=head;
        Node prev=dummy;//p f s
        Node first=head;// 0 1 2 3 4
        while(first!=null && first.next!=null){
            Node second = first.next;

            prev.next=second;
            first.next=second.next;
            second.next=first;

            prev=first;
            first=first.next;
        }
        head=dummy.next;
    }

    public void printList() {
        Node temp = head;
        System.out.print("LinkedList : ");
        while(temp!=null){
            System.out.print(temp.value+" ");
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
