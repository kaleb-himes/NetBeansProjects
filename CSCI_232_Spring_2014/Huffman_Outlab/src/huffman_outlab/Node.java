package huffman_outlab;

import java.util.Comparator;
/**
 *
 * @author Kaleb
 */
class Node {
 
    public char key;
    public int occurances;
    public Node left, right;
 
    public Node(char a, int f) {
        key = a;
        occurances = f;
    }
 
    public Node() {
 
    }
 
    public String toString() {
        return key + " " + occurances;
    }
 
}
 
class FrequencyComparator implements Comparator<Node> {
 
    public int compare(Node a, Node b) {
        int occurancesOfA = a.occurances;
        int occurancesOfB = b.occurances;
 
        return occurancesOfA-occurancesOfB;
    }
 
}