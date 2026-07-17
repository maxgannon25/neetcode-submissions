class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        
        numset = set(nums)
        lgst = 0

        for n in nums:
            # check if start of seq
            if (n-1) not in numset:
                length = 0
                while (n+length) in numset:
                    length += 1
                lgst = max(length, lgst)

        return lgst


        
        
        