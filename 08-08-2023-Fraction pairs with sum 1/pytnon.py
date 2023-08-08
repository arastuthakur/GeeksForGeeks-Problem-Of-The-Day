#User function Template for python3

from collections import Counter

class Solution:
    def countFractions(self, n, numerator, denominator):
        def gcf(a,b):
            if a>b:
                a,b=b,a
            if a==0:
                return b
            return gcf(b%a,a)
        fract=[]
        for i,j in zip(numerator,denominator):
            f=gcf(i,j)
            i//=f
            j//=f
            fract.append((i,j,))
        cnt=Counter(fract)
        ans=0
        seen=set()
        for num,den in cnt:
            if (den-num,den,) in cnt and (den-num,den,) not in seen:
                if num!=den-num:
                    ans+=cnt[(num,den,)]*cnt[(den-num,den,)]
                else:
                    ans+=cnt[(num,den,)]*(cnt[(num,den,)]-1)//2
                seen.add((num,den,))
        return ans