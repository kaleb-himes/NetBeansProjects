package intergalacticNavigationProgramming;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Brendan
 */

/**
 * Program to solve a maze represented as a graph. This program performs a
 * breadth-first search of the graph to find the "shortest" path from the start
 * vertex to the end. It is assumed that the start vertex is 0, and the end
 * vertex is numV-1.
 *
 * @author Koffman and Wolfgang
 */
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * Program to solve a maze represented as a graph. This program performs a
 * breadth-first search of the graph to find the "shortest" path from the start
 * vertex to the end. It is assumed that the start vertex is 0, and the end
 * vertex is numV-1.
 *
 * @author Koffman and Wolfgang
 */
public class TestDijkstra {
    static double startHeading;
    static double firstDistance;
    /**
     * Main method to solve the maze. pre: args[0] contains the name of the
     * input file.
     *
     * @param args Command line argument
     */
    public static void run() {
        int numV = 0; // The number of vertices.
        Graph theGraph = null;
        // Load the graph data from a file.
        try {
            Scanner scan = new Scanner(new FileReader("src\\nodesAndWeights.txt"));
            theGraph = AbstractGraph.createGraph(scan, false, "Matrix");
            numV = theGraph.getNumV();
        } catch (IOException ex) {
            System.err.println("IO Error while reading graph");
            System.err.println(ex.toString());
            System.exit(1);
        }
        // Perform Dijkstra's algorithm:
        int startNode1 = PBA.getNode(GalaxyMapGUI.StartLocationTF.getText());

//        int start = 0; // starting  vertex
        int parent[] = new int[numV];
        double dist[] = new double[numV];
        DijkstrasAlgorithm.dijkstrasAlgorithm(theGraph, startNode1, parent, dist);

        /*
         * This is a random method used for generatig encryption keys in security software,
         * It is much more "Random" then the math.Random()
         * I found this method while building my galaxy program.
         */
        GalaxyMapGUI.RouteInstructionsTA.append("ROUTE CALCULATION SUCCESSFUL\n\n");
        int destinationNode1 = PBA.getNode(GalaxyMapGUI.destinationTF.getText());
        // Construct the first path.
        Deque<Integer> thePath1 = new ArrayDeque<Integer>();
        int v = destinationNode1;
        while (parent[v] != -1) {
            thePath1.push(new Integer(v));
            v = parent[v];
        }
        // Output the path.
        int numberOfStops = 1;
        
        
        try{
         startHeading = CalculateHeading.computeHeading(PBA.getPOBAN(startNode1), PBA.getPOBAN(thePath1.peek()));
        }catch(java.lang.NullPointerException ex){
            GalaxyMapGUI.RouteInstructionsTA.setText("I'm so sorry, you lose again, pick a real start and destination"
                    + " or we'll never get out of here!\n\n");
        }
        GalaxyMapGUI.RouteInstructionsTA.append("The optimum route starting from "
                + PBA.getPOBAN(startNode1)
                + " to " + PBA.getPOBAN(destinationNode1) + " is as follows:\n\n");

        
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);
        df.setMinimumIntegerDigits(1);
        try{
         firstDistance = dist[thePath1.peek()];
        }catch(java.lang.NullPointerException ex){
            
        }
        GalaxyMapGUI.RouteInstructionsTA.append(numberOfStops + ". Start at : "
                + PBA.getPOBAN(startNode1) + ", leave on a heading of " + df.format(startHeading) 
                + " travel a distance of " + df.format(firstDistance) + "\n\n");

        numberOfStops++;
        
        while (!thePath1.isEmpty() && thePath1.peek() != thePath1.peekLast()) {
            int firstPlanet = thePath1.pop();
            double distanceSoFar = dist[firstPlanet];
            int nextStop = thePath1.peek();
            double nextLeg = dist[nextStop];
            double heading = CalculateHeading.computeHeading(PBA.getPOBAN(firstPlanet), PBA.getPOBAN(nextStop));
            GalaxyMapGUI.RouteInstructionsTA.append(numberOfStops + ". Go To: "
                    + PBA.getPOBAN(firstPlanet) + ", change heading to " + df.format(heading)
                    + " travel a distance of " + df.format(nextLeg-distanceSoFar) + "\n");

            numberOfStops++;

            if (!thePath1.isEmpty()) {
                GalaxyMapGUI.RouteInstructionsTA.append("\n");
            }
        }
        if (thePath1.peek() == thePath1.peekLast()) {
            GalaxyMapGUI.RouteInstructionsTA.append(numberOfStops + ". Arrive final destination: "
                    + PBA.getPOBAN(thePath1.pop())+"\n");
        }
        double totalDistance = dist[destinationNode1];
        GalaxyMapGUI.RouteInstructionsTA.append("\n(Total Distance Will Be : " + df.format(totalDistance) + ")\n");

        GalaxyMapGUI.RouteInstructionsTA.append("\n\nTHIS CONCLUDES ROUTE CALCULATIONS,\n"
                + "IT IS NOT NECESSARY, BUT CONSIDER REBOOTING PROGRAM BEFORE NEXT ROUTE CALCULATION. \n"
                + " HEAVENLY BODIES ARE CONSTANTLY IN MOTION AND WE CANNOT BE HELD RESPONSIBLE \n"
                + "IN THE EVENT OF AN UNLIKELY DEATH DUE TO ROUTES CALCULATED WITH OLD DATA.\n"
                + "THANKYOU AND HAVE A WONDERFUL JOURNEY!\n"
                + "\n\n P.S. If you failed to select a proper start destination \n"
                + "it's assumed that you are at the default planet.\n"
                + "Therefore we started you from the default planet =)");
    }
}
/*</listing>*/