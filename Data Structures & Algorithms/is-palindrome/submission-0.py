class Solution:
    def isPalindrome(self, s: str) -> bool:
        
        newS = ''
        for x in range(len(s)):
            if s[x].isalnum():
                newS += s[x]

        rev = newS[::-1].lower().replace(' ', '')

        if rev == newS.lower().replace(' ', ''):
            return True
        return False
            
        