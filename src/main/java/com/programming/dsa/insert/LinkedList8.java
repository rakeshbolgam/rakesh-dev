package com.programming.dsa.insert;

public class LinkedList8 {
    Node head;
    Node tail;
    int length;

    public void printList() {
        Node temp = head;
        while(temp!=null){
            System.out.println("LinkedList\n "+temp.value);
            temp=temp.next;
        }
    }

    public boolean insert(int i, int i1) {
        if(i<0 || i>length) return false;
        Node newNode = new Node(i1);
        if(i==0){
            prepend(i1);
        }else if(i==length){
            append(i1);
        }else{//1 2  x  3    4
            Node node = get(i - 1);
            newNode.next=node.next;
            node.next = newNode;
        }
        length++;
        return true;
    }

    class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }
    LinkedList8(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int i){
        Node newNode = new Node(i);
        if(length==0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
    public void prepend(int i){
        Node newNode = new Node(i);
        if(length==0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }
    public Node removeLast(){
        if(length==0) return null;
        Node temp = head;
        Node prev = head;
        while(temp.next!=null){
            prev = temp;
            temp = temp.next;
        }
        tail = prev;
        tail.next = null;
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
    public boolean set(int index, int value){
        Node node = get(index);
        if(node!=null){
            node.value = value;
            return true;
        }
        return false;
    }
}
