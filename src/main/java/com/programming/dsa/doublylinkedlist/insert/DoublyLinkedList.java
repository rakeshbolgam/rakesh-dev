package com.programming.dsa.doublylinkedlist.insert;

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
    public void prepend(int value){
        Node node=new Node(value);
        if(length==0){
            head=node;
            tail=node;
        }else{
            head.prev=node;
            node.next=head;
            head=node;
        }
        length++;
    }
    public Node get(int index){
        if(index<0 || index>=length){
            return null;
        }
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

    public boolean insert(int index, int value) {
        if(index<0 || index>length) return false;
        if(index==0){
            prepend(value);
            return true;
        }
        if(index==length){
            append(value);
            return true;
        }
        Node newNode=new Node(value);
        Node before=get(index-1);
        Node after=before.next;

        before.next=newNode;
        newNode.prev=before;

        after.prev=newNode;
        newNode.next=after;
        length++;
        return true;
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
