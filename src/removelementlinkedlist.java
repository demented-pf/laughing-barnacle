import javax.management.ListenerNotFoundException;
import java.util.LinkedList;

class removelementlinkedlist {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        @Override
        public String toString() {
            return String.valueOf(val);
        }
    }

    public static void main(String[] args) {

        ListNode l = new ListNode(10);
        l.next = new ListNode(20);


        System.out.println(l);
        System.out.println(l.next);
    }
}