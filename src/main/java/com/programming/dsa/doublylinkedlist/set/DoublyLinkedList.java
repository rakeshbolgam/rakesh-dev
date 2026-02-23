package com.programming.dsa.doublylinkedlist.set;

public class DoublyLinkedList {
    Node head;
    Node tail;
    int length;

    public void append(int i) {
        Node node=new Node(i);
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

    public boolean set(int index, int val) {
        Node temp=get(index);
        if(temp!=null){
            temp.value=val;
            return true;
        }
        return false;
    }

    private Node get(int index) {
        if(index<0 || index>=length) return null;
        Node temp=head;
        if(index<length/2){
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
        }else{
            temp=tail;
            for(int i=length-1;i>index;i--){
                temp=temp.prev;
            }
        }
        return temp;
    }

    class Node{
        int value;
        Node next;
        Node prev;
        Node(int value){
            this.value=value;
        }
    }
    public DoublyLinkedList(int value){
        Node node=new Node(value);
        head=node;
        tail=node;
        length=1;
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nDoubly Linked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }
}
