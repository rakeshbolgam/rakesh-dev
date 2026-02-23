package com.programming.dsa.reverse;

public class LinkedList10 {
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
    LinkedList10(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    public void append(int i) {
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
    public Node removeLast(){
        if(length==0) return null;
        Node temp = head;
        Node prev = head;
        while(temp.next!=null){
            prev = temp;
            temp=temp.next;
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
    public Node get(int index){
        if(index<0 || index>=length) return null;
        Node temp = head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
    public boolean set(int index, int value){
        Node node = get(index);
        if(node!=null){
            node.value=value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value){
        if(index<0 || index>length) return false;
        Node newNode = new Node(value);
        if(index==0)
            prepend(value);
        else if(index==length-1)
            append(value);
        else{
            Node temp = get(index-1);
            newNode.next=temp.next;
            temp.next=newNode;
        }
        length++;
        return true;

    }

    public Node remove(int index){
        if(index<0 || index>=length) return null;
        if(index==0)
            return removeFirst();
        if(index==length-1)
           return removeLast();
        Node node = get(index-1);//1 2 3 4 5
        Node temp = node.next;
        node.next = temp.next;
        length--;
        return temp;
    }

    public void printList() {
        Node temp = head;
        System.out.println("LinkedList\n");
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
//1 2 3 4 5 --> 5 4 3 2 1
    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for(int i=0;i<length;i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
}
