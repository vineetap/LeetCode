package main.java;

import java.util.ArrayList;
import java.util.List;

public class _442 {
        public List<Integer> findDuplicates(int[] nums) {
            List<Integer> result=new ArrayList<Integer>();

            for(int n:nums){

                if(nums[Math.abs(n)-1]<0) // if negative found i.e. we have already seen this                   before
                {
                    result.add(Math.abs(n));
                }
                else // Make that nums index as negative
                {
                    nums[Math.abs(n)-1]=-1*nums[Math.abs(n)-1];
                }
            }

            return result;
        }
    }
