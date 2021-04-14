package main.java;

public class _26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        int writeIndex=1;
        int prev=nums[0];

        for(int i=1;i<nums.length;i++){

            if(nums[i]!=prev){
                nums[writeIndex]=nums[i];
                writeIndex++;
                prev=nums[i];
            }
        }

        return writeIndex;
    }
}
