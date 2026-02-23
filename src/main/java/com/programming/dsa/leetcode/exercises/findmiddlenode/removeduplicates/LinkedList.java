package com.programming.dsa.leetcode.exercises.findmiddlenode.removeduplicates;

import java.util.HashSet;

public class LinkedList {
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
    public LinkedList(int value){
        Node newNode = new Node(value);
        head=newNode;
        tail=newNode;
        length = 1;
    }
    public void makeEmpty() {
        head=null;
        tail=null;
        length=0;
    }

//    public void removeDuplicates() {
//        // t2
//        // 1     2   3   4   2   3   5
//        // t1
//        if(head==null) return;
//        Node temp1 = head;
//        while(temp1!=null){
//            Node temp2 = temp1;
//            while(temp2.next!=null){
//                if(temp1.value==temp2.next.value){
//                    temp2.next = temp2.next.next;
//                }else{
//                    temp2=temp2.next;
//                }
//            }
//            temp1=temp1.next;
//        }
////        head=temp1;
//    }


    public void removeDuplicates(){
        HashSet<Integer> set = new HashSet<>();
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            if(set.contains(curr.value)){
               prev.next = curr.next;
            }else{
                set.add(curr.value);
                prev=curr;
            }
            curr=curr.next;
        }
    }

    public void printList() {
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
    }

    public void append(int i) {
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
}
