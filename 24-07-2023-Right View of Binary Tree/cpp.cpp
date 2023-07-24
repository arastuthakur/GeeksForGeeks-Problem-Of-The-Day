class Solution {
public:
    vector<int> rightView(Node *root) {
        vector<int> out;
        queue<Node *> q;
        q.push(root);
        Node* last;
        while (!q.empty()) {
            int sz = q.size();
            while (sz--) {
                last = q.front();
                q.pop();
                if (last->left)
                    q.push(last->left);
                if (last->right)
                    q.push(last->right);
            }
            out.push_back(last->data);
        }
        return out;
    }
};