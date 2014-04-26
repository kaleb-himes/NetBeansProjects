/**
 * @author Kaleb Out lab 1 CSCI 232 26 Jan 2014
 */
package outlab1;

public class Tree {

    private Node root;
    private int numNodes;

    public Tree() {
        root = null;
        numNodes = 0;
    }

    public void insert(Node n) {
        numNodes++;
        if (root == null) {
            root = n;
            return;
        }
        //the root exists
        Node curNode = root;
        while (true) {
            try{
            int x = Integer.parseInt(n.getData());
            int curData = Integer.parseInt(curNode.getData());
            
            if (x <= curData) {
                if (curNode.getLeft() == null) {
                    curNode.setLeft(n);
                    n.setParent(curNode);
                    return;
                }
                curNode = curNode.getLeft();
            } else {
                if (curNode.getRight() == null) {
                    curNode.setRight(n);
                    n.setParent(curNode);
                    return;
                }
                curNode = curNode.getRight();
            }
            }catch(java.lang.NumberFormatException ex){
                // "a"'s int value is 97
                int firstLetter = curNode.getData().charAt(0) - 97; 
                int x = n.getData().charAt(0) - 97;
                
                if (x <= firstLetter) {
                if (curNode.getLeft() == null) {
                    curNode.setLeft(n);
                    n.setParent(curNode);
                    return;
                }
                curNode = curNode.getLeft();
            } else {
                if (curNode.getRight() == null) {
                    curNode.setRight(n);
                    n.setParent(curNode);
                    return;
                }
                curNode = curNode.getRight();
            }
            }
        }
    }

    public int getNumNodes() {
        return numNodes;
    }

    public Node getRoot() {
        return root;
    }

    public Node search(int value) {
        if (root == null) {
            return null;
        }
        return root.searchFrom(value);
    }

    public int depth() {
        if (root == null) {
            return 0;
        }
        return root.findMaxDepth();
    }

    public void delete(Node n) {
        if (root == null) {
            System.out.println("Error: no nodes, tree is empty");
            return;
        }
        if (!root.searchForNode(n)) {
            System.out.println("Error: trying to delete a non-existent node (" + n + ")" + this);
            return;
        }
        numNodes--;

        Node parent = n.getParent();

        // n has no children
        if (n.getLeft() == null && n.getRight() == null) {
            if (parent == null) {
                root = null;
                return;
            }
            if (n == parent.getLeft()) {
                parent.setLeft(null);
                return;
            } else {
                parent.setRight(null);
                return;
            }
        }

        // n has a single child
        if (n.getLeft() == null || n.getRight() == null) {
            Node child;
            if (n.getLeft() != null) {
                child = n.getLeft();
            } else {
                child = n.getRight();
            }
            if (parent != null) {
                if (n == parent.getLeft()) {
                    parent.setLeft(child);
                    child.setParent(parent);
                    return;
                } else {
                    parent.setRight(child);
                    child.setParent(parent);
                    return;
                }
            } else {
                root = child;
                root.setParent(null);
                return;
            }
        }

        // n has two children
        Node predecessor = n.getLeft();
        while (predecessor.getRight() != null) {
            predecessor = predecessor.getRight();
        }

        Node predParent = predecessor.getParent();
        if (predParent != n) {
            predParent.setRight(predecessor.getLeft());
        } else {
            predParent.setLeft(predecessor.getLeft());
        }
        if (predecessor.getLeft() != null) {
            predecessor.getLeft().setParent(predParent);
        }

        if (parent != null) {
            if (n == parent.getLeft()) {
                parent.setLeft(predecessor);
            } else {
                parent.setRight(predecessor);
            }
        } else {
            root = predecessor;
            root.setParent(null);
        }
        predecessor.setParent(parent);
        predecessor.setLeft(n.getLeft());
        if (predecessor.getLeft() != null) {
            predecessor.getLeft().setParent(predecessor);
        }
        predecessor.setRight(n.getRight());
        if (predecessor.getRight() != null) {
            predecessor.getRight().setParent(predecessor);
        }
    }
}