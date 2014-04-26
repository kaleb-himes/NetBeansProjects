package graphlab_v1.pkg0;

/**
 *
 * @author Kaleb
 */
public class DFS extends GraphLab_V10 {
    /*
     1   procedure DFS(G,v):
     2      label v as discovered
     3      for all edges from v to w in G.adjacentEdges(v) do
     4          if vertex w is not labeled as discovered then
     5              recursively call DFS(G,w)
     */

    public static int n = matrix.size(); //number of vertices in the graph

    public static void Run() {
        System.out.println("**running depth first search...");
        depthFirstSearch(0);
        System.out.println("The matrix has been depth first searched, Hooray!");
    }

    public static void depthFirstSearch(int u) {
        //LABEL VERTEX AS DISCOVERED
        boolean[][] M = new boolean[n][n];// adjacency matrix (can have at most 128 vertices)
        boolean[] seen = new boolean[n];// which vertices have been visited by dfs()
        seen[u] = true;
        String x = String.valueOf(Character.toChars(u + 65));
        for (int v = 0; v < n; v++) {
            //if seen position is false and M position is true then run method again
            if (!seen[v] && M[u][v]) {
                
                //IF VERTEX IS NOT LABELED AS DISCOVERED THEN CALL DFS ON IT
                depthFirstSearch(v);
            }

//            System.out.println("*"+ u +"* = u");
//            System.out.println("*"+ v +"* = v");


//            char c[] = Character.toChars(y);
//            System.out.println(c + " has been visited, continue");
        }
        if (u < size - 1) {
            
            u++;
            depthFirstSearch(u);
        } 
        System.out.println("*" + x + " had no new children, pop");
    }

}
