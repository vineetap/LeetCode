package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class _210Modified {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        initialiseGraph(numCourses, prerequisites);
        return getTopologicalSort(initialiseGraph(
                numCourses, prerequisites
        )); // Placeholder return value
    }

    private List<List<Integer>> initialiseGraph(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjacencyList = new ArrayList<>();
        IntStream.range(0, numCourses).forEach(i -> adjacencyList.add(new ArrayList<>()));

        for (int[] edge : prerequisites) {
            adjacencyList.get(edge[1]).add(edge[0]);
        }
        return adjacencyList;
    }


    private int[] getTopologicalSort(List<List<Integer>> adjacencyList) {
        boolean[] visited = new boolean[adjacencyList.size()];
        boolean[] onCurrentPath = new boolean[adjacencyList.size()];
        List<Integer> topologicalSort = new ArrayList<>();
        //forest traversal - this outer loop is needed to handle disconnected components
        for (int i = adjacencyList.size() - 1; i >= 0; i--) {
            if (!visited[i] && !dfs(i, visited, onCurrentPath, topologicalSort, adjacencyList.get(i))) {
                return new int[0]; // Cycle detected, return an empty array
            }
        }
        return topologicalSort.reversed().stream().mapToInt(i -> i).toArray();
    }

    private boolean dfs(int currentNode, boolean[] visited, boolean[] onCurrentPath,
                        List<Integer> topologicalSort, List<Integer> graph) {

        // Mark current node as visited and add to current path
        visited[currentNode] = true;
        onCurrentPath[currentNode] = true;

        // Check all neighbors of current node
        for (int neighbor : graph) {
            if (!visited[neighbor]) {
                // Recursive call for unvisited neighbors
                if (!dfs(neighbor, visited, onCurrentPath, topologicalSort, graph)) {
                    return false; // Cycle detected in subtree
                }
            } else if (onCurrentPath[neighbor]) {
                return false; // Back edge found - cycle detected
            }
        }

        // Remove current node from path and add to topological order
        onCurrentPath[currentNode] = false;
        topologicalSort.add(currentNode);
        return true;
    }
}