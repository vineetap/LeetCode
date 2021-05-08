package main.java;

public class _1143 {
        public int longestCommonSubsequence(String text1, String text2) {
            if(text2.length()<text1.length()){
                String temp=text1;
                text1=text2;
                text2=temp;
            }

            int len1=text1.length(); //smaller string
            int len2=text2.length(); //larger string
            int[] previous=new int[len1+1];
            int[] current=new int[len1+1];

            for(int col=0;col<=len2;col++){
                for(int row=0;row <=len1;row++){

                    if (row==0||col==0) {
                        current[row]=0;
                    }
                    else{
                        current[row]= text1.charAt(row-1) == text2.charAt(col-1)? 1+previous[row-1]: Math.max(previous[row],current[row-1]);
                    }

                }

                int[] temp = previous;
                previous = current;
                current = temp;
            }

            return previous[len1];
        }
    }