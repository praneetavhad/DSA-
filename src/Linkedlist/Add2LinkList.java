package Linkedlist;

public class Add2LinkList {
    public static void main(String[] args) {
        LinkedList list1 = LinkedList.createList();
        LinkedList list2 = LinkedList.createList();

        System.out.println("Linked List1:");
        list1.head.display();
        System.out.println("Linked List2:");
        list2.head.display();

        add2list(list1.head,list2.head);

    }

    private static void add2list(Node head1, Node head2) {
        Node dummynode = new Node(-1);
        Node curr = dummynode;

        Node t1=head1;
        Node t2= head2;
        int carry = 0;
        int sum = 0;

        while(t1!=null && t2!=null){
            sum = t1.data + t2.data + carry;
            if(sum > 9){
                carry =1;
                sum = sum % 10;
            }else{
                carry = 0;
            }
            t1=t1.next;
            t2=t2.next;
            curr.next = new Node(sum);
            curr = curr.next;
        }

        while(t1!=null){
            sum = t1.data + carry;
            if(sum > 9){
                carry =1;
                sum = sum % 10;
            }else{
                carry = 0;
            }
            t1 = t1.next;
            curr.next = new Node(sum);
            curr = curr.next;
        }

        while(t2!=null){
            sum = t2.data + carry;
            if(sum > 9){
                carry =1;
                sum = sum % 10;
            }else{
                carry = 0;
            }
            t2 = t2.next;
            curr.next = new Node(sum);
            curr = curr.next;
        }

        if(carry == 1){
            curr.next = new Node(carry);
            curr = curr.next;
        }

        dummynode.next.display();
    }
}
