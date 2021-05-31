package main.java;

public class _80 {
        public int removeDuplicates(int[] nums) {
            int writeIndex=1;
            int prevCount=1;
            int prev=nums[0];

            for(int i=1;i<nums.length;i++){

                if(prev==nums[i])
                    prevCount++;
                else{
                    prevCount=1;
                }
                prev=nums[i];

                if(prevCount<=2)
                    nums[writeIndex++]=nums[i];
            }

            return writeIndex;
        }
    }
