class Solution {
	//This program returns the unique integer in nums
	// It is assumed that each element in the array
	// appears twice except for one.

    public int singleNumber(int[] nums) {
        int single = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                single -= nums[i];
            }
            else {
                set.add(nums[i]);
                single += nums[i];
            }

        }
        return single;
    }
}