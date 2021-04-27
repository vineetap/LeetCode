package main.java;

public class _141 {
    public boolean hasCycle(ListNode head) {
        if(head== null)return false;
        ListNode hare=head;
        ListNode tor=head;
        while(hare != null && hare.next!= null){
            hare=hare.next.next;
            tor=tor.next;
            if(hare == tor){
                return true;
            }

        }
        return false;
    }
}
