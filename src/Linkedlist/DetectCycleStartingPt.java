package Linkedlist;

public class DetectCycleStartingPt {
    public static void main(String[] args) {
        LinkedList list = LinkedList.createList();

        System.out.println("Linked List:");
        list.head.display();

        detectcycle(list.head);
    }

    private static void detectcycle(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            //detect cycle
//            if(slow == fast){
//                break;
//            }

            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                System.out.println(slow.data);
            }
        }
    }
}
