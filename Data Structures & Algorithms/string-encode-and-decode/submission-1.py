class Solution:

    def encode(self, strs: List[str]) -> str:
        encoded = ''
        for x in range (len(strs)):
            w = strs[x][::-1]
            encoded += w + '±'
        
        return encoded

    def decode(self, s: str) -> List[str]:

        words = s.split('±')
        dwords = []
        for x in range(len(words)-1):
            word = words[x][::-1]
            dwords.append(word)
        
        return dwords
