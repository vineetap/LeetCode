package main.java;

import java.util.ArrayList;
import java.util.List;

public class _1906 {
        public int[] minDifference(int[] nums, int[][] queries) {
            int n=nums.length;
            int[] result=new int[queries.length];
            int[][] dp=new int[n+1][100];

            //Create dp array like prefix count
            for(int i=0;i<n;i++){
                for(int j=0;j<100;j++){
                    dp[i+1][j]=dp[i][j];
                }
                ++dp[i+1][nums[i]-1];
            }

            //Iterate for given query ranges
            for(int i=0;i<queries.length;i++){
                int start=queries[i][0];
                int end=queries[i][1]+1;

                List<Integer> present=new ArrayList<Integer>();

                for(int j=0;j<100;j++){
                    if(dp[end][j]-dp[start][j]!=0)
                        present.add(j);
                }

                int min=Integer.MAX_VALUE;

                for(int j = 1; j < present.size(); ++j)
                    min = Math.min(min, present.get(j) - present.get(j - 1));

                if(present.size() == 1)
                    min = -1;

                result[i]=min;
            }

            return result;
        }

    }
