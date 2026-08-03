class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:

        rows, cols = len(matrix), len(matrix[0])

        zeroRows = set()
        zeroCols = set()

        # First pass: remember which rows and columns contain a 0
        for r in range(rows):
            for c in range(cols):
                if matrix[r][c] == 0:
                    zeroRows.add(r)
                    zeroCols.add(c)

        # Second pass: zero those rows and columns
        for r in range(rows):
            for c in range(cols):
                if r in zeroRows or c in zeroCols:
                    matrix[r][c] = 0
            
            