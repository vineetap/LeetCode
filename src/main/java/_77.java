package main.java;

import java.util.ArrayList;
import java.util.List;

public class _77 {
        public static void main(String args[]){
            new _77().combine(4,2);
        }
        public List<List<Integer>> combine(int n, int k) {
            List<List<Integer>> result=new ArrayList<List<Integer>>();
            List<Integer>  nums=new ArrayList<Integer>();
            for(int i=1;i<=n;i++)
                nums.add(i);

            backtrack(nums,k,result,new ArrayList<Integer>(),0);
            return result;
        }

        private  void backtrack(List<Integer> nums,int k,List<List<Integer>> result,List<Integer> tempList,int init){
            if(tempList.size()==k){
                System.out.println("Size k reached");
                result.add(new ArrayList(tempList));
            }
            else{

                for(int i=init;i<nums.size();i++){
                    tempList.add(nums.get(i));
                    backtrack(nums,k,result,tempList,i+1);
                    tempList.remove(nums.get(i));
                }
            }
        }
}
