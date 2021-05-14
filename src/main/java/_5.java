package main.java;

public class _5 {
        int longestLen;
        int longestStart;
        public String longestPalindrome(String s) {
            //Expand from centre approach

            if(s.length()<2)
                return s;

            for(int i=0;i<s.length()-1;i++){
                expandfromCentre(s,i,i);
                expandfromCentre(s,i,i+1);
            }

            return s.substring(longestStart,longestStart+longestLen);
        }

        private void expandfromCentre(String s, int start,int end){

            while(start>=0 && end<s.length()){

                if(s.charAt(start)==s.charAt(end)){
                    start--;
                    end++;
                }
                else
                    break;

            }


            if((end-start-1)>longestLen)
            {
                longestLen=end-start-1;
                longestStart=start+1;

            }
        }
    }

class Solution11 {
    int longestLength=1;
    int longestStart=0;
    public String longestPalindrome(String s) {
        //DP

        if(s.length()<2)
            return s;

        int n=s.length();
        boolean[][] dp=new boolean[n][n];

        // for single char
        for(int i=0;i<n;i++){
            dp[i][i]=true;
        }

        //for 2 char strings
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1))
            {   dp[i][i+1]=true;
                longestStart=i;
                longestLength=2;
            }
        }

        //for 3 or more char strings
        for(int k=3;k<=n;k++){ // k is length os substring
            for(int i=0;i<n-k+1;i++){
                // Get the ending index of substring from
                // starting index i and length k
                int j = i + k - 1;
                if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1])
                { dp[i][j]=true;

                    if(k>longestLength)
                    { longestStart=i;
                        longestLength=k;
                    }
                }
            }
        }

        return s.substring(longestStart,longestStart+longestLength);
    }


}
