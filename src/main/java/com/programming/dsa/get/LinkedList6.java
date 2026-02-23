package com.programming.dsa.get;

public class LinkedList6 {
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
    LinkedList6(int value){
        Node newNode = new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
    }
    public void append(int i){
        Node newNode = new Node(i);
        if(length>0){
            tail.next=newNode;
            tail=newNode;
        }else{
            head=newNode;
            tail=newNode;
        }
        length++;
    }
    public void prepend(int i){
        Node newNode = new Node(i);
        if(length==0){
            head=newNode;
            tail=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
        length++;
    }
    public Node removeLast(){
        if(length==0) return null;
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
    public Node removeFirst(){
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
    public Node get(int index){
        if(index<0 || index>=length) return null;
        Node temp=head;//1->2->3->4->5
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
}
