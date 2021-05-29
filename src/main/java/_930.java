package main.java;

import java.util.HashMap;
import java.util.Map;

public class _930 {
        public int numSubarraysWithSum(int[] nums, int goal) {
            Map<Integer,Integer> freqOfSum=new HashMap<Integer,Integer>();

            freqOfSum.put(0,1);
            /* The reason behind having initialize freqOfSum.put(0,1)....it is for those (sum - k) == 0 calculations which are valid subarrays but need to get counted. e.g. if k = 7 and sum = 7 (at second element for array is : 3, 4, 3, 8) at some iteration.....then sum - k = 0....this 0 will get counted in statement result += preSum.get(sum - k);*/

            int count=0;
            int sum=0;
            for(int n:nums){
                sum+=n;

                if(freqOfSum.containsKey(sum-goal))
                    count+=freqOfSum.get(sum-goal);
                freqOfSum.put(sum,freqOfSum.getOrDefault(sum,0)+1);
            }

            return count;

        }
    }
