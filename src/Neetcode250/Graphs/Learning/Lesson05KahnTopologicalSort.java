package Neetcode250.Graphs.Learning;

import java.util.*;

/**
 * Use Kahn's algorithm to return any valid topological ordering of a directed acyclic graph (DAG).
 * Each neighbor list contains the destinations of that node's outgoing edges.
 */
public class Lesson05KahnTopologicalSort {
    public static List<Integer> topologicalOrder(List<List<Integer>> graph) {
        List<Integer> ans = new ArrayList<>();
        int[] indegree = new int[graph.size()];

        // Calculate Indegree
        for(int u = 0; u< graph.size();u++){
            for(int v: graph.get(u)){
                indegree[v]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        // Add 0 indegree to queue
        for(int i=0;i<indegree.length;i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }

        // BFS tarversal
        while(!q.isEmpty()){
            int curr = q.poll();
            ans.add(curr);

            for(int v: graph.get(curr)){
                indegree[v]--;
                if(indegree[v] == 0){
                    q.add(v);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        check(topologicalOrder(List.of(List.of(1), List.of(2), List.of())), List.of(0, 1, 2));
        List<List<Integer>> sharedPrerequisites = List.of(List.of(2), List.of(2), List.of());
        checkTopologicalOrder(sharedPrerequisites, topologicalOrder(sharedPrerequisites));

        List<List<Integer>> largerDependencies = List.of(
                List.of(2, 3), // 0
                List.of(2, 5), // 1
                List.of(4),    // 2
                List.of(4),    // 3
                List.of(6),    // 4
                List.of(6),    // 5
                List.of(),     // 6
                List.of()      // 7 (isolated)
        );
        checkTopologicalOrder(largerDependencies, topologicalOrder(largerDependencies));
        System.out.println("Examples passed");
    }

    private static void checkTopologicalOrder(List<List<Integer>> graph, List<Integer> order) {
        int size = graph.size();
        if (order.size() != size) {
            throw new AssertionError("Expected all " + size + " nodes, got " + order);
        }

        int[] position = new int[size];
        boolean[] seen = new boolean[size];
        for (int i = 0; i < size; i++) {
            int node = order.get(i);
            if (node < 0 || node >= size || seen[node]) {
                throw new AssertionError("Invalid or repeated node: " + node);
            }
            seen[node] = true;
            position[node] = i;
        }

        for (int from = 0; from < size; from++) {
            for (int to : graph.get(from)) {
                if (position[from] >= position[to]) {
                    throw new AssertionError(from + " must come before " + to + " in " + order);
                }
            }
        }
    }

    private static void check(Object actual, Object expected) {
        if (!expected.equals(actual)) {
            throw new AssertionError("Expected " + expected + ", got " + actual);
        }
    }
}
