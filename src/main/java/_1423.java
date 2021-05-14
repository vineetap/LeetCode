package main.java;

public class _1423 {
        public int maxScore(int[] cardPoints, int k) {
            int totalScore=0;
            for(int point:cardPoints)
                totalScore+=point;

            if (k == cardPoints.length) {
                return totalScore;
            }
            int start=0;
            int minSubArrayLen=cardPoints.length-k;
            int minSubArraySum=totalScore;
            int currentWindowLen=0;
            int currentWindowSum=0;

            for(int i=0;i<cardPoints.length;i++){
                currentWindowSum+=cardPoints[i];
                currentWindowLen=i-start+1;

                if(minSubArrayLen==currentWindowLen){
                    minSubArraySum=Math.min(minSubArraySum,currentWindowSum);
                    currentWindowSum-=cardPoints[start++];
                    currentWindowLen--;
                }
            }

            return totalScore-minSubArraySum;
        }
    }
