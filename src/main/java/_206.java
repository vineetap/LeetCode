package main.java;

public class _206 {
    public ListNode reverseList(ListNode head) {

        ListNode prev=null;
        ListNode current=head;
        ListNode tempCurrent;

        while(current!=null){
            tempCurrent=current.next;
            current.next=prev;
            prev=current;
            current=tempCurrent;
        }

        return prev;
    }
}

 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }