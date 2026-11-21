package Neetcode250.Graphs.Learning;

import java.util.List;

/**
 * Use DFS to detect a cycle anywhere in a directed graph.
 * Each neighbor list contains the destinations of that node's outgoing edges.
 */
public class Lesson04DirectedCycleDFS {
    public static boolean hasDirectedCycleDFS(List<List<Integer>> graph) {
        boolean[] visited = new boolean[graph.size()];
        boolean[] recursivePath = new boolean[graph.size()];
        for (int src = 0; src < graph.size(); src++) {
            if (!visited[src] && directedCycleAlgo(src, recursivePath, visited, graph)) {
                return true;
            }
        }
        return false;
    }

    private static boolean directedCycleAlgo(int u, boolean[] recursivePath, boolean[] visited, List<List<Integer>> graph) {
        visited[u] = true;
        recursivePath[u] = true;
        for(int v : graph.get(u)){
            if(visited[v] == false){
                visited[v] = true;
                if(directedCycleAlgo(v,recursivePath,visited,graph)){
                    return true;
                }
            } else if (recursivePath[v] == true) {
                return true;
            }
        }

        recursivePath[u] = false;
        return false;
    }

    public static void main(String[] args) {
        List<List<Integer>> disconnectedCycle = List.of(
                List.of(), List.of(2), List.of(3), List.of(1));
        List<List<Integer>> sharedNeighbor = List.of(
                List.of(1, 2), List.of(3), List.of(3), List.of());
        check(hasDirectedCycleDFS(disconnectedCycle), true);
        check(hasDirectedCycleDFS(sharedNeighbor), false);
        System.out.println("Examples passed");
    }

    private static void check(Object actual, Object expected) {
        if (!expected.equals(actual)) {
            throw new AssertionError("Expected " + expected + ", got " + actual);
        }
    }
}
