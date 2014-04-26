/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.io.FileReader;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Iterator;

/**
 *
 * @author Brendan
 */
public class TestGraphs {

    /**
     * @param args the command line arguments
     */
    
    public static void printShortestPath(AdjMat_Graph graph, int i) {
        Vertex curVertex = graph.vertex[i];
        LinkedList<Vertex> pathList = new LinkedList<Vertex>();
        System.out.print("shortest path to vertex " + curVertex + " : ");
        while (curVertex != null) {
            pathList.addFirst(curVertex);
            curVertex = curVertex.bfsPred;
        }
        Iterator<Vertex> pathIter = pathList.iterator();
        while (pathIter.hasNext()) {
            System.out.print("->" + pathIter.next());
        }
        System.out.println();
    }
    
    public static void printShortestPaths(AdjMat_Graph graph) {
        for (int i = 0; i < graph.numVertices; i++) {
            printShortestPath(graph, i);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String fileName = "src\\testgraph1.txt";
        try {
            Scanner scanner = new Scanner(new FileReader(fileName));
            int n = scanner.nextInt(); // first line
            AdjMat_Graph graph = new AdjMat_Graph(n);
            while (scanner.hasNextLine()) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                graph.M[a][b] = graph.M[b][a] = 1;
                //System.out.println("added edge: " + a + " " + b);
            }
            
            graph.printGraph();
            graph.bfs(3);
            printShortestPaths(graph);
            
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
