package com.programming.dsa.doublylinkedlist.get;

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
        Node node= new Node(value);
        head=node;
        tail=node;
        length=1;
    }

    public void append(int i){
        Node node =new Node(i);
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
}
