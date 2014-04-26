package avl_lab;

public class Node {

    private int item;
    private Node left;
    private Node right;
    protected int column;
    protected int row;
    protected int center;

    public static final int BALANCED = 0;
    public static final int RIGHT_HEAVY = 1;
    public static final int LEFT_HEAVY = -1;
    public int balance = 0;

    Node(int a) {
        item = a;
    }

    public int getItem() {
        return item;
    }

    public void setRight(Node i) {
        right = i;
    }

    public void setLeft(Node i) {
        left = i;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
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

}
