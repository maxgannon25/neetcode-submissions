class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:

        heapq.heapify_max(stones)

        while len(stones) > 1:
            one, two = heapq.heappop_max(stones), heapq.heappop_max(stones)
            
            if one > two:
                heapq.heappush_max(stones, one - two)
        
        stones.append(0)
        return stones[0]




        
        