class Solution {
    public int reverse(int x) {
        int sum = 0;
        int temp = x;
        int len = 0;
        while(Math.abs(temp / 10) > 0 || Math.abs(temp % 10) > 0) {
            len++;
            if(Math.abs(sum) > (Math.pow(2, 31) - 1) / 10) {
                sum = 0;
                break;
            }
            sum = sum * 10;
            sum += temp % 10;
            temp = temp / 10; 
        }

        return sum;
        
    }
}