package Neetcode250.Graphs.Learning;

import java.util.ArrayList;
import java.util.List;

/**
 * Return the nodes reachable from start in depth-first visit order.
 * Explore neighbors in the order listed and visit each node once.
 * Nodes are numbered from 0. The index of each neighbor list is its node.
 */
public class Lesson02DepthFirstSearch {
    public static List<Integer> DFS(List<List<Integer>> graph, int start) {
        List<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[graph.size()];

        dfs_traversal(start,graph,visited,ans);
        return ans;
    }

    private static void dfs_traversal(int u, List<List<Integer>> graph, boolean[] visited, List<Integer> ans) {
        ans.add(u);
        visited[u] = true;

        for(int v : graph.get(u)){
            if(visited[v] == false){
                visited[v] = true;
                dfs_traversal(v,graph,visited,ans);
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> graph = List.of(List.of(1, 2), List.of(0, 3),
                List.of(0, 3), List.of(1, 2), List.of());
        check(DFS(graph, 0), List.of(0, 1, 3, 2));
        check(DFS(graph, 4), List.of(4));
        System.out.println("Examples passed");
    }

    private static void check(Object actual, Object expected) {
        if (!expected.equals(actual)) {
            throw new AssertionError("Expected " + expected + ", got " + actual);
        }
    }
}
