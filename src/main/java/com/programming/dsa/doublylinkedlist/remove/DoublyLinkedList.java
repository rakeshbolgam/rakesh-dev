package com.programming.dsa.doublylinkedlist.remove;

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

    public Node removeFirst(){
        if(head==null) return  null;
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

    public Node removeLast(){
        if(head==null) return null;
        Node temp=tail;
        if(length==1){
            head=null;
            tail=null;
        }else{
            tail=tail.prev;
            tail.next=null;
            temp.prev=null;
        }
        length--;
        return temp;
    }

    public Node remove(int index) {
        if(index<0 || index>length)return null;
        if(index==0) return removeFirst();
        if(index==length-1) return removeLast();
        Node temp=get(index);
        temp.next.prev=temp.prev;
        temp.prev.next=temp.next;
        temp.prev=null;
        temp.next=null;
        length--;
        return temp;
    }
    public Node get(int index){
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
        Node next;
        Node prev;
        int value;
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
}
