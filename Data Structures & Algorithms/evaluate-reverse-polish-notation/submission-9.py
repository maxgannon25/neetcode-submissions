class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        
        st = []
        for token in tokens:
            if token == '+':
                s = st.pop()
                f = st.pop()
                st.append(int(f) + int(s))

            elif token == '-':
                s = st.pop()
                f = st.pop()
                st.append(int(f) - int(s))

            elif token == '*':
                s = st.pop()
                f = st.pop()
                st.append(int(f) * int(s))
            
            elif token == '/':
                s = st.pop()
                f = st.pop()
                print(s, f)
                st.append(int(f) / int(s))
            
            else:
                st.append(int(token))
        
        return int(st.pop())
            

                
        