class Solution(object):
    def summaryRanges(self, nums):
        if len(nums) == 0:
            return []
        ranges = []
        start = end = nums[0]
        i = 1

        for num in nums[1:]:
            if num == end + 1:
                end = num
            elif start == end:
                ranges.insert(i, str(start))
                start = end = num
            else:
                ranges.insert(i, str(start) + "->" + str(end))
                start = end = num
            i = i + 1
        if start == end:
            ranges.insert(i, str(start))
        else:
            ranges.insert(i, str(start) + "->" + str(end))
        return ranges
        """
        :type nums: List[int]
        :rtype: List[str]
        """