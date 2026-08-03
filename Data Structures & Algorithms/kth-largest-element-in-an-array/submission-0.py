class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        
        heapq.heapify_max(nums)
        print(nums)
        x = k

        while x > 1:
            heapq.heappop_max(nums)
            x -= 1
        
        return heapq.heappop_max(nums)