package com.programming.dsa.removelast;

public class LinkedList3 {
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
    public LinkedList3(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    public void append(int i) {
        Node newNode = new  Node(i);
        if(length>0){
            tail.next = newNode;
            tail = newNode;
        }else{
            head = newNode;
            tail = newNode;
        }
        length++;
    }
    public Node removeLast() {
       if(length==0) return null;
       Node temp = head;
       Node pre = head;
       while(temp.next!=null){
           pre=temp;
           temp = temp.next;
       }
       tail=pre;
       tail.next=null;
       length--;
       if(length==0){
           head=null;
           tail=null;
       }
       return temp;
    }
}
