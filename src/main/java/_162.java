package main.java;
/*
there are 2 possibilities.a) rising slope has to keep rising till end of the array b) rising slope will encounter a lesser element and go down.
In both scenarios we will have an answer. In a) the answer is the end element because we take the boundary as -INFINITY b) the answer is the largest element before the slope falls.
* */
public class _162 {
        public int findPeakElement(int[] nums) {
            int n=nums.length;
            int start=0;
            int end=nums.length;
            int mid;
            if(n==1)
                return 0;
            while(start<=end){
                mid=start+(end-start)/2;

                if(mid>0 && mid<n-1){

                    if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1])
                        return mid;

                    if(nums[mid+1]>nums[mid])
                        start=mid+1;
                    else
                        end=mid-1;
                }
                else if(mid==0)
                    return nums[0]>nums[1]?0:1;
                else if(mid==(n-1))
                    return nums[n-1]>nums[n-2]?n-1:n-2;
            }

            return -1;
        }

    }

