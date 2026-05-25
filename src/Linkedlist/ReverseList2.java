package Linkedlist;

public class ReverseList2 {
    public static void main(String[] args) {
        LinkedList list = LinkedList.createList();

        System.out.println("Linked List:");
        list.head.display();

        Node reverse_head = reverselist2(list.head,2,4);
        reverse_head.display();
    }

    private static Node reverselist2(Node head,int left, int right) {
        Node dummynode = new Node(-1);
        dummynode.next = head;
        Node prev = dummynode;
        Node curr = head;

        for(int i=0;i<left-1;i++){
            prev = prev.next;
            curr = curr.next;
        }
        prev.display();
        curr.display();

        Node prevleft = prev;
        Node prevnode = null;
        Node currNode = curr;
        for(int i=left;i<=right;i++){
            Node front = curr.next;
            curr.next = prevnode;
            prevnode = curr;
            curr = front;
        }
        prev.next = prevnode;
        currNode.next = curr;


        return dummynode.next;
    }
}
