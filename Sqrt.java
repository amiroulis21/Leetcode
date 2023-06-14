class Solution {
    public int mySqrt(int x) {
        int i = 0;
        while(i * i <= x && i * i >= i) {
            i++;
        }
        return i - 1;
    }
}