class Solution {
    public int[] plusOne(int[] num) {
        for(int i = num.length - 1; i >= 0; i--) {
            if(num[i] < 9) {
                num[i]++;
                return num;
            }
            num[i] = 0;
        }
        num = new int[num.length + 1];
        num[0] = 1;
        return num;
    }
}
    