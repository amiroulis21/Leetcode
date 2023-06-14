class Solution {
    public int removeDuplicates(int[] nums) {
        int[] ar = new int[nums.length];
        ar[0] = nums[0];
        int k = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != ar[k]) {
                ar[k + 1] = nums[i];
                k++;
            }
        }
        for(int i = 0; i <= k; i++) {
            nums[i] = ar[i];
        }
        return k + 1;
    }
}