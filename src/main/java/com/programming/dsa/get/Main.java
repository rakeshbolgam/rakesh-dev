package com.programming.dsa.get;

public class Main {
    public static void main(String[] args) {
        LinkedList6 myLinkedList = new LinkedList6(0);
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        System.out.println(myLinkedList.get(3).value);
    }
}
