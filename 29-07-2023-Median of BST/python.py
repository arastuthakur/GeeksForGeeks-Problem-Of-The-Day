#User function Template for python3
def inorder(root,ans):
    if(root==None):
        return
    inorder(root.left,ans)
    ans.append(root.data)
    inorder(root.right,ans)
def findMedian(root):
    ans=[]
    inorder(root,ans)
    if(len(ans)%2==0):
        s=(ans[(len(ans)//2)-1]+ans[(len(ans)//2)])/2
    else:
        s=ans[len(ans)//2]
    if(int(s)==s):
        return int(s)
    else:
        return s
