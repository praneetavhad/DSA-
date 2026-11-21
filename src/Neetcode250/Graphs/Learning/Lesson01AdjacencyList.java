package Neetcode250.Graphs.Learning;

import java.util.ArrayList;
import java.util.List;

/**
 * Build neighbor lists for nodes 0 through nodeCount - 1. Preserve edge input order.
 * Nodes are numbered from 0. The index of each neighbor list is its node.
 */
public class Lesson01AdjacencyList {
    public static List<List<Integer>> build(int nodeCount, int[][] edges, boolean directed) {
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < nodeCount; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int start = edges[i][0];
            int end = edges[i][1];
            addEdge(graph,start,end,directed);
        }

        return graph;

    }

    private static void addEdge(List<List<Integer>> graph, int start, int end, boolean directed) {
        if (directed){
            graph.get(start).add(end);
        } else{
            graph.get(start).add(end);
            graph.get(end).add(start);
        }
    }

    public static void main(String[] args) {
        int[][] edges = {{0, 1}, {0, 2}};
        check(build(4, edges, false), List.of(List.of(1, 2), List.of(0), List.of(0), List.of()));
        check(build(4, edges, true), List.of(List.of(1, 2), List.of(), List.of(), List.of()));

        int[][] largerGraph = {
                {0, 1}, {1, 2}, {2, 3},
                {0, 4}, {1, 5}, {2, 6}, {3, 7},
                {4, 5}, {5, 6}, {6, 7}, {7, 8}
        };
        check(build(10, largerGraph, false), List.of(
                List.of(1, 4), List.of(0, 2, 5), List.of(1, 3, 6), List.of(2, 7),
                List.of(0, 5), List.of(1, 4, 6), List.of(2, 5, 7), List.of(3, 6, 8),
                List.of(7), List.of()
        ));
        System.out.println("Examples passed");
    }

    private static void check(Object actual, Object expected) {
        if (!expected.equals(actual)) {
            throw new AssertionError("Expected " + expected + ", got " + actual);
        }
    }
}
