package main.java;

public class _27 {
    public int removeElement(int[] nums, int val) {
        int l=nums.length-1;
        int left=0;
        int right=l;

        for(left=0;left<=right;){

            if(nums[right]==val)
            {
                right--;
                continue;
            }

            if(nums[left]!=val)
            {
                left++;
                continue;
            }

            if(nums[left]==val){
                nums[left]=nums[right];
                left++;
                right--;
            }
        }

        return left;
    }
}
