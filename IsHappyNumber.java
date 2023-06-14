class Solution {
    public boolean isHappy(int n) {
	/*A happy number is a number defined by the following process:

	Starting with any positive integer, replace the number by the sum of the squares of its digits.
	Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
	Those numbers for which this process ends in 1 are happy.
	*/
        int temp = n;
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(n);
        int next = 0;
        while(temp != 1) {
            while(temp / 10 != 0 || temp % 10 != 0) {
                next += (int)Math.pow(temp % 10, 2);
                temp /= 10;
            }
            if(set.contains(next)) {
                return false;
            }
            set.add(next);
            temp = next;
            next = 0;
        }
        return true;
    }
}