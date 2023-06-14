class Solution(object):
    def containsNearbyDuplicate(self, nums, k):
        index_map = {}  # Dictionary to store number-index mapping

        for i, num in enumerate(nums):
            if num in index_map and i - index_map[num] <= k:
                return True  # Duplicate value found with index difference less than or equal to k

            index_map[num] = i  # Update the index of the number

        return False  # No duplicates found with index difference less than or equal to k

        """
        :type nums: List[int]
        :type k: int
        :rtype: bool
        """