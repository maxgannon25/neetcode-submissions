class Solution:
    def dailyTemperatures(self, temps: List[int]) -> List[int]:
        res = [0] * len(temps)

        stack = []

        for i, t in enumerate(temps):
            while stack and t > stack[-1][0]:
                stackT, stackI = stack.pop()
                days = i - stackI
                res[stackI] = days
            stack.append([t, i])
        return res



        
        
        
                



        