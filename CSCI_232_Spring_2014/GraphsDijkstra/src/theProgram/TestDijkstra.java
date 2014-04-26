package theProgram;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brendan
 */


import java.io.FileReader;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

/** Program to solve a maze represented as a graph.
 *  This program performs a breadth-first search of the graph
 *  to find the "shortest" path from the start vertex to the
 *  end. It is assumed that the start vertex is 0, and the
 *  end vertex is numV-1.
 *  @author Koffman and Wolfgang
 */
public class TestDijkstra {

    /** Main method to solve the maze.
     *  pre: args[0] contains the name of the input file.
     *  @param args Command line argument
     */
    public static void main(String[] args) {
        int numV = 0; // The number of vertices.
        Graph theGraph = null;
        // Load the graph data from a file.
        try {
            Scanner scan = new Scanner(new FileReader("src\\nodesAndWeights2.txt"));
            theGraph = AbstractGraph.createGraph(scan, false, "Matrix");
            numV = theGraph.getNumV();
        } catch (IOException ex) {
            System.err.println("IO Error while reading graph");
            System.err.println(ex.toString());
            System.exit(1);
        }
        // Perform Dijkstra's algorithm:
        int startNode1 = 9;
        
//        int start = 0; // starting  vertex
        int parent[] = new int[numV];
        double dist[] = new double[numV];
        DijkstrasAlgorithm.dijkstrasAlgorithm(theGraph, startNode1, parent, dist);
        
        /*
         * This is a random method used for generatig encryption keys in security software,
         * It is much more "Random" then the math.Random()
         * I found this method while building my galaxy program.
         */
        System.out.println("ALL THE PATHS POSSIBLE FROM THE FIRST START NODE\n");
        for(int destination = 0; destination < 10; destination ++){
            int destinationNode1 = destination;
        // Construct the first path.
        Deque<Integer> thePath1 = new ArrayDeque<Integer>();
        int v = destinationNode1;
        while (parent[v] != -1) {
            thePath1.push(new Integer(v));
            v = parent[v];
        }
        // Output the path.
        System.out.println("The Shortest path is:");
        System.out.print("vertex " + startNode1 +" to vertex "+ destinationNode1 + " is:\n");
        System.out.print(startNode1 + " -> ");
        while (!thePath1.isEmpty()) {
            System.out.print(thePath1.pop());
            if(!thePath1.isEmpty()){
                System.out.print(" -> ");
            }
        }
        System.out.println("(distance = " + dist[destinationNode1] + ")\n");
    }
        System.out.println("THIS CONCLUDES ALL POSSIBLE PATHS FROM FIRST START NODE TO EACH DESTINATION NODE");
        System.out.println();
        System.out.println("ALL THE PATHS POSSIBLE FROM THE SECOND START NODE\n");
        int startNode2 = 5;
        DijkstrasAlgorithm.dijkstrasAlgorithm(theGraph, startNode2, parent, dist);
        for(int destination = 0; destination < 10; destination ++){

            int destinationNode2 = destination;
        //construct the second path
        Deque<Integer> thePath2 = new ArrayDeque<Integer>();
        int z = destinationNode2;
        while (parent[z] != -1) {
            thePath2.push(new Integer(z));
            z = parent[z];
        }
        // Output the path.
        System.out.println("The Shortest path is:");
        System.out.print("vertex " + startNode2 +" to vertex "+ destinationNode2 + " is:\n");
        System.out.print(startNode2 + " -> ");
        while (!thePath2.isEmpty()) {
            System.out.print(thePath2.pop());
            if(!thePath2.isEmpty()){
                System.out.print(" -> ");
            }
        }
        System.out.println("(distance = " + dist[destinationNode2] + ")\n");
    }
        System.out.println("THIS CONCLUDES ALL POSSIBLE PATHS FROM SECOND START NODE TO EACH DESTINATION NODE");
    }
}
/*</listing>*/

