class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        def generate_next_row(prevrow,k):
            next_rows = [1]
            for i in range(1,k):
                next_rows.append(prevrow[i-1]+prevrow[i])
            next_rows.append(1)
            return next_rows
        pascal = []
        prevrow = [1]
        pascal.append(prevrow)
        for i in range(1,numRows):
            next_rows = generate_next_row(prevrow,i)
            pascal.append(next_rows)
            prevrow = next_rows
        return pascal
    
    

