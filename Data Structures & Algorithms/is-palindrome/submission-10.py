class Solution:
    def isPalindrome(self, s: str) -> bool:
        front = 0
        back = len(s) - 1
        pal = True

        while pal and front < back:
            while (not s[front].isalnum()) and front < back:
                front += 1
            while (not s[back].isalnum()) and front < back:
                back -= 1
            pal = s[front].lower() == s[back].lower()
            front += 1
            back -= 1
        return pal