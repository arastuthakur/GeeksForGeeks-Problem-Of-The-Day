vector<int> findSpiral(Node *root)
{
    //Your code here
    queue<Node*> q;
    q.push(root);
    vector<int> ans;
    int i=0;
    while(!q.empty()){
        vector<Node *> temp;
        int c=q.size();
        while(c>0){
            Node * k=q.front();
            temp.push_back(k);
            if(k->left!=NULL)q.push(k->left);
            if(k->right!=NULL)q.push(k->right);
            q.pop();
            c--;
        }
        if(i%2==0){
            reverse(temp.begin(),temp.end());
        }
        for(int j=0;j<temp.size();j++){
            ans.push_back(temp[j]->data);
        }
        i++;
    }
    return ans;
}