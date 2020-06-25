package LeetCodeJune;
public class UniqueBinarySearchTress {
    Integer[] cache;
    public int numTrees(int n) {
        cache=new Integer[n+1];
        cache[0]=1;
        cache[1]=1;
        return dfs(n);
    }
    public int dfs(int n){
        if(cache[n]!=null) return cache[n];
        int ans=0;
        for(int i=1;i<=n;i++){
            ans+=dfs(i-1)*dfs(n-i);
        }
        if(cache[n]==null) cache[n]=ans;
        return cache[n]; 
        
    }
}
