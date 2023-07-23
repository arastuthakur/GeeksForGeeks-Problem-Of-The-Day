class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        if(head==null || head.next==null){
            return head;
        }
        Node zeroHead = new Node(-1), oneHead = new Node(-1), twoHead = new Node(-1); 
        Node zero = zeroHead, one = oneHead, two = twoHead; 
        Node curr = head;
        
        while (curr!=null) { 
            if (curr.data == 0) { 
                zero.next = curr; 
                zero = zero.next; 
            }
            else if (curr.data == 1){ 
                one.next = curr; 
                one = one.next; 
            } 
            else { 
                two.next = curr; 
                two = two.next; 
            } 
            curr = curr.next; 
        }
 
        zero.next = (oneHead.next!=null) ? (oneHead.next) : (twoHead.next); 
        one.next = twoHead.next; 
        two.next = null;
    
        head = zeroHead.next;
        return head;
    }
}