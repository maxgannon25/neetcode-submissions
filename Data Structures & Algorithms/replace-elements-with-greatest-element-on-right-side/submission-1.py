class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        start = arr[0]
    #[1,2,3,4]
        for x in range(len(arr)-1):
            greatest = max(arr[x+1:])
            arr[x] = greatest
        
        arr[len(arr)-1] = -1

        return arr


        