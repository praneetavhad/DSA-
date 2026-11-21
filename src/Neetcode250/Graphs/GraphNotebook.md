# Graph notebook

## Recognize the graph pattern

Look for connections or legal moves between locations, items, or states. A problem might describe neighboring cells, course prerequisites, or one-digit changes to a lock combination.

1. **Node** — What is one location, item, or state?
2. **Edge** — What makes two nodes direct neighbors? Can I move both ways? Do diagonals count?
3. **Goal** — Am I checking reachability, counting groups, finding fewest moves, ordering dependencies, or counting exposed sides?

| Problem clue | First approach to try |
| --- | --- |
| Can I get from A to B? | BFS or DFS from A |
| How many separate groups are there? | In an undirected graph, start BFS or DFS at each unvisited node |
| What is the fewest number of moves? | BFS when all moves have the same cost |
| How long until everything spreads? | BFS with all initial sources in the queue |
| Can I finish all prerequisites? | Directed cycle detection or Kahn's algorithm |
| What order respects prerequisites? | Topological sort |
| How many sides are exposed? | Scan the grid and check each land cell's four sides |

### When to use BFS or DFS

| Goal | Choose | Why |
| --- | --- | --- |
| Fewest moves when each move costs the same | BFS | It explores by distance, so the first time you reach a node gives the fewest moves. |
| Spread by rounds from several starting points | Multi-source BFS | Put all starting points in the queue together to model simultaneous spread. |
| Reachability or counting undirected connected components | BFS or DFS | Either visits every reachable node. For components, start again at each unvisited node. |
| Detect cycles by tracking the current path | DFS | In a directed graph, an edge to a node on the active path signals a cycle. In a simple undirected graph, track the parent and skip the edge back to it. |
| Order prerequisites | DFS or Kahn's algorithm | DFS reverses finish order. Kahn's algorithm queues nodes as their remaining indegree reaches zero. |

If each cell's contribution depends only on its immediate neighbors, a grid scan may be enough.

### Before coding

- Draw a tiny example and label the legal moves. For grids, generate neighbors with row and column offsets and check bounds.
- In BFS, mark visited when enqueuing. In recursive DFS, mark visited on entry. For directed cycles, also track the active recursion path.
- Check how many starts you need. Use one for reachability, each unvisited node for undirected components, or all initial sources together for simultaneous spread.
- Test a tiny edge case, such as an isolated node, disconnected groups, or a land cell in a corner.

- Use a grid scan when each cell's contribution depends only on its immediate neighbors. Choose BFS for fewest equal-cost moves or spread by rounds. Either BFS or DFS works for reachability and counting connected regions.

### Grid trick · Use a direction array

**Queue contents:** Use `Queue<int[]>` for grid BFS. Each entry is a cell's row and column, such as `new int[]{i, j}`. For adjacency-list BFS, use `Queue<Integer>` to store vertex IDs.

```text
                 (i-1, j)
                     │
(i, j-1) ──────── (i, j) ──────── (i, j+1)
                     │
                 (i+1, j)
```

```java
int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
```

Each pair stores a row change and a column change. For each `direction`, get the neighbor with `nextRow = i + direction[0]` and `nextCol = j + direction[1]`. For example, `{0, 1}` moves from `(2, 3)` to `(2, 4)`.

**BFS** — After dequeuing `(i, j)`, check each neighbor before enqueuing it.

```java
for (int[] direction : directions) {
    int nextRow = i + direction[0];
    int nextCol = j + direction[1];

    if (nextRow >= 0 && nextRow < grid.length
            && nextCol >= 0 && nextCol < grid[0].length) {
        // Check whether grid[nextRow][nextCol] can be visited.
        // If it can, mark it visited and enqueue it.
        // q.offer(new int[]{nextRow, nextCol});
    }
}
```

**Recursive DFS** — After checking that `(i, j)` is in bounds and can be visited, mark it visited. Then call DFS for each neighbor using the same `directions` array.

```java
// Inside dfs(), after checking bounds and marking grid[i][j] visited.
for (int[] direction : directions) {
    int nextRow = i + direction[0];
    int nextCol = j + direction[1];
    dfs(grid, nextRow, nextCol);
}
```

Each DFS call checks its own bounds before reading the grid. In BFS, check the neighbor's bounds and mark it visited before adding it to the queue. Match the offsets to the moves allowed by the problem.

## Reference lessons

Add one takeaway after each practice problem. Record the clue that helped you pick the approach and the mistake you want to catch next time.

## 1. Represent the graph

- Identify what a node represents and what makes two nodes neighbors.
- For an edge `u -> v`, add `v` to `u`'s list. For an undirected edge, add both directions.
- Give every node a neighbor list, including isolated nodes. An adjacency list uses O(V + E) space for V nodes and E edges.
- In a grid, a cell is a node. Generate neighbors by checking the allowed directions, bounds, and cell values.

### Adjacency list code

```java
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
```

### Adjacency matrix

Use plain-text diagrams. A line `───` represents an undirected edge, and an arrow `──▶` represents a directed edge.

```text
(0) ─── (1) ─── (2)     (3) isolated

          to
          0  1  2  3
from  0   0  1  0  0
      1   1  0  1  0
      2   0  1  0  0
      3   0  0  0  0
```

- Read `matrix[u][v]` as “Is there a direct edge from u to v?” Use 1 for an edge and 0 otherwise.
- For an undirected edge, fill both mirrored cells. For a directed edge, fill only the cell from source to destination.
- An isolated node has an all-zero row and column. The diagonal is zero unless there is a self-loop.
- Checking a specific edge takes O(1). Scanning a node's neighbors takes O(V), and the matrix takes O(V²) space.

## 2. Traverse the graph

- For reachability or connected components, use DFS or BFS.
- In recursive DFS, mark the node visited as soon as you enter it.
- In BFS, mark the node visited when you enqueue it. For fewest moves with equal-cost edges, record each neighbor's distance as the current distance plus one.
- For connected components in an undirected graph, loop over all nodes and start a traversal from each unvisited node.
- With an adjacency list, a full traversal takes O(V + E) time.

### BFS visit order

**Queue contents:** Each entry is an integer vertex ID. Use that ID to look up its neighbors in `graph`.

Start at node 0 and follow neighbors in the order listed.

```text
      (0)
     /   \
   (1)   (2)     (4) isolated
     \   /
      (3)

Removed   Queue after exploring neighbors
Start     [0]
0         [1, 2]
1         [2, 3]
2         [3]
3         []

Visit order: [0, 1, 2, 3]
```

Mark each node visited when you enqueue it. Node 1 discovers node 3 first, so node 2 skips it. The queue adds at the back with `q.add(v)` and removes from the front with `q.pop()`.

```java
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
```

### DFS visit order

```text
      (0)
     /   \
   (1)   (2)     (4) isolated
     \   /
      (3)

Call path:  0 -> 1 -> 3 -> 2
Returns:    2 -> 3 -> 1 -> 0
Visit order: [0, 1, 3, 2]
```

Follow the first unvisited neighbor until there is nowhere left to go, then return to the previous call. Mark each node visited on entry. In the code below, marking a neighbor immediately before the recursive call is redundant because the helper marks it on entry. A call from 0 reaches only its own component, so it skips isolated node 4.

```java
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
```

## 3. Detect cycles and order dependencies

- In a simple undirected graph, skip the edge back to the DFS parent. A visited neighbor other than the parent signals a cycle.
- In directed DFS, an edge to a node still on the current DFS path signals a cycle. Keep track of which nodes are active and which are finished.
- For prerequisites, draw each edge from prerequisite to dependent. Start with all nodes that have zero incoming edges. Remove each processed node's outgoing edges and enqueue neighbors whose incoming count reaches zero. If fewer than V nodes are processed, there is a cycle.

### Undirected cycle detection using DFS

```text
(0) isolated       (1) ─── (2)
                     \     /
                       (3)

DFS starts: 0, then 1
Call path: 1 -> 2 -> 3
At 3: skip parent 2. Neighbor 1 is already visited, so there is a cycle.
```

- Start DFS from each unvisited node with parent `-1` to cover disconnected components.
- When recursing from `u` to `v`, pass `u` as the parent. A visited neighbor other than the parent signals a cycle in a simple undirected graph.
- Return false only after checking all components. Time is O(V + E), and extra space is O(V) including the recursion stack.
- The helper marks its current node on entry, so the assignment just before recursion is redundant.

```java
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
```

### Directed cycle detection using DFS

```text
(0) isolated       (1) ──▶ (2) ──▶ (3)
                    ^                 |
                    +-----------------+

Active path: 1 ──▶ 2 ──▶ 3
Node 3 points back to active node 1, so there is a cycle.

Shared neighbor without a cycle:

(0) ──▶ (1) ──▶ (3)
 |                 ^
 +-----> (2) ------+

Node 3 finishes on the first branch. When node 2 reaches it, it is
visited but no longer active.
```

- Mark a node visited and active on entry. Clear its active flag when its DFS call finishes normally.
- An edge to an active node closes a directed cycle. A finished node can be shared by multiple paths.
- Start DFS from every unvisited node to cover disconnected components. Time is O(V + E) and extra space is O(V), including the recursion stack.

```java
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
```

### Topological sort using DFS

This version assumes the input is a directed acyclic graph (DAG). To handle cyclic inputs, also track the active recursion path as in the directed cycle detection example.

```text
(0) ──▶ (2) ◀── (1)

Start at 0: finish 2, then 0.
Start at 1: 2 is already finished, so finish 1.

Stack (bottom to top): [2, 0, 1]
Pop order:             [1, 0, 2]
```

Push each node after exploring its outgoing neighbors. Popping reverses the finish order, so both 0 and 1 appear before 2. Start DFS at every unvisited vertex to include disconnected and isolated nodes. Time is O(V + E) and extra space is O(V), including the recursion stack.

```java
public static List<Integer> topologicalOrder(List<List<Integer>> graph) {
    boolean[] visited = new boolean[graph.size()];
    List<Integer> ans = new ArrayList<>();
    Stack<Integer> st = new Stack<>();
    for (int src = 0; src < graph.size(); src++) {
        if (!visited[src]){
            DFS_Topolofical_sort(src, st, visited, graph);
        }
    }

    while(!st.isEmpty()){
        ans.add(st.pop());
    }
    return ans;
}

private static void DFS_Topolofical_sort(int u, Stack<Integer> st, boolean[] visited, List<List<Integer>> graph) {
    visited[u] = true;

    for(int v : graph.get(u)){
        if(visited[v] == false){
            DFS_Topolofical_sort(v, st, visited, graph);
        }
    }

    st.push(u);
}
```

### Topological sort using Kahn's algorithm

**Queue contents:** `Queue<Integer> q` stores vertex IDs whose remaining indegree is zero. The counts live in the `indegree` array.

Indegree counts the incoming edges. During traversal, it counts how many prerequisites are still waiting to be processed. Enqueue all nodes with indegree zero, then enqueue each dependent when its count reaches zero.

```text
(0) ──▶ (2) ◀── (1)

Initial indegree: [0, 0, 2]
Processed    Indegree of 2    Queue
Start        2                [0, 1]
0            1                [1]
1            0                [2]
2            0                []

Order: [0, 1, 2]
```

Both 0 and 1 must come before 2. Either can go first. Time is O(V + E) and extra space is O(V). This exercise guarantees a DAG. For a general directed graph, a cycle exists if the queue empties before all vertices are processed.

```java
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
```

## LeetCode

Record the problem number, name, and chosen approach. Add solution steps after the implementation is complete and the approach has been verified as optimal.

### 463. Island Perimeter

**Approach practiced:** Recursive DFS from a land cell. Passed all three examples.

**Pseudocode**

1. Start with a total perimeter of zero. Loop over each row `i` and column `j`. Whenever `grid[i][j]` is `1`, add the result of DFS from `(i, j)` to the total.
2. In DFS, return `1` if `(i, j)` is outside the grid or `grid[i][j]` is `0`. That move crossed an exposed side.
3. If `grid[i][j]` is `-1`, return `0`. Otherwise, mark `grid[i][j]` as `-1` and return the sum of DFS from `(i + 1, j)`, `(i - 1, j)`, `(i, j + 1)`, and `(i, j - 1)`.
4. Return the total after the scan.

**Complexity:** DFS takes O(rows × cols) worst-case time and can use O(rows × cols) stack space. It marks visited land in the input grid.

**Space-optimal approach:** Scan the grid and count each land cell's exposed sides directly. This achieves the same worst-case time with O(1) extra space.

### 997. Find the Town Judge

**Approach:** Count incoming and outgoing trust edges. The judge is trusted by all `n - 1` other people and trusts nobody.

**Pseudocode**

1. Create `indegree` and `outdegree` arrays with `n + 1` slots because people are numbered from `1` to `n`.
2. For each pair `[u, v]` in `trust`, increase `outdegree[u]` and `indegree[v]` by one.
3. Check each person `i` from `1` to `n`. Return `i` if `indegree[i]` is `n - 1` and `outdegree[i]` is zero.
4. Return `-1` after checking everyone if no person meets both conditions.

**Complexity:** O(n + trust.length) time and O(n) extra space.

### 200. Number of Islands

**Approach:** Scan the grid and use DFS to mark each island. Each new DFS start counts one island.

**Pseudocode**

1. Set `cnt` to zero. Loop through every row `i` and column `j` in `grid`.
2. When `grid[i][j]` is the character `'1'`, run DFS from `(i, j)`, then increase `cnt` by one.
3. In DFS, stop if `(i, j)` is out of bounds or `grid[i][j]` is `'0'`. Otherwise, change it to `'0'` before exploring `(i + 1, j)`, `(i - 1, j)`, `(i, j + 1)`, and `(i, j - 1)`.
4. Return `cnt` after scanning the grid.

**Complexity:** O(m × n) worst-case time and O(m × n) worst-case recursion stack space. The DFS marks visited land directly in `grid`.

### 695. Max Area of Island

**Approach:** Scan the grid and use DFS to find each island's area. Track the largest area in `max_cnt`.

**Pseudocode**

1. Set `max_cnt` to zero. Scan each row `i` and column `j` in `grid`.
2. When `grid[i][j]` is `1`, set `cnt` to the area returned by DFS from `(i, j)`. Update `max_cnt` with the larger of `cnt` and `max_cnt`.
3. In DFS, return zero for an out-of-bounds cell or a cell with value `0`. For fresh land, set `grid[i][j]` to `0` to mark it visited. Start its area at one and add the areas returned by DFS for its four neighbors.
4. After scanning the grid, return `max_cnt`.

**Complexity:** O(m × n) time and O(m × n) worst-case recursion stack space.

### 286. Walls and Gates

**Queue contents:** `Queue<int[]> q` stores cell coordinates as `new int[]{row, col}`. It starts with every gate's coordinates. The distance lives in `grid[row][col]`.

**Approach:** Use multi-source BFS from all gates. Since every move costs one step, the first time BFS reaches an empty room gives its shortest distance to any gate.

**Pseudocode**

1. Scan `grid[i][j]` and add every gate with value `0` to `q`.
2. While `q` has entries, take out a cell at `(curr_row, curr_col)`. Use `DIRECTIONS` to calculate each `(nextRow, nextCol)`.
3. If the neighbor is in bounds and `grid[nextRow][nextCol]` is `Integer.MAX_VALUE`, set it to `grid[curr_row][curr_col] + 1` and enqueue its coordinates. Writing the distance marks the room visited.
4. When the queue is empty, the grid contains the distances. Unreachable rooms keep their original value.

**Complexity:** O(m × n) time and O(m × n) worst-case queue space.

### 994. Rotting Oranges

**Queue contents:** `Queue<int[]> q` stores rotten orange coordinates as `new int[]{row, col}`. It starts with every initially rotten orange's coordinates. Track time with `minutes` and queue layers.

**Approach:** Use multi-source BFS. Every initially rotten orange starts spreading at minute zero, and each queue layer represents one round of spread.

**Pseudocode**

1. Set `minutes` and `fresh` to zero. Scan `grid[i][j]`, add coordinates with value `2` to `q`, and count cells with value `1` in `fresh`. Return zero if there are no fresh oranges.
2. While `q` has entries and `fresh > 0`, save `q.size()` as `q_size`. Process exactly that many oranges, removing each with one call to `q.poll()`.
3. Use `DIRECTIONS` to calculate `nextRow` and `nextCol`. If the neighbor is in bounds and `grid[nextRow][nextCol]` is `1`, set it to `2`, enqueue its coordinates, and decrement `fresh`.
4. Increase `minutes` after processing the whole layer. When the loop ends, return `minutes` if `fresh` is zero, or `-1` if fresh oranges remain.

**Complexity:** O(m × n) time and O(m × n) worst-case queue space.
