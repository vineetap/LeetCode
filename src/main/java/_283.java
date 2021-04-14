package main.java;

public class _283 {
    public void moveZeroes(int[] nums) {
        int l=nums.length;
        int nonZeroPtr=0;
        int indexWritten=0;

        for(;nonZeroPtr<l;nonZeroPtr++){

            if(nums[nonZeroPtr]==0)
                continue;

            nums[indexWritten]=nums[nonZeroPtr];
            indexWritten++;
        }

        while(indexWritten<l){
            nums[indexWritten]=0;
            indexWritten++;
        }
    }
}
