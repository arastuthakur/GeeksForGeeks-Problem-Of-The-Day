#User function Template for python3
import math
class Solution:
    def largestPrimeFactor (self, N):
        maxPrime = -1
        while N % 2 == 0:
             maxPrime = 2
             N >>= 1 
       
        for i in range(3, int(math.sqrt(N)) + 1, 2):
             while N % i == 0:
                 maxPrime = i
                 N = N / i
            
        if N > 2:
            maxPrime = N
        
        return int(maxPrime)
