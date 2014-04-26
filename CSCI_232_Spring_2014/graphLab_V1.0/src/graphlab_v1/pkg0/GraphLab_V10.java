package graphlab_v1.pkg0;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author kaleb.himes
 */
public class GraphLab_V10 {

    /**
     * @param args the command line arguments
     */
    public static int size;
    public static ArrayList<ArrayList<String>> matrix = new ArrayList<ArrayList<String>>();

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        BufferedReader br = new BufferedReader(new FileReader(s + "\\src\\graphlab_v1\\pkg0\\inputGraph.txt"));

        String fileLine = br.readLine();
        size = fileLine.length();
        while (fileLine != null) {         
            String[] tokens = fileLine.split("");
            ArrayList<String> row = new ArrayList<String>();
            for (int i = 0; i < tokens.length; i++) {
                if(!tokens[i].equals("")){
                    row.add(tokens[i]);
                }
            }
            matrix.add(row);
            fileLine = br.readLine();
        }
        printMatrix();
        BFS.Run();
        System.out.println();
        System.out.println();
        DFS.Run();
    }
    public static void printMatrix(){
        for(int i = 0; i < size; i++){
            System.out.print("[");
            for(int j = 0; j < size; j++){
                System.out.print("[" +matrix.get(i).get(j) +"]");
            }
            System.out.println("]");
        }
    }
}
