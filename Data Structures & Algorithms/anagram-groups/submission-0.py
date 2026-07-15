class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        counts = {}

        for x in range(len(strs)):
            sc = ''.join(sorted(strs[x]))
            if sc in counts:
                counts[sc].append(strs[x])
            else:
                counts[sc] = [strs[x]]

        return list(counts.values())


            
            




