class Solution
{
    public:
    //Function to remove duplicates from unsorted linked list.
    Node * removeDuplicates( Node *head) 
    {
        // your code goes here
        unordered_map <int,int> mp;
        
        Node* temp = head;
        
        mp[temp->data]++;
        
        while(temp->next)
        {
           if(mp[temp->next->data]++) 
            temp->next = temp->next->next;
           else 
            temp = temp->next;
        }
        
        return head;
    }
};