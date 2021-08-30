package main.java;

class _153 {
    public int findMin(int[] nums) {
        int n=nums.length;
        int start=0;
        int end=nums.length-1;
        int mid=0;
        if (n==1)
            return nums[0];
        while(start<=end){
            mid=start+(end-start)/2;
            int midNext=(mid+1)%n; // Next of mid -> %n to avoid overflow
            int midPrev=(mid-1+n)%n; //previous of mid

            if(nums[mid]<nums[midNext] && nums[mid]<nums[midPrev]) // first element or minimum element in      sorted rotated array is less then its prev AND its next element
                return nums[mid];
            if(nums[end]<nums[mid]) // start<->mid is sorted => go unsorted side
                start=mid+1;
            else  //if(nums[end]>=nums[mid]) // mid<-> is sorted => go unsorted side
                end=mid-1;
        }

        return -1;
    }
}