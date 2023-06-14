class Solution(object):
    def isPalindrome(self, s):
        alphanum = ''
        for c in s:
            if c.isalnum():
                alphanum += c.lower()
        
        # This statement would be a shortcut: return alphanum == alphanum[::-1]
        # Here is the more algorithmic solution
        l, r = 0, len(alphanum) - 1
        while l < r:
			if alphanum[l] == alphanum[r]:
				l += 1
				r -= 1
			else:
				return False
        return True
        """
        :type s: str
        :rtype: bool
        """