package main.java;

public class _278 {
    public int firstBadVersion(int n) {
        int left=1;
        int right=n;
        int mid=-1;
        int result=-1;
        while(left<=right){
            mid=left+(right-left)/2;

            if(isBadVersion(mid))
            {
                result=mid;
                right=mid-1;
            }
            else
                left=mid+1;

        }

        return result;
    }

    private boolean isBadVersion(int mid) {
        return true;
    }
}
