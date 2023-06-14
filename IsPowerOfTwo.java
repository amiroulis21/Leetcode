class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        // "&" is a bitwise AND operation.
        return (n & (n - 1)) == 0;
    }
    