package com.programming.dsa.set;

public class Main {
    public static void main(String[] args) {
        LinkedList7 myLinkedList = new LinkedList7(0);
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);

        System.out.println("Linked List before set():");
        myLinkedList.printList();

        myLinkedList.set(2, 99);

        System.out.println("\nLinked List after set():");
        myLinkedList.printList();
    }
}
