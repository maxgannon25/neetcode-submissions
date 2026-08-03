class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        
        res = 0
        l = 0
        counts = {}
        for r in range(len(s)):
            counts[s[r]] = counts.get(s[r], 0) + 1

            winLen = (r-l) + 1
            while winLen - max(counts.values()) > k:
                counts[s[l]] -= 1
                l += 1
                winLen = (r-l) + 1
            
            res = max(res, winLen)
        return res

        

        