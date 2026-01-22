package com.programming.dsa;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }

    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead(){
        return head;
    }
    public Node getTail(){
        return tail;
    }
    public int getLength(){
        return length;
    }

    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll(){
        if(length==0){
            System.out.println("Head : null");
            System.out.println("Tail : null");
        }else{
            System.out.println("Head : "+head.value);
            System.out.println("Tail : "+tail.value);
        }
        System.out.println("Length : "+length);
        System.out.println("LinkedList :");
        if(length==0){
            System.out.println("List is Empty");
        }else{
            printList();
        }
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length>0){
            tail.next = newNode;
            tail = newNode;
        }else{
            head = newNode;
            tail = newNode;
        }
        length++;
    }
}
