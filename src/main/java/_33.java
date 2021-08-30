package main.java;

//Approach2 Find minimum/first element in given array then do binar search on both parts

public class _33 {
    class Solution {
        public int search(int[] nums, int target) {

            int start = 0;
            int end = nums.length - 1;
            int mid = -1;

            while (start <= end) {
                mid = (start + end) / 2;
                if (nums[mid] == target)
                    break;
                if (nums[mid] >= nums[start]) { // mid is on non rotated side of an array

                    if (target >= nums[start] && target < nums[mid]) { //target is somewhere in non-rotated side

                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                } else { // nums[mid]< nums[start] -> mid is on rotated side of an array

                    if (target <= nums[end] && target > nums[mid]) { //target is somewhere in non-rotated side

                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }

            return nums[mid] == target ? mid : -1;
        }
    }
}
