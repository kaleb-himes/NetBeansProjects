/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

public class Nodes<E> {

    private static int ID = 0; //counts how many Nodes exist
    /*
     When working with weighted Graphs,
     having an element becomes important.
     For example, in game programming, the
     weights could represent a lag or a hidden
     bonus that could make winning significantly
     easier.
     */
    private E elem;
    private int id; //the individual Nodes identifier
    private int weight;
    //holds Pointer objects, which reference other Nodes
    private LinkedList<Connectors<E>> pointers;

    //constructors
    public Nodes() {
        //invoke constructor to initialize elem to null pointer
        this(null, Integer.MAX_VALUE);
    }

    public Nodes(E elem, int distance) {
        this.elem = elem;
        id = ID++; //assign indv id and increment static ID counter
        pointers = new LinkedList<Connectors<E>>();
        this.weight = distance;
    }

    //accessors and mutators
    public int getId() {
        return id;
    }

    public E getElem() {
        return elem;
    }

    public void setElem(E elem) {
        this.elem = elem;
    }

    public int getDistance() {
        return weight;
    }

    public void setDistance(int dist) {
        weight = dist;
    }

    //add a connection not taking distances into account
    public void connectTo(Nodes<E> other) {
        Connectors<E> c = new Connectors<E>(this, other);

        //prevents adding duplicate connectors
        if (!pointers.contains(c)) {
            pointers.add(c);
        }

        //reference Connector in other Nodes as well
        LinkedList<Connectors<E>> conn = other.getConnections();
        if (!conn.contains(c)) {
            conn.add(c);
        }
    }

    public void connectTo(Nodes<E> other, int distance) {
        Connectors<E> c = new Connectors<E>(this, other, distance);
        if (!pointers.contains(c)) {
            pointers.add(c);
        }
    }

    public LinkedList<Connectors<E>> getConnections() {
        return pointers;
    }

    public void sortConnections() {
        Collections.sort(pointers);
    }

    public Iterator<Connectors<E>> iterator() {
        return pointers.iterator();
    }

    //one Nodes is equal to another if the two elems are equal to each other
    //and they have the same Connections
    public boolean equals(Nodes<E> other) {

        if (other.pointers.size() != pointers.size()) {
            return false;
        }

        LinkedList<Connectors<E>> temp = new LinkedList<Connectors<E>>(pointers);

        //if the elems are equal and the Lists are equal, regardless of order
        //then the Nodes are equal
        return elem.equals(other.getElem())
                && temp.retainAll(other.pointers);
    }

    public String toString() {
        return this.elem.toString();
    }
}