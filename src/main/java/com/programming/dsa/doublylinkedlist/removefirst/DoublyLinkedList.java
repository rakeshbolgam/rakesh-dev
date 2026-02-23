package com.programming.dsa.doublylinkedlist.removefirst;

public class DoublyLinkedList {
    Node head;
    Node tail;
    int length;
    class Node{
        int value;
        Node next;
        Node prev;
        Node(int value){
            this.value=value;
        }
    }
    public DoublyLinkedList(int value){
        Node node = new Node(value);
        head=node;
        tail=node;
        length=1;
    }
    public void append(int i) {
        Node node = new Node(i);
        if(length==0){
            head=node;
            tail=node;
        }else{
            tail.next=node;
            node.prev=tail;
            tail=node;
        }
        length++;
    }

    public Node removeFirst() {
        if(head==null) return null;
        Node temp=head;
        if(length==1){
            head=null;
            tail=null;
        }else{
            head=head.next;
            head.prev=null;
            temp.next=null;
        }
        length--;
        return temp;
    }
}
