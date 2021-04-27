package main.java;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer=new int[nums.length];
        int rightProduct=1;
        int leftProduct=1;
        answer[0]=1;

        //Create left Product array in answer first
        for(int i=1;i<answer.length;i++){
            answer[i]=answer[i-1]*nums[i-1];
        }

        for(int i=nums.length-1;i>=0;i--){
            answer[i]=answer[i]*rightProduct;
            rightProduct*=nums[i];
        }

        return answer;
    }
}
