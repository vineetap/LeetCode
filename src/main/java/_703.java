package main.java;

import java.util.PriorityQueue;

public class _703 {
    int[] nums;
    int k;
    PriorityQueue<Integer> pq;

    public void KthLargest(int k, int[] nums) {
        this.nums=nums;
        this.k=k;
        pq=new PriorityQueue<Integer>((n1,n2)->(Integer.compare(n1,n2)));   // Min heap of k size

        for(int i=0;i<nums.length;i++){
            heapify(nums[i]);
        }

    }

    public int add(int val) {
        return heapify(val);
    }

    public int heapify(int val){
        pq.offer(val);

        if(pq.size()>k)
            pq.poll();

        return pq.peek();
    }
}
