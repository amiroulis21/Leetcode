class Solution {
//Given n steps, this program returns the number
//of combinations of 1 or 2 steps to climb n steps.
//The pattern happened to be the fibonacci sequence.
    public int climbStairs(int n) {
        int x = 0;
        int y = 1;
        int total = 0;
        for(int i = 1; i <= n; i++) {
            total = x + y;
            x = y;
            y = total;
        }
        return total;
    }
}