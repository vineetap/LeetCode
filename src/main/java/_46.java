package main.java;

import java.util.ArrayList;
import java.util.List;

public class _46 {
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> result=new ArrayList<List<Integer>>();
            backtrack(nums,result,new ArrayList<Integer>());

            return result;
        }

        private void backtrack(int[] nums, List<List<Integer>> result,List<Integer> tempList){
            if(nums.length==tempList.size())
                result.add(new ArrayList(tempList));
            else
            {
                for(int i=0;i<nums.length;i++){
                    if(tempList.contains(nums[i]))
                        continue;
                    tempList.add(nums[i]);
                    backtrack(nums,result,tempList);
                    tempList.remove(tempList.size()-1);
                }
            }

        }
    }
