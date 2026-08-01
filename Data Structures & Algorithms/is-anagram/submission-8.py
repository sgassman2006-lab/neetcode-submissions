class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        letters = {}
        for let in s:
            if let in letters:
                letters[let] += 1
            else:
                letters[let] = 1
        for let in t:
            if let not in letters:
                return False
            elif letters[let] > 1:
                letters[let] -= 1
            else:
                letters.pop(let)
        return not letters