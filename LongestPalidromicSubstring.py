class Solution(object):
    def findPalin(self, s, left, right):
        while left >= 0 and right < len(s) and s[left] == s[right]:
            left -= 1
            right += 1
        return right - left - 1
    
    def longestPalindrome(self, s):
        if len(s) < 2:
            return s

        start, end = 0, 0

        for i in range(len(s)):
            odd = self.findPalin(s, i, i)
            even = self.findPalin(s, i, i + 1)
            length = max(odd, even)

            if length > end - start:
                start = i - (length - 1) // 2
                end = i + length // 2

        return s[start:end + 1]
