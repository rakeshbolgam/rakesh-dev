package com.programming.dsa.append;

public class Main {
    public static void main(String[] args) {
        LinkedList2 myLinkedList = new LinkedList2(1);
        myLinkedList.makeEmpty();
        myLinkedList.append(1);
        myLinkedList.append(2);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();
    }
}
