package graphlab_21mar2014_cs_232;

/**
 *
 * @author Kaleb
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Floyd_Warshall {
    public static int size = 0;
    public static String[] tokens;
    public static ArrayList<Integer> edges = new ArrayList<>();
    public static int[][] crossClass;
    
    public static int[][] shortestpath(int[][] adjacent, int[][] path) {
        int n = adjacent.length;
        int[][] temp = new int[n][n];
    	// use a temp array so that the adjacency matrix isn't destroyed.
        temp(temp, adjacent);

        // Compute successively better paths through vertex k.
        for (int k = 0; k < n; k++) {

            // check each pair of vertex's
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    if (temp[i][k] + temp[k][j] < temp[i][j]) {
                        temp[i][j] = temp[i][k] + temp[k][j];
                        path[i][j] = path[k][j];
                    }
                }
            }
        }

        // Return the temp array for processing.
        return temp;
    }

    // Copies the contents of array b into array a. (assuming both are same size arrays)
    public static void temp(int[][] a, int[][] b) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = b[i][j];
            }
        }
    }

    // Returns the smaller of a and b.
    public static int minimum(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static void Run() throws FileNotFoundException, IOException {

        // Tests out algorithm with graph provided named graph.txt 
        // File must be placed in the src\graphlab_21mar2014_cs_232 file
        
        File file = new File("src\\graphlab_21mar2014_cs_232\\graph.txt");
        BufferedReader readFile = new BufferedReader(new FileReader(file));
        int line = 0;
        
        
        for (String x = readFile.readLine(); x != null ; x = readFile.readLine()) {
            line++;
            System.out.println(x);
                if (line <= 3) {
                    tokens = x.split(" ");
                    size = tokens.length;
                }
        }
    
    
        //size = convertA.length();
        System.out.println("size now equals " + size);
        //set the size of the matrix based on the text file
        //close the file, close the scanner
        readFile.close();
        
        int[][] matrix = new int[size][size];
        int[][] shortpath = new int[size][size];
        int[][] path = new int[size][size];

        //open the file again to be read a second time
        File fileAgain = new File("src\\graphlab_21mar2014_cs_232\\graph.txt");
        Scanner readAgain = new Scanner(fileAgain);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int x = readAgain.nextInt();
                matrix[i][j] = x;
            }
        }
        readAgain.close();
        
        processMatrix(matrix, path, shortpath);
    }
    
    public static void processMatrix(int[][] matrix, int[][] path, int[][] shortpath){
        int sizeOfArray = size;
        System.out.println("length = " + sizeOfArray);
    	// Initialize with the previous vertex for each edge. -1 indicates
        // no such vertex.
        for (int i = 0; i < sizeOfArray; i++) {
            for (int j = 0; j < sizeOfArray; j++) {
                if (matrix[i][j] == 10000) {
                    path[i][j] = -1;
                } else {
                    path[i][j] = i;
                }
            }
        }

        // This means that we don't have to go anywhere to go from i to i.
        for (int i = 0; i < sizeOfArray; i++) {
            path[i][i] = i;
        }

        shortpath = shortestpath(matrix, path);
        crossClass = shortpath;
        // Prints out shortest distances.
        for (int i = 0; i < sizeOfArray; i++) {
            for (int j = 0; j < sizeOfArray; j++) {
                System.out.print(shortpath[i][j] + " ");
            }
            System.out.println();
        }
        int start = 0;
        int end = 0;
        
        for (int head = 0; head < matrix.length; head++) {
            for (int tail = 0; tail < matrix.length; tail++) {
                start = head;
                end = tail;
                // The path will always terminate at tail.
                String myPath = ((char)(end+65)) + "";
                //store the tail as a node in edges
                edges.add(end);
                // keep running till we reach the end
                while (path[start][end] != start) {
                    int convert = path[start][end];
                    edges.add(convert);
                    myPath = ((char)(convert + 65)) + " -> " + myPath;
                    end = path[start][end];
                }

                // add start and print
                myPath = ((char)(start+65)) + " -> " + myPath;
                edges.add(start);
                System.out.println("Here is the path from " + ((char)(head+65)) +" to " + ((char)(tail+65)));
                System.out.println("Path = " + myPath);
            }
        }
        Option(shortpath);
    }
    
    public static void Option(int[][] shortpath) throws ArrayIndexOutOfBoundsException{
        System.out.println("That concludes Floyd-Warshall's Algorithm.");
        System.out.println("Which algorithm would you like to run next, type 1 for Prims, 2 for Dijkstras, 3 for floyds");
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        try{
        choice = sc.nextInt();
        }catch(java.util.InputMismatchException ex){
            System.out.println("I sincerely apologize, I did not recognize that input. Please try again.");
            System.out.println("1. To run Prims\n2. To run Dijkstras,\n3. To run Floyds");
            Option(shortpath);
        }
        
        if(choice == 1){
            WeightedGraph G = new WeightedGraph(size);
            for(int i = 0; i < size; i++){
                Prims.prims(G, i);
            }
            
        }else if(sc.nextInt() == 2){
            
        }else if(sc.nextInt() == 3){
            
        }
    }
}
