class Solution:
    def numOfUnplacedFruits(self, fruits: List[int], baskets: List[int]) -> int:
        used = set()
        unplaced = 0
        for fruit in fruits:
            placed = False
            for i in range(len(baskets)):
                if i not in used and baskets[i] >= fruit:
                    used.add(i)
                    placed = True
                    break
            if not placed:
                unplaced += 1
        return unplaced
