package com.programming.dsa.leetcode.exercises.findmiddlenode.partitionlist;

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
        head=node;
        tail=node;
        length=1;
    }
    public void makeEmpty() {
        head=null;
        tail=null;
        length=0;
    }

    public void partitionList(int i) {
        if(head==null) return;
        Node dummy1=new Node(0);
        Node prev1=dummy1;
        Node dummy2 = new Node(0);
        Node prev2=dummy2;
        Node curr=head;
        while(curr!=null){
            if(curr.value<i){
                prev1.next=curr;
                prev1=prev1.next;
            }else{
                prev2.next=curr;
                prev2=curr;
            }
            curr=curr.next;
        }
        prev2.next=null;
        prev1.next=dummy2.next;
        head=dummy1.next;
    }

    public void printList() {
        System.out.println("LinkedList:\n");
        Node temp=head;
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
