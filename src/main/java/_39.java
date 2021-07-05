package main.java;

import java.util.ArrayList;
import java.util.List;

public class _39 {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> result=new ArrayList<List<Integer>>();

            backtrack(candidates,target,result,new ArrayList<Integer>(),0);
            return result;
        }

        private void backtrack(int[] candidates, int target, List<List<Integer>> result,List<Integer> tempList,int start){
            if(sum(tempList)>target)
                return;
            if(sum(tempList)==target)
                result.add(new ArrayList(tempList));
            else{
                for(int i=start;i<candidates.length;i++){
                    tempList.add(candidates[i]);
                    backtrack(candidates,target,result,tempList,i); // i since we want to reuse
                    tempList.remove(tempList.size()-1);
                }
            }
        }

        private int sum(List<Integer> tempList){
            int result=0;

            for(int n:tempList){
                result+=n;
            }
            return result;
        }
    }
