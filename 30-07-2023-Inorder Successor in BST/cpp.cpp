class Solution{
  public:
    // returns the inorder successor of the Node x in BST (rooted at 'root')
    void inordered(Node* root, vector<Node*>& ans){
       if(!root) return;
       
       inordered(root->left,ans);
       ans.push_back(root);
       inordered(root->right,ans);
    }
    
    Node * inOrderSuccessor(Node *root, Node *x){
        vector<Node*>ans;
        inordered(root,ans);
        
        for(int i = 0; i < ans.size() - 1; i++){
            if(ans[i] == x){
               return ans[i + 1];
            }
           
        }
       
        return NULL;
    }
};