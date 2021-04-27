package main.java;

public class _96 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode prev=head;
        ListNode current=head;
        ListNode tempCurrent=null;
        int currentPosition=1;
        ListNode start; //start point where reverse begins
        ListNode tail;  // end point where reverse stops

        while(currentPosition<left){
            prev=current;
            current=current.next;
            currentPosition++;
        }

        start=prev;tail=current;
        System.out.println("prev :"+ prev.val);
        prev=null;
        while(currentPosition>=left && currentPosition<=right){

            tempCurrent=current.next;
            current.next=prev;
            prev=current;
            current=tempCurrent;
            currentPosition++;
        }

        //rearranging all the parts

        start.next=prev;
        tail.next = tempCurrent;

        if(left>1)
            return head;
        else
            return prev;

    }
}
