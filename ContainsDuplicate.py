class Solution(object):
    def containsDuplicate(self, nums):
        unique = set()

        for num in nums:
            if num in unique:
                return True
            unique.add(num)

        return False

        """
        :type nums: List[int]
        :rtype: bool
        """