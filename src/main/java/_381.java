package main.java;

import java.util.*;

class RandomizedCollection {
    Map<Integer, Set<Integer>> map;
    ArrayList<Integer> list;
    Random random ;

    /** Initialize your data structure here. */
    public RandomizedCollection() {
        map=new HashMap<Integer,Set<Integer>>();
        list=new ArrayList<Integer>();
        random = new Random();
    }

    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        if(!map.containsKey(val))
            map.put(val,new LinkedHashSet());
        map.get(val).add(list.size());
        list.add(val);
        return map.get(val).size()==1;
    }

    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val)|| map.get(val).size()==0) // since for remove we are not removing element from map only removing index from value linkedHashSet
            return false;

        int index=map.get(val).iterator().next();
        map.get(val).remove(index);

        int lastElementOfList=list.get(list.size()-1);

        list.set(index,lastElementOfList);
        map.get(lastElementOfList).add(index);

        map.get(lastElementOfList).remove(list.size()-1);
        list.remove(list.size()-1);

        return true;
    }

    /** Get a random element from the collection. */
    public int getRandom() {
        return list.get(random.nextInt(list.size()));  // linearly related is taken care as number of elements in list are duplicate
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */