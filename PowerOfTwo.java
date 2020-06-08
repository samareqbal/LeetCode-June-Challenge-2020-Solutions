package LeetCodeJune;
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        return ((n & n - 1) == 0 && n > 0);
    }
}
