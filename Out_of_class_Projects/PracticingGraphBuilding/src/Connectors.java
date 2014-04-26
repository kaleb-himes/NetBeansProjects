
public class Connectors<E> implements Comparable<Connectors<E>> {

    private Nodes<E> one, two;
    private int distance;

    /*this two-args constructor creates
     a Connector object to Connect two Nodes
     together with a standard distance of 0
     By using this constructor, it is assumed
     That distance is either weighted through the
     Nodes or otherwise is irrelevant
     */
    public Connectors(Nodes<E> one, Nodes<E> two) {
        this(one, two, 0);
    }

    public Connectors(Nodes<E> one, Nodes<E> two, int distance) {
        this.one = one;
        this.two = two;
        this.distance = distance;
    }

    //accessors and mutators
    public Nodes<E> getOne() {
        return one;
    }

    public Nodes<E> getTwo() {
        return two;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    //Two connectors are equal if the two Nodes
    //are equal and the distance is equal
    public boolean equals(Connectors<E> other) {
        return one.equals(other.getOne())
                && two.equals(other.getTwo())
                && distance == other.getDistance();
    }

    public String toString() {
        return "(" + one.getElem() + ", " + two.getElem() + "): " + distance;
    }

    public int compareTo(Connectors<E> other) {
        return this.distance - other.distance;
    }
}