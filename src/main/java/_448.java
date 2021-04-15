package main.java;

import java.util.ArrayList;
import java.util.List;

public class _448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int indToNegate;
        // Make elements of nums negative
        ArrayList<Integer> al=new ArrayList();

        for(int i=0;i<nums.length;i++){
            indToNegate=Math.abs(nums[i])-1;

            if(nums[indToNegate]>0)
                nums[indToNegate]*=-1;
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
                al.add(i+1);
        }

        return al;
    }

}
