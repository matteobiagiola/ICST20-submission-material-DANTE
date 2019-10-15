package com.dante.filtering.moea;

import org.apache.log4j.Logger;
import org.uma.jmetal.solution.BinarySolution;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GraphInt {

    private int n;   // No. of vertices
    private LinkedList<Integer> adj[]; //Adjacency List
    private final static Logger logger = Logger.getLogger(GraphInt.class.getName());

    public GraphInt(BinarySolution binarySolution) {
        List<String> variables = Arrays.asList(binarySolution.toString().split("-"));
        this.n = variables.size() + 1;
        this.adj = new LinkedList[n];
        for (int i = 1; i < n + 1; i++) {
            adj[i - 1] = new LinkedList();
        }
        for (int i = 0; i < variables.size(); i++) {
            String variable = variables.get(i);
            char[] bits = variable.toCharArray();
            int source = i + 2;
            for (int j = 0; j < bits.length; j++) {
                char bit = bits[j];
                int target = j + 1;
                if(bit == '1')
                    this.addEdge(source, target);
            }
        }
    }

    public GraphInt(int n) {
        this.n = n;
        adj = new LinkedList[n];
        for (int i = 0; i < n; ++i)
            adj[i] = new LinkedList();
    }

    //Function to add an edge into the graph
    public void addEdge(int v, int w) {
        this.adj[v - 1].add(w - 1);
    }

    //prints BFS traversal from a given source s
    public boolean isReachable(int s, int d) {

        // arrays are 0 based
        s = s - 1;
        d = d - 1;

        LinkedList<Integer> temp;

        // Mark all the vertices as not visited(By default set
        // as false)
        boolean visited[] = new boolean[n];

        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<>();

        // Mark the current node as visited and enqueue it
        visited[s] = true;
        queue.add(s);

        // 'i' will be used to get all adjacent vertices of a vertex
        Iterator<Integer> i;
        while (queue.size() != 0) {
            // Dequeue a vertex from queue and print it
            s = queue.poll();

            int n;
            i = adj[s].listIterator();

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            while (i.hasNext()) {
                n = i.next();

                // If this adjacent node is the destination node,
                // then return true
                if (n == d) {
                    return true;
                }

                // Else, continue to do BFS
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }

        // If BFS is complete without visited d
        return false;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.adj.length; i++) {
            List<Integer> edges = this.adj[i];
            for (int j = 0; j < edges.size(); j++) {
                builder.append(i).append("->").append(edges.get(j));
                if(j != edges.size() - 1)
                    builder.append(",");
            }
            if(i != this.adj.length - 1 && !edges.isEmpty())
                builder.append(":");
        }
        return builder.toString();
    }
}