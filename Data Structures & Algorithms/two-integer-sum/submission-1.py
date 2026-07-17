class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        seen = {}
        for x in range(0, len(nums)):
            if nums[x] not in seen:
                seen[nums[x]] = x
            need = target - nums[x]
            print(need)
            if need in seen and seen[need] != x:
                return [seen.get(need), x]

        