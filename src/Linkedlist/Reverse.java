package Linkedlist;

import static Linkedlist.ReorderList.reorder;

public class Reverse {

    public static Node reverse(Node head) {
        Node temp = head;;
        Node prev = null;
        while(temp!=null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        return prev;
    }

    public static void main(String[] args) {
        LinkedList list = LinkedList.createList();

        System.out.println("Linked List:");
        list.head.display();

        Node reverse_head = reverse(list.head);
        reverse_head.display();

    }
}
