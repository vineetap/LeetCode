package main.java;

public class _1011 {
    public int shipWithinDays(int[] weights, int days) {
        int left=0; //max of weights given
        int right=0; //total sum of weights given
        int mid=-1;
        int result=-1;
        for(int w:weights){
            left=Math.max(w,left);
            right+=w;
        }
        //apply binary search
        while(left<=right){
            mid=left+(right-left)/2;

            if(isValid(weights,days,mid)){
                result=mid;
                right=mid-1;
            }
            else
                left=mid+1;
        }
        return result;
    }

    //count days for input ship capacity
    private boolean isValid(int[] weights, int days,int capacity){
        int daysCount=1;
        int tempSum=0;

        for(int w:weights){
            tempSum+=w;
            if(tempSum>capacity){
                tempSum=w;
                daysCount++;
            }

            if(daysCount>days)
                return false;
        }

        return true;
    }
}
