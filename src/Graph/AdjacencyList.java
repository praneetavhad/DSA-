package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class AdjacencyList {
    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();


        for(int i=0;i< v;i++){
            graph.add(new ArrayList<>());
        }


//        System.out.println(graph);

        addEdge(graph, 0, 1);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 2, 3);
        addEdge(graph, 2, 4);

//        System.out.println(graph);

        printGraph(graph);

        BFSTraversal(graph,0,v);

        boolean [] visited = new boolean[v];
        System.out.println("\n DFS traversal");
        DFSTraversal(0,graph,visited);


    }

    private static void DFSTraversal(int start, ArrayList<ArrayList<Integer>> graph, boolean[] visited) {
        System.out.print(start + " ");
        visited[start] = true;

        for(int neighbour : graph.get(start)){
            if(!visited[neighbour]){
                DFSTraversal(neighbour,graph,visited);
            }
        }
    }

    private static void BFSTraversal(ArrayList<ArrayList<Integer>> graph, int start, int v) {
        Queue<Integer> q = new LinkedList<>();
        boolean [] visited = new boolean[v];

        q.offer(start);
        visited[start] = true;
        System.out.println("BFS Traversal");
        while (!q.isEmpty()){
            int u = q.poll();
            System.out.print(u + " ");

            for(int neighbour : graph.get(u)){
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    q.offer(neighbour);
                }
            }
        }

    }

    private static void printGraph(ArrayList<ArrayList<Integer>> graph) {
        for(int i=0;i< graph.size();i++){
            System.out.print(i + " -> " );

            for(int neighbour : graph.get(i)){
                System.out.print(neighbour + " ");
            }
            System.out.println();
        }
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> graph, int i, int j) {
        graph.get(i).add(j);
        graph.get(j).add(i);
    }
}
