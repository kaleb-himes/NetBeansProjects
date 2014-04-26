
import java.util.ArrayList;


public class Graph<E> {

    //Because we will need random access to the Nodes
    //We will use an ArrayList to hold them
    private ArrayList<Nodes<E>> edges;

    public Graph() {
        edges = new ArrayList<Nodes<E>>();
    }

    //add Nodes to the List
    public boolean addNodes(Nodes<E> vertex) {
        if (edges.contains(vertex)) {
            return false;
        }
        edges.add(vertex);
        return true;
    }

    public boolean contains(Nodes<E> vertex) {
        return edges.contains(vertex);
    }

    public Nodes<E> get(int index) {
        return edges.get(index);
    }

    //returns number of Nodes in Graph
    public int count() {
        return edges.size();
    }

    public boolean equals(Graph<E> other) {

        if (other.edges.size() != edges.size()) {
            return false;
        }

        //store all of Nodess of larger Graph
        ArrayList<Nodes<E>> temp = new ArrayList<Nodes<E>>(other.edges);

        //if temp changed, then the Graphs are not equal
        return temp.retainAll(edges);
    }
}