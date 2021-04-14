package main.java;

public class _189 {
    //Input: nums = [1,2,3,4,5,6,7], k = 3
    //Output: [5,6,7,1,2,3,4]

    public void rotate(int[] nums, int k) {

        if(nums.length==1)
            return;

        int temp;
        int last=nums.length-1;

        for(int i=1;i<=k;i++){

            temp=nums[last];

            for(int j=last;j>=1;j--){
                nums[j]=nums[j-1];
            }

            nums[0]=temp;
        }

    }
}
