class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        boolean b = true;
        while(q.size()!=0){
            int s = q.size();
            ArrayList<Integer> level = new ArrayList<>();
            for(int i=0;i<s;i++){
                Node temp = q.remove();
                level.add(temp.data);
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
            }
            if(b==true)Collections.reverse(level);
            for(int i=0;i<s;i++)ans.add(level.get(i));
            b=!b;
        }
        return ans;
    }
}