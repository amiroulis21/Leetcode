class Solution(object):
    #Given n coins, returns how many complete staircases
    #can be made with n coins
    def arrangeCoins(self, n):
        i = 0
        while i <= n:
		    n -= i
		    i += 1

        return i - 1
        """
        :type n: int
        :rtype: int
        """