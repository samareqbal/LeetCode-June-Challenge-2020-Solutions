package LeetCodeJune;

import java.util.*;

public class LargestDivisibleSubset {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if(nums.length==0)
            return list;
        Arrays.sort(nums);
		HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        // Initialize hashsets
        for(int i=0; i<nums.length;i++){
            HashSet<Integer> s = new HashSet<>();
            s.add(nums[i]); // each set will contain the element that is represents
            map.put(i, s);
        }
        int maxSize = 0, maxIdx = 0;
        //Loop through the lements and determine the relationship
        for(int i=1;i<nums.length;i++){
            HashSet<Integer> temp = new HashSet<>();
            for(int j=0; j<i;j++) { // we will check upto i-1
                if(nums[i]%nums[j]==0){
				//only increment add if this iteration increases the size for temp
                    if(map.get(j).size()+1>temp.size()){
                        temp = new HashSet<>(map.get(j));
                        temp.add(nums[i]);
                    }
                }
            }
            if(map.get(i).size()<temp.size()) map.put(i, temp);
            if(map.get(i).size()>maxSize){ maxSize = map.get(i).size(); maxIdx=i; }
        }
        return new ArrayList<Integer>(map.get(maxIdx));
    }
}
