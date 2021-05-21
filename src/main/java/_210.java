package main.java;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Stack;

public class _210 {
        public int[] findOrder(int numCourses, int[][] prerequisites) {
            List<List<Integer>> adjacencyList = new ArrayList<List<Integer>>();
            initializeGraph(numCourses, prerequisites, adjacencyList);
            return topologicalSort(adjacencyList);

        }

        private void initializeGraph(int numCourses, int[][] prerequisites, List<List<Integer>> adjacencyList) {
            int n = numCourses;
            while (n-- > 0)
                adjacencyList.add(new ArrayList<Integer>());
            for (int[] edge : prerequisites) {
                adjacencyList.get(edge[1]).add(edge[0]);
            }
        }

        private int[] topologicalSort(List<List<Integer>> adjacencyList) {
            BitSet hasCycle = new BitSet(1);
            Stack<Integer> topSortStack = new Stack<Integer>();
            BitSet visited = new BitSet(adjacencyList.size());
            BitSet onCurrStack = new BitSet(adjacencyList.size());

            for (int i = adjacencyList.size() - 1; i >= 0; i--) {
                if (visited.get(i) == false && dfs(i, visited, onCurrStack, topSortStack, adjacencyList) == false) {
                    hasCycle.set(0);
                    break;
                }
            }

            if (hasCycle.get(0))
                return new int[0];
            else {
                int[] result = new int[adjacencyList.size()];
                for (int i = 0; !topSortStack.isEmpty(); i++) result[i] = topSortStack.pop();
                return result;
            }
        }

        private boolean dfs(int edgeFrom, BitSet visited, BitSet onCurrStack, Stack<Integer> topSortStack, List<List<Integer>> adjacencyList) {
            visited.set(edgeFrom);
            onCurrStack.set(edgeFrom);

            for (int edgeTo : adjacencyList.get(edgeFrom)) {
                if (!visited.get(edgeTo)) {
                    if (!dfs(edgeTo, visited, onCurrStack, topSortStack, adjacencyList)) return false;
                } else if (onCurrStack.get(edgeTo))
                    return false;
            }

            onCurrStack.clear(edgeFrom);
            topSortStack.push(edgeFrom);
            return true;
        }
    }
