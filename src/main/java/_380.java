package main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class RandomizedSet {
    Map<Integer,Integer> map;
    ArrayList<Integer> list;
    Random random ;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        map=new HashMap<Integer,Integer>();
        list=new ArrayList<Integer>();
        random = new Random();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {

        if(!map.containsKey(val))
        {
            map.put(val,list.size());
            list.add(val);

            return true;
        }
        return false;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {

        if(map.containsKey(val))
        {
            int index=map.get(val);
            int lastElementOfList=list.get(list.size()-1);
            // Put last element of list at position of val and remove last element to avoid linear time delete in list if val is not last element
            if(index<list.size()-1){
                list.set(index,lastElementOfList);
                map.put(lastElementOfList,index);
            }
            list.remove(list.size()-1);
            map.remove(val);
            return true;

        }
        return false;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}
