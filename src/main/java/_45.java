package main.java;

public class _45 {
        public int jump(int[] nums) {

            if(nums.length==0||nums[0]==0)
                return 0;

            int currentEnd=0;
            int farthest=0;
            int jumps=0;

            for(int i=0;i<nums.length-1;i++){ //till second last position as we dont                                                                       want to jump from last position

                farthest=Math.max(farthest,i+nums[i]); //search how far we can reach                                                                                 from current position

                if(i==currentEnd){
                    jumps++;
                    currentEnd=farthest;
                }
            }

            return jumps;
        }
    }

