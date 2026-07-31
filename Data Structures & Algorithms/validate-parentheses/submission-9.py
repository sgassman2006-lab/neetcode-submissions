class Solution:
    def isValid(self, s: str) -> bool:
        bracket_pairs = {"}":"{", "]":"[", ")":"("}
        b_stack = []
        for let in s:
            if let in bracket_pairs.values():
                b_stack.append(let)
            elif len(b_stack) > 0:
                open_b = b_stack.pop()
                if bracket_pairs[let] != open_b:
                    return False
            else:
                return False
        return not b_stack