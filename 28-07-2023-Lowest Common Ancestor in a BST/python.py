#User function Template for python3


#Function to find the lowest common ancestor in a BST. 
def LCA(root, n1, n2):
    #code here.
    if root is None:
        return None
    
    if(n1<root.data and n2<root.data):
        return LCA(root.left,n1,n2)
    elif (n1>root.data and n2>root.data):
        return LCA(root.right,n1,n2)
    else:
        return root