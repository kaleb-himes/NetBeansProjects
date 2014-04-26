/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphlab_21mar2014_cs_232;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kaleb
 */
public class WeightedGraph extends Floyd_Warshall {
  
     private int [][]  edges;  // adjacency matrix
     private Object [] labels;
  
     public WeightedGraph (int n) {
        edges  = new int [n][n];
        labels = new Object[n];
     }

    /**
     *
     * @return
     */
    public int size() { return labels.length; }
  
     public void   setLabel (int vertex, Object label) { labels[vertex]=label; }
     public Object getLabel (int vertex)               { return labels[vertex]; }
  
     public void    addEdge    (int source, int target, int w)  { edges[source][target] = w; }
     public boolean isEdge     (int source, int target)  { return edges[source][target]>0; }
     public void    removeEdge (int source, int target)  { edges[source][target] = 0; }
     public int     getWeight  (int source, int target)  { return edges[source][target]; }
  
     public int[] neighbors(int vertex) {
        int count = 0;
        for (int i=0; i<edges[vertex].length; i++) {
           if (edges[vertex][i]>0) count++;
        }
        final int[]answer= new int[count];
        count = 0;
        for (int i=0; i<edges[vertex].length; i++) {
           if (edges[vertex][i]>0) answer[count++]=i;
        }
        
        return answer;
        
     }
  
     public void print () {
        for (int j=0; j<edges.length; j++) {
           System.out.print (labels[j]+": ");
           for (int i=0; i<edges[j].length; i++) {
              if (edges[j][i]>0) System.out.print (labels[i]+":"+edges[j][i]+" ");
           }
           System.out.println ();
        }
     }
  
     public static void main (String args[]) throws FileNotFoundException {
        final WeightedGraph t = new WeightedGraph (6);
         File file = new File("src\\graphlab_21mar2014_cs_232\\graph.txt");
        Scanner scan = new Scanner(file);
        int line = 0;
        while(scan.hasNextLine() == true){
            t.setLabel(line, "v" + Integer.toString(line));
            line++;
        }
        scan.close();
        for(int i = 0; i < Floyd_Warshall.edges.size(); i++){
            int x = Floyd_Warshall.edges.get(i);
            for(int j = 0; j < Floyd_Warshall.edges.size(); j++){
                t.addEdge(x, x+1, Floyd_Warshall.crossClass[i][j+1]);
            }
        }
        t.print();
  
        final int[] pred = Dijkstras.dijkstra (t, 0);
        for (int n=0; n<6; n++) {
           Dijkstras.printPath (t, pred, 0, n);
        }
     }
  
  }
