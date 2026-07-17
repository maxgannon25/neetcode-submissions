class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:

        sn = nums.sort()
        seen = {} #num, freq

        for x in range(len(nums)):
            seen[nums[x]] = seen.get(nums[x], 0) + 1
        
        topn = k

        sorted_by_values_desc = dict(sorted(seen.items(), key=lambda item: item[1], reverse=True))
        
        return list(sorted_by_values_desc.keys())[:k]




        return


           
        