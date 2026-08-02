class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        seen = {}
        for i, val in enumerate(nums):
            if val not in seen:
                seen[val] = i
            need = target - val
            if need in seen and i != seen[need]:
                return [seen[need], i]
        


        