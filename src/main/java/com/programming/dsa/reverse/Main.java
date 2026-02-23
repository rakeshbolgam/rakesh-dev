package com.programming.dsa.reverse;

public class Main {
    public static void main(String[] args) {
        LinkedList10 myLinkedList = new LinkedList10(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);

        System.out.println("LL before reverse():");
        myLinkedList.printList();

        myLinkedList.reverse();

        System.out.println("\nLL after reverse():");
        myLinkedList.printList();

    }
}
