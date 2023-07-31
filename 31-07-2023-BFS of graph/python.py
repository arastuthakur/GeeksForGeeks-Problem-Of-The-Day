#User function Template for python3

from typing import List
from queue import Queue
class Solution:
    #Function to return Breadth First Traversal of given graph.
    def bfsOfGraph(self, V: int, adj: List[List[int]]) -> List[int]:
        # code here
        # q=queue()
        q=Queue();visit=set()
        q.put(0)
        visit.add(0)
        ans=[]
        while q.qsize():
            x=q.get()
            ans.append(x)
            for ele in adj[x]:
                if ele not in visit:
                    q.put(ele)
                    visit.add(ele)
        return ans