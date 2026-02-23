package com.programming.dsa.set;

public class LinkedList7 {
    Node head;
    Node tail;
    int length;

    public void printList() {
        Node temp = head;//1 2 3 4 5 6
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }

    class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }
    LinkedList7(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    public void append(int i){
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
    public void prepend(int i){
        Node newNode=new Node(i);
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
        Node temp= head;
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
        if(length==0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length==0){
            tail=null;
        }
        return temp;
    }
    public Node get(int index){
        if(index<0 || index>=length){
            return null;
        }
        Node temp = head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
    public boolean set(int index, int value ){
        //1 2 3 4 5 6 1 2 99 4 5 6
        Node temp = get(index);
        if(temp!=null){
            temp.value=value;
            return true;
        }
        return false;
    }
}
