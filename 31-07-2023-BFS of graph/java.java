

class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfsTraversal = new ArrayList<>();
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        int startNode = 0;
        queue.add(startNode);
        visited[startNode] = true;
        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            bfsTraversal.add(currentNode);
            ArrayList<Integer> neighbors = adj.get(currentNode);
            for (int neighbor : neighbors) {
                if (!visited[neighbor]) {
                    queue.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
        
        return bfsTraversal;
    }
}