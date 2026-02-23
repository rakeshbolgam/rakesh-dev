package com.programming.dsa.leetcode.exercises.findmiddlenode.reversebetween;

import com.programming.dsa.remove.LinkedList9;

public class LinkedList {
    Node head;
    Node tail;
    int length;

    public void makeEmpty() {
        head=null;
        tail=null;
        length=0;
    }

//    public void reverseBetween(int i1, int i2) {
//        if(head==null) return;
//        Node dummy=new Node(0);
//        dummy.next=head;
//        Node prev=dummy;
//        for(int i=0;i<i1;i++){
//            prev=prev.next;
//        }
//        Node curr=prev.next;
//        for(int i=0;i<i2-i1;i++){
//            Node toMove = curr.next;
//            curr.next = toMove.next;
//            toMove.next = prev.next;
//            prev.next = toMove;
//        }
//        head=dummy.next;
//
//    }
    //      1 -> 2 -> 3 -> 4 -> 5   2,4
public void reverseBetween(int startIndex, int endIndex) {
    if (head == null) return;
    Node dummyNode = new Node(0);// 0->1 -> 2 -> 3 -> 4 -> 5
    dummyNode.next = head;
    Node previousNode = dummyNode;
//                                                 p->p->  p
    for (int i = 0; i < startIndex; i++) {
        System.out.println("prev.val:"+previousNode.value);//0->2   0->1 -> 2 -> 3 -> 4 -> 5
        previousNode = previousNode.next;// prev->2
    }
    System.out.println("prev.val:"+previousNode.value);
//                                                 p    c    m
    Node currentNode = previousNode.next;//0->1 -> 2 -> 3 -> 4 -> 5  , 2

    for (int i = 0; i < endIndex - startIndex; i++) {
        Node nodeToMove = currentNode.next;//0->1->2(p)->4->3(c)->5(m)
        currentNode.next = nodeToMove.next;    //0->1 -> 2(p) -> 3(c) -> 5 => 4(m)
        nodeToMove.next = previousNode.next;   //0->1 -> 2(p) -> 3(c) -> 5 => 4(m)->3(c)
        previousNode.next = nodeToMove;// 0->1->2(p)->4(m)->3(c)->5
    }

    head = dummyNode.next;
}


    public void printList() {
        Node temp = head;
        while(temp!=null){
            System.out.println("LinkedList\n "+temp.value);
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
    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }
    public void append(int value){
        Node newNode = new Node(value);
        if(length==0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
    public void prepend(int value){
        Node newNode = new Node(value);//    x 1 2 3 4 5
        if(length==0){                 //      t
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }
    public Node removeFirst(){
        if(length==0)return null;
        Node temp = head;
        head = head.next;
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
        while(temp.next!=null){// 1 2 3 4 5
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
        if(length==0) return null;
        Node temp = head;
        for(int i=0;i<index;i++){// 1 2 3 4 5  i=3
            temp = temp.next;
        }
        return temp;
    }
}
