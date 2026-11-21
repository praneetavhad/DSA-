package Neetcode250.Graphs.Learning;

import java.util.*;

/**
 * Return the nodes reachable from start in breadth-first visit order.
 * Explore neighbors in the order listed and visit each node once.
 * Nodes are numbered from 0. The index of each neighbor list is its node.
 */
public class Lesson03BreadthFirstSearch {
    public static List<Integer> BFS(List<List<Integer>> graph, int start) {
        List<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[graph.size()];
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(start);
        visited[start] = true;

        while(!q.isEmpty()){
            int u = q.pop();
            ans.add(u);

            //For u = 0 in your example, graph.get(0) is [1, 2],
            // so v is 1 on the first iteration and 2 on the second.
            for (int v : graph.get(u)){
                if(visited[v] == false){
                    visited[v] = true;
                    q.add(v);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        List<List<Integer>> graph = List.of(List.of(1, 2), List.of(0, 3),
                List.of(0, 3), List.of(1, 2), List.of());
        check(BFS(graph, 0), List.of(0, 1, 2, 3));
        check(BFS(graph, 4), List.of(4));
        System.out.println("Examples passed");
    }

    private static void check(Object actual, Object expected) {
        if (!expected.equals(actual)) {
            throw new AssertionError("Expected " + expected + ", got " + actual);
        }
    }
}
