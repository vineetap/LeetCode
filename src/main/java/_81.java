package main.java;

public class _81 {
        public boolean search(int[] nums, int target) {
            int start=0;
            int end=nums.length-1;

            while(start<=end){
                int mid=(start+end)/2;
                if(nums[mid]==target)
                    return true;
                if(nums[mid]==nums[start] && nums[mid]==nums[end]) //worst case scenario - {1,1,1,1,1,} target =2
                {
                    start++;
                    end--;
                }
                else if(nums[mid]>=nums[start]){ // mid is on non rotated side of an array

                    if(target>=nums[start]&& target<nums[mid]){ //target is somewhere in non-rotated side

                        end=mid-1;
                    }else{
                        start=mid+1;
                    }
                }
                else{ // nums[mid]< nums[start] -> mid is on rotated side of an array

                    if(target<=nums[end]&& target>nums[mid]){ //target is somewhere in non-rotated side

                        start=mid+1;
                    }else{
                        end=mid-1;
                    }
                }
            }

            return false;
        }
    }
