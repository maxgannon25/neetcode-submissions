class Solution {
    public void dfs(Map<Integer, List<Integer>> map, int node, Set<Integer> visited){

        visited.add(node);

        for (int dest: map.get(node)){
            if (!visited.contains(dest)){
                dfs(map, dest, visited);
            }
        }
    }

    public int countComponents(int n, int[][] edges) {

        // YOUR LOGIC HERE

        Map<Integer, List<Integer>> map = new HashMap<>();

        Set<Integer> visited = new HashSet<>();

        int result = 0;

        // Create an empty list for every node
        for (int i=0; i < n; i++){
            map.put(i, new ArrayList<>());
        }

         // Build undirected graph
        for (int[] edge: edges){
            int start = edge[0];
            int end = edge[1];

            map.get(start).add(end);
            map.get(end).add(start);
        }

        // Find each connected component
        for (int i=0; i<n; i++){
            if(!visited.contains(i)){
                result++;

                dfs(map, i, visited);
            }
        }

        return result;
    }
}
