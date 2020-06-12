package LeetCodeJune;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class InsertDeleteGetRandom {
    /** Initialize your data structure here. */
    HashSet<Integer> set;
    Random rand;
    public void RandomizedSet() {
        set = new HashSet<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(!set.contains(val))
        {
            set.add(val);
            return true;
            }
        return false;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
         if(set.contains(val))
        {
            set.remove(val);
            return true;
        }
        return false;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        rand = new Random();
        int random_number = rand.nextInt(set.size()); 
        int current = 0;
        Iterator<Integer> itr = set.iterator();
        int random_ele;
        
        while(itr.hasNext())
        {
            random_ele = itr.next();
            if(current == random_number)
                return random_ele;
            current ++;
        }
        return -999;
    }
}
