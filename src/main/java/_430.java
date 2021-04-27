package main.java;


class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};


public class _430 {

        public Node flatten(Node head) {
            if(head == null) return head;
            Node current=head;
            Node tailNext=null;
            Node tempCurrent=null;
            while(current!=null){

                if(current.child!=null){
                    tailNext=current.next;
                    tempCurrent=current.child;
                    current.next=tempCurrent;
                    current.child=null;
                    tempCurrent.prev=current;

                    while(tempCurrent.next!=null){
                        tempCurrent=tempCurrent.next;
                    }
                    if(tailNext!=null){


                        tempCurrent.next=tailNext;
                        tailNext.prev=tempCurrent;
                    }
                }
                current=current.next;
            }

            return head;
        }


    }

