package LeetCodeJune;
public class PerfectSquares {
    public int numSquares(int n) {
     int[]memo = new int[n+1];  
      return helper(n,memo);  
    }
    
    private int helper(int n,int[]memo){
        if(n == 0) return 0;
        if(memo[n] > 0)return memo[n];
        int min = n;
        for(int i = 1 ;i*i <= n ;i++){
           min = Math.min(min,helper(n - (i*i),memo));
        }
        memo[n] = min+1;
      return min+1;  
    }
}
