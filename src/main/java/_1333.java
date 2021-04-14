package main.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class _1333 {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {

        return Arrays.stream(restaurants)
                .filter(r->r[2] >= veganFriendly && r[3]<=maxPrice && r[4]<=maxDistance)
                .sorted((r1,r2)->{
                    if(r1[1]==r2[1])
                        return Integer.compare(r2[0],r1[0]);
                    else
                        return Integer.compare(r2[1],r1[1]) ;
                })
                .map(r->r[0])
                .collect(Collectors.toList());
    }

}