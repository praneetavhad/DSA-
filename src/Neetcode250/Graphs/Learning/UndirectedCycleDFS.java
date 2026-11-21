package Neetcode250.Graphs.Learning;

import java.util.List;

/**
 * Detect a cycle anywhere in a simple undirected graph using DFS.
 * Nodes are numbered from 0. The index of each neighbor list is its node.
 */
public class UndirectedCycleDFS {
    public static boolean hasUndirectedCycleDFS(List<List<Integer>> graph) {
        boolean[] visited = new boolean[graph.size()];
        for (int src = 0; src < graph.size(); src++) {
            if (!visited[src] && undirectedCycleAlgo(src, -1, visited, graph)) {
                return true;
            }
        }
        return false;
    }

    private static boolean undirectedCycleAlgo(int u, int parent, boolean[] visited, List<List<Integer>> graph) {
        visited[u] = true;
        for(int v : graph.get(u)){
            if(visited[v] == false){
                visited[v] = true;
                if(undirectedCycleAlgo(v,u,visited,graph)){
                    return true;
                }
            } else if (v != parent) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<List<Integer>> disconnectedCycle = List.of(
                List.of(), List.of(2, 3), List.of(1, 3), List.of(1, 2));
        List<List<Integer>> noCycle = List.of(List.of(1), List.of(0), List.of());
        check(hasUndirectedCycleDFS(disconnectedCycle), true);
        check(hasUndirectedCycleDFS(noCycle), false);
        System.out.println("Examples passed");
    }

    private static void check(Object actual, Object expected) {
        if (!expected.equals(actual)) {
            throw new AssertionError("Expected " + expected + ", got " + actual);
        }
    }
}
