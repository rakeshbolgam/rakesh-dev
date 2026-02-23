package com.programming.dsa.leetcode.exercises.findmiddlenode.kthnodefromend;

public class LinkedList3 {
    Node head;
    Node tail;
    int length;

    public Node findKthFromEnd(int k) {
        //0 1 2 3 4 5 6 7 8
        //1 2 3 4 5 6 7 8 9
        //9 8 7 6 5 4 3 2 1
        // k=3-->7
        /*
        int kthval = length-k;==>9-3=6
        for(int i=0;i<kthval;i++{
        //0 to 6
            node=node.next;
        }
        return node;
         */
        if(length==0) return null;
        Node slow = head;
        Node fast = head;
        for(int i=0;i<k;i++){
            if(fast==null) return null;
            fast = fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }

    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    public LinkedList3(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
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
    public void makeEmpty(){
        head=null;
        tail=null;
        length=0;
    }

}
