class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        
        nums = sorted(set(nums))
        lgst = 0
        cont = 0

        passed = []

        if not nums:
            return cont

        print(nums)
        for x in range(1, len(nums)):
            print(cont, "cont")
            if nums[x] == nums[x-1] + 1:
                cont += 1
            else:
                passed.append(cont)
                cont = 0
        passed.append(cont)
        
        return max(passed) + 1

        