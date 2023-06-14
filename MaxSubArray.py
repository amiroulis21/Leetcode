class Solution(object):
    def maxSubArray(self, nums):
        max_sum = float('-inf')  # Initialize the maximum sum to negative infinity
        temp_sum = 0  # Initialize the current sum to 0

        for num in nums:
            temp_sum = max(num, temp_sum + num)  # Update the temporary sum
            max_sum = max(max_sum, temp_sum)  # Update the maximum sum
        return max_sum
        """
        :type nums: List[int]
        :rtype: int
        """