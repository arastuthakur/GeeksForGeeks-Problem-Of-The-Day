#User function Template for python3
from itertools import permutations
class Solution:
    def permutation(self,s):
        ss = permutations([i for i in s])
        x =["".join(sss) for sss in ss]
        x.sort()
        return x
