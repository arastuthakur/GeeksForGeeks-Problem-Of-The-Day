#User function Template for python3
#User function Template for python3

def process(head, node, node2root):
    if head is None:
        return False
    if head.data == node:
        return True
        
    Im_Father = process(head.left, node, node2root)
    if Im_Father:
        node2root.append(head)
        return True
        
    Im_Father = process(head.right, node, node2root)
    if Im_Father:
        node2root.append(head)
        return True
    return False


def kthAncestor(root, k, node):
    node2root = []
    process(root, node, node2root)
    if len(node2root) < k:
        return -1
    return node2root[k-1].data
    
    
    
    
