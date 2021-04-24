package main.java;

public class _53 {
        public int maxSubArray(int[] nums) {
            int currentSubArraySum=0;
            int maxSumSoFar=Integer.MIN_VALUE;

            for(int i=0;i<nums.length;i++){
                // If current +nums[i] is less then ignore
                currentSubArraySum=Math.max(currentSubArraySum+nums[i],nums[i]);
                maxSumSoFar=Math.max(maxSumSoFar,currentSubArraySum);
            }

            return maxSumSoFar;

        }
    }
