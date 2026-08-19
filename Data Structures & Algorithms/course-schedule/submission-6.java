class Solution {
     public boolean dfs(
            int course,
            Map<Integer, List<Integer>> graph,
            Set<Integer> visiting,
            Set<Integer> visited) {

    if (visiting.contains(course)){
        return false;
    }

    if (visited.contains(course)){
        return true;
    }

    visiting.add(course);

    for (int preq: graph.get(course)){
        if(!dfs(preq, graph, visiting, visited)){
            return false;
        }
    }

    visiting.remove(course);
    visited.add(course);

     return true;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        Map<Integer, List<Integer>> graph = new HashMap<>();

        Set<Integer> visited = new HashSet<>();
        Set<Integer> visiting = new HashSet<>();

        for (int i=0; i< numCourses; i++){
            graph.put(i, new ArrayList<>());
        }

        for (int[] pre: prerequisites){
            int course = pre[0];
            int prereq = pre[1];

            graph.get(course).add(prereq);
        }

        for (int i=0; i< numCourses; i++){
            if(!dfs(i, graph, visiting, visited)){
                return false;
            }
        }

        return true;
    }
}
