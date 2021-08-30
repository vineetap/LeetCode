package main.java;

public class _74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0;
        int right=m*n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int midRow=mid/n;
            int midCol=mid%n;
            int midVal=matrix[midRow][midCol];
            // System.out.println("printing "+mid+" ["+midRow+","+midCol+"] ="+midVal);

            if(target<midVal)
                right=mid-1;
            else if(target>midVal)
                left=mid+1;
            else
                return true; //target found

        }

        return false;
    }
}
