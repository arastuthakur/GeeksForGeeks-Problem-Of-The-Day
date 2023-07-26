class Solution
{
   public static void buildMap(Node root, Map<Integer , Integer> mp){
        if(root == null) return ;
        if(root.left != null){
            mp.put(root.left.data , root.data);
            buildMap(root.left , mp);
        } 
        if(root.right!= null){
            mp.put(root.right.data , root.data);
            buildMap(root.right , mp);
        }
    }
    
    public int kthAncestor(Node root, int k, int node)
    {
        Map<Integer , Integer> mp = new HashMap();
        buildMap(root , mp);
        while( k != 0 && mp.containsKey(node)){
            node = mp.get(node);
            k--;
        }
        if( k == 0) return node;
        return -1;
    }
}