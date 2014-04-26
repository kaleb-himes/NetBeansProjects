package theProgram;



import java.util.HashSet;
import java.util.Set;

/** A class for calling Dijkstra's algorithm.
 *  @author Koffman and Wolfgang
 */
public class DijkstrasAlgorithm {

    /*<listing chapter="10" number="7">*/
    /**
     * Dijkstra's Shortest-Path algorithm.
     * @param graph The weighted graph to be searched
     * @param start The start vertex
     * @param pred Output array to contain the predecessors
     *        in the shortest path
     * @param dist Output array to contain the distance
     *        in the shortest path
     */
    public static void dijkstrasAlgorithm(Graph graph,
            int start,
            int[] pred,
            double[] dist) {
        int numV = graph.getNumV();
        Set<Integer> vMinusS = new HashSet<Integer>(numV);
        // Initialize V�S.
        for (int i = 0; i < numV; i++) {
            if (i != start) {
                vMinusS.add(i);
            }
        }
        // Initialize pred and dist.
        pred[start] = -1;
        dist[start] = 0.0;
        for (int v : vMinusS) {
            if (graph.isEdge(start, v)) {
                dist[v] = graph.getEdge(start, v).getWeight();
                pred[v] = start;
            } else {
                pred[v] = -1;
                dist[v] = Double.POSITIVE_INFINITY;
            }
        }

        // Main loop
        while (! vMinusS.isEmpty()) {
            // Find the value u in V�S with the smallest dist[u].
            double minDist = Double.POSITIVE_INFINITY;
            int u = vMinusS.iterator().next();
            for (int v : vMinusS) {
                if (dist[v] < minDist) {
                    minDist = dist[v];
                    u = v;
                }
            }
            // Remove u from vMinusS.
            vMinusS.remove(u);
            // Update the distances.
            for (int v : vMinusS) {
                if (graph.isEdge(u, v)) {
                    double weight = graph.getEdge(u, v).getWeight();
                    if (dist[u] + weight < dist[v]) {
                        dist[v] = dist[u] + weight;
                        pred[v] = u;
                    }
                }
            }
        }
    }
    /*</listing>*/
}
