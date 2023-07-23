class Solution:
    #Function to sort a linked list of 0s, 1s and 2s.
    def segregate(self, head):
        #code here
        z=0
        o=0
        t=0
        cur = head
        while cur!=None:
            if cur.data==0:
                z+=1
            elif cur.data==1:
                o+=1
            elif cur.data==2:
                t+=2
            cur=cur.next
        cur=head
        while cur!=None:
            if z:
                cur.data=0
                z-=1
            elif o:
                cur.data=1
                o-=1
            elif t:
                cur.data=2
                t-=1
            cur=cur.next
        return head
    
