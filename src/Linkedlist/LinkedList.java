package Linkedlist;

import java.util.Scanner;

public class LinkedList {
    Node head;

    // Insert at end
    void insert(int data) {
        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to last node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Display linked list


    // Function to take user input and create linked list
    static LinkedList createList() {

        Scanner sc = new Scanner(System.in);

        LinkedList list = new LinkedList();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.insert(value);
        }

        return list;
    }

}
