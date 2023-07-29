

/*
Structure of the binary Search Tree is as
struct Node {
    int data;
    Node *left;
    Node *right;

    Node(int val) {
        data = val;
        left = right = NULL;
    }
};
*/
// your task is to complete the Function
// Function should return median of the BST
void dfs(struct Node* root,vector<int>&inorder){
    if(!root)return;
    dfs(root->left,inorder);
    inorder.push_back(root->data);
    dfs(root->right,inorder);
}
float findMedian(struct Node *root)
{
      //Code here
      vector<int> inorder;
      dfs(root,inorder);
      int n=inorder.size();
      if(n&1) return inorder[n/2];
      return (inorder[n/2-1] + inorder[n/2])/2.0;
}