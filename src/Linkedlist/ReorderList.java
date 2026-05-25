package Linkedlist;

import static Linkedlist.Reverse.reverse;

public class ReorderList {

    public static void reorder(Node head){
        Node slow = head;
        Node fast = head;

        while(fast.next!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println(slow.data);
        System.out.println(fast.data);

        Node list2 = slow.next;
        slow.next = null;

        head.display();
        list2.display();

        list2 = reverse(list2);
        list2.display();

        Node list1=head;
        merge2list(list1,list2);

    }

    private static void merge2list(Node list1, Node list2) {
        Node t1 = list1;
        Node t2= list2;
        Node dummynode = new Node(-1);
        Node temp = dummynode;

        while(t1!=null && t2!=null){
            temp.next = t1;
            temp=temp.next;
            t1=t1.next;

            temp.next=t2;
            temp=temp.next;
            t2=t2.next;
        }

        if(t1!=null){
            temp.next=t1;
        }else{
            temp.next=t2;
        }

        dummynode.next.display();
    }


    public static void main(String[] args) {
        LinkedList list = LinkedList.createList();

        System.out.println("Linked List:");
        list.head.display();

        reorder(list.head);
    }
}
