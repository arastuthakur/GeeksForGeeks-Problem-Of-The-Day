class Solution
{
    public Node inorderSuccessor(Node root,Node x)
    {
        if (x.right != null) {
            // If the right subtree is not null, find the leftmost node in the right subtree
            x = x.right;
            while (x.left != null) {
                x = x.left;
            }
            return x;
        }

        // If the right subtree is null, find the ancestor where x is in the left subtree
        Node successor = null;
        while (root != null) {
            if (x.data < root.data) {
                successor = root;
                root = root.left;
            } else if (x.data > root.data) {
                root = root.right;
            } else {
                break; // x is found in the tree, break the loop
            }
        }

        return successor;
    }
}