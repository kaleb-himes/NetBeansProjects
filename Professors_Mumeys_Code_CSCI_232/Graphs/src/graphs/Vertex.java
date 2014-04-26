/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

/**
 *
 * @author Brendan
 */
public class Vertex {
    private String id;
    public boolean visited;
    public Vertex bfsPred;
    private int index;
    
    public Vertex(String id, int index) {
        this.id = id;
        this.index = index;
        bfsPred = null;
    }
    
    public String toString() {
        return id;
    }
    
    public int getIndex() {
        return index;
    }
}
