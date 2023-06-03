class Solution {
    public int[] twoSum(int[] nums, int target) {
    //Returns indices of two numbers such that they add up to target
    //It is assumed there is always a solution

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] sol = new int[2];
        for(int i = 0; i < nums.length; i++) {
            int ans = target - nums[i];
            if(map.containsKey(ans)) {
            sol[0] = map.get(ans);
            sol[1] = i;
            }
            map.put(nums[i], i);
        }
        return sol;
        
    }
}