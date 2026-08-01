class Solution:
        def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
            counts = {}

            for item in strs:
                ss = sorted(list(item))
                ss = ''.join(ss)

                if ss not in counts.keys():
                    counts[ss] = []
            
                counts[ss].append(item)
            
            return list(counts.values())
            
            




