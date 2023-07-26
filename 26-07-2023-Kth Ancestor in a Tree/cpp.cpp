map<Node *, Node*> mp;
// static Node *fi;
int val;
void generate(Node *root, Node *par, Node* &fi){
    if(!root)return;
    generate(root->left, root, fi);
    mp[root]=par;
    if(root->data==val)fi=root;
    generate(root->right, root, fi);
}
int kthAncestor(Node *root, int k, int node)
{
    // Code here
    val = node;
    // find = nullptr;
    Node *fi;
    generate(root, nullptr, fi);
    
    while(fi and k>0){
        fi = mp[fi];
        // if(fi)cout<<fi->data;
        k--;
        // cout<<fi->data;
    }
    if(fi and k==0)
    return fi->data;
    return -1;
}