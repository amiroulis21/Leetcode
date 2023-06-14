class Solution(object):

    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
                """
        count = 0
        curr = None

        for num in nums:
            if count == 0:
                curr = num
                count = 1
            elif curr == num:
                count += 1
            else:
                count -= 1

        return curr
