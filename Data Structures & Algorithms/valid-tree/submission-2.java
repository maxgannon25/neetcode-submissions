class Solution {
    public boolean dfs(
            int current,
            int parent,
            Set<Integer> seen,
            Map<Integer, List<Integer>> graph) {

        // YOUR LOGIC HERE
        seen.add(current);

        for (int dest : graph.getOrDefault(current, new ArrayList<>())){
            if (dest == parent){
                continue;
            }

            if (seen.contains(dest)){
                return false;
            }

            if (!dfs(dest, current, seen, graph)){
                return false;
            }
        }

        return true;
    }

    public boolean validTree(int n, int[][] edges) {

        // YOUR LOGIC HERE

        //value, destination
        Map<Integer, List<Integer>> maps = new HashMap<>();
        Set<Integer> seen = new HashSet<>();

        for (int[] e: edges){
            int a = e[0];
            maps.putIfAbsent(a, new ArrayList<>());
            int b = e[1];
            maps.putIfAbsent(b, new ArrayList<>());

            maps.get(a).add(b);
            maps.get(b).add(a);
        }

        if (!dfs(0, -1, seen, maps)){
            return false;
        }

        if (seen.size() != n){
            return false;
        }

        return true;
    }
}
