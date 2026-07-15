class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        counts = {}
        for x in range(len(s)):
            counts[s[x]] = counts.get(s[x], 0) + 1
        
        for x in range (len(t)):
            if t[x] not in counts:
                return False
            counts[t[x]] = counts.get(t[x], 0) - 1
            if counts[t[x]] < 0:
                return False
        
        for key in counts:
            if counts[key] != 0:
                return False

        return True