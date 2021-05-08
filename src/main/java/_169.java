package main.java;

public class _169 {
    //Since given in question that Majority element always exist
    // otherwise we would need one more pass to confirm majority element.

    public int majorityElement(int[] nums) {
        int majorityCandidate=0;
        int count=0;

        for(int num:nums){

            if(count==0)
                majorityCandidate=num;

            count+=(num==majorityCandidate)?1:-1;
        }

        return majorityCandidate;
    }

}
