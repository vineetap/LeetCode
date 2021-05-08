package main.java;

public class _849 {
        public int maxDistToClosest(int[] seats) {
            int prev=-1;
            int maxDistnace=0;
            int n=seats.length;

            for(int i=0;i<n;i++){

                if(seats[i]==1)
                {
                    if(prev==-1)
                        maxDistnace=i;
                    else
                        maxDistnace=Math.max(maxDistnace,(i-prev)/2);

                    prev=i;
                }
            }

            if(seats[n-1]==0) // if last seat of empty
                maxDistnace=Math.max(maxDistnace,n-1-prev);

            return maxDistnace;
        }
    }