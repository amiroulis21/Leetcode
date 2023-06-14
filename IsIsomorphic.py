class Solution(object):
    def isIsomorphic(self, s, t):
        if len(s) != len(t):
            return False

        map = {}
        used = set()

        for i in range(len(s)):
            schar = s[i]
            tchar = t[i]

            if schar in map:
                if map[schar] != tchar:
                    return False
            else:
                if tchar in used:
                    return False
                map[schar] = tchar
                used.add(tchar)

        return True
