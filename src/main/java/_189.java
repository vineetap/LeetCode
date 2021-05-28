package main.java;

public class _189 {
    //Reverse
    public void rotate1(int[] nums, int k) {

        if(nums.length==1)
            return;

        int last=nums.length-1;
        k=k%nums.length; // to handle case when k is greater than nums.length

        reverse(nums,0,last);
        reverse(nums,0,k-1);
        reverse(nums,k,last);

    }

    private void reverse(int[] nums,int start,int end){
        int temp;

        while(start<end){
            temp=nums[end];
            nums[end]=nums[start];
            nums[start]=temp;

            start++;
            end--;
        }

    }

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
