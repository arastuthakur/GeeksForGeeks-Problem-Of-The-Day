class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         // Your code here
          HashSet <Integer> hs=new HashSet<>();
        Node temp=head;
        Node prev=head;
        while(temp!=null){
            if(hs.contains(temp.data)){
                prev.next=null;
            }else{
                hs.add(temp.data);
                if(prev.next==null){
                    prev.next=temp;
                }
                prev=temp;
            }
            temp=temp.next;
        }
        return head;
    }
}