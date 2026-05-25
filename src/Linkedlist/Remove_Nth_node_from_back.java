package Linkedlist;

public class Remove_Nth_node_from_back {

    public static void Remove_Nth_node_from_back(Node head, int n){
        Node slow = head;
        Node fast = head;

        for(int i=0;i<n;i++){
            fast = fast.next;
        }

        if (fast == null)
            head.next.display();

        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }

        if(slow.next!=null)
            slow.next = slow.next.next;
        head.display();

    }

    public static void main(String[] args) {
        LinkedList list = LinkedList.createList();

        System.out.println("Linked List:");
        list.head.display();

        Remove_Nth_node_from_back(list.head,2);
    }
}
