package LeetCodeJune;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberII {
   public int singleNumber(int[] nums) {
        if(nums.length<1){
            return 0;
        }
        int n = 0;
        HashMap<Integer,Integer> map = new HashMap();
        for(int i : nums) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        
       //System.out.println(map);
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                n = entry.getKey();
            }
        }
        return n;
    } 
}
