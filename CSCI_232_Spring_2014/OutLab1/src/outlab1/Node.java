/**
 * @author Kaleb Out lab 1 CSCI 232 26 Jan 2014
 */
package outlab1;

public class Node {

    private String data;
    private Node parent;
    private Node left;
    private Node right;
    protected int column;
    protected int row;
    protected int center;

    public Node(String d) {
        data = d;
        parent = null;
        left = null;
        right = null;
    }
    
    public String getData() {
        return data;
    }

    public void setParent(Node n) {
        parent = n;
    }

    public Node getParent() {
        return parent;
    }

    public void setLeft(Node n) {
        left = n;
    }

    public Node getLeft() {
        return left;
    }

    public void setRight(Node n) {
        right = n;
    }

    public Node getRight() {
        return right;
    }

    public Node searchFrom(int value) {
        int x = Integer.parseInt(data);
        if (x == value) {
            return this;
        }
        if (value < x) {
            if (left == null) {
                return null;
            }
            return left.searchFrom(value);
        } else {
            if (right == null) {
                return null;
            }
            return right.searchFrom(value);
        }
    }

    public boolean searchForNode(Node searchNode) {
        if (this == searchNode) {
            return true;
        }
        if (left != null && left.searchForNode(searchNode)) {
            return true;
        }
        if (right != null && right.searchForNode(searchNode)) {
            return true;
        }
        return false;
    }

    public int findMaxDepth() {
        int lmax = 0;
        int rmax = 0;
        if (left != null) {
            lmax = left.findMaxDepth();
        }
        if (right != null) {
            rmax = right.findMaxDepth();
        }
        return 1 + Math.max(lmax, rmax);
    }

    @Override
    public String toString() {
        return "(" + data + ")";
    }
}
