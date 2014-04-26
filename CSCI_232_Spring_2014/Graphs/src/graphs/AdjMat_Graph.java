/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.util.LinkedList;

/**
 *
 * @author Brendan
 */
public class AdjMat_Graph {

    public int[][] M; // adjacency matrix
    int numVertices;
    public Vertex[] vertex;

    public AdjMat_Graph(int n) {
        numVertices = n;
        M = new int[n][n];
        vertex = new Vertex[numVertices];
        for (int i = 0; i < numVertices; i++) {
            vertex[i] = new Vertex("vertex" + i, i);
        }
    }

    public void printGraph() {
        System.out.println("Graph:");
        System.out.println("Number of vertices: " + numVertices);
        System.out.print("Vertices:");
        for (int i = 0; i < numVertices; i++) {
            System.out.print(" " + vertex[i]);
        }
        System.out.println();
        System.out.println("Edges:");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                if (M[i][j] > 0) {
                    System.out.print(" (" + vertex[i] + "," + vertex[j] + ")");
                }
            }
        }
        System.out.println();
    }

    // breadth first search
    public void bfs(int source) {
        for (int i = 0; i < numVertices; i++) {
            vertex[i].visited = false;
            vertex[i].bfsPred = null;
        }
        LinkedList<Vertex> queue = new LinkedList<Vertex>();
        queue.offer(vertex[source]);
        vertex[source].visited = true;
        while (!queue.isEmpty()) {
            Vertex next = queue.poll();
            int nextIndex = next.getIndex();
            for (int j = 0; j < numVertices; j++) {
                if (M[nextIndex][j] > 0 && !vertex[j].visited) {
                    queue.offer(vertex[j]);
                    vertex[j].visited = true;
                    System.out.println("visited " + vertex[j]);
                    vertex[j].bfsPred = next;
                }
            }
        }
    }
}
