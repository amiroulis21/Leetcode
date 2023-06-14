class Solution(object):
    def countSegments(self, s):
        count = 0
        segment_started = False

        for char in s:
        # Check if the character is a non-space character and segment hasn't started
            if char != ' ' and not segment_started:
                segment_started = True
                count += 1
        # Check if the character is a space and segment has started
            elif char == ' ' and segment_started:
                segment_started = False

        return count


        """
        :type s: str
        :rtype: int
        """