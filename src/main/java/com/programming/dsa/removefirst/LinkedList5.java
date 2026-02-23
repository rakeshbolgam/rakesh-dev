package com.programming.dsa.removefirst;

public class LinkedList5 {
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
    public LinkedList5(int value){
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
    public Node removeLast(){
        if(length==0)return null;
        Node temp = head;
        Node prev = head;
        while(temp.next!=null){
            prev=temp;
            temp=temp.next;
        }
        tail=prev;
        tail.next=null;
        length--;
        if(length==0){
            head=null;
            tail=null;
        }
        return temp;
    }
    public Node removeFirst() {
        //1->2->3 temp=head head=temp.next temp.next=null return temp;;
        if(length==0)return null;
        Node temp = head;
        head = head.next;
        temp.next=null;
        length--;
        if(length==0){
            tail=null;
        }
        return temp;
    }
}
