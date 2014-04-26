/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Brendan
 */
public class BinaryTree extends Driver{

    TreeNode root;
    int numNodes;

    public BinaryTree() {
        root = null;
        numNodes = 0;
    }

    public void insert(TreeNode n) {
        numNodes++;
        if (root == null) {
            root = n;
            return;
        }
        TreeNode curNode = root; // root is not null
        
        while (true) {
            int i = r.nextInt(2);
            if (i == 1) {
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

    public int getNumNodes() {
        return numNodes;
    }

    public TreeNode getRoot() {
        return root;
    }

    public TreeNode search(String value) {
        if (root == null) {
            return null;
        }
        return root.searchFrom(String.valueOf(value.charAt(0)));
    }
    
    public int depth() {
        if (root == null) {
            return 0;
        }
        return root.findMaxDepth();
    }

    public void delete(TreeNode n) {
        if (root == null) {
            System.out.println("Error: trying to delete a node from an empty tree");
            return;
        }
        if (!root.searchForNode(n)) {
            System.out.println("Error: trying to delete a node (" + n + ") that does not exist in tree " + this);
            return;
        }
        numNodes--;

        TreeNode parent = n.getParent();

        // case 1: n is a leaf
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

        // case 2: n has a single descendant
        if (n.getLeft() == null || n.getRight() == null) {
            TreeNode child;
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

        // case 3: n has two descendants
        TreeNode predecessor = n.getLeft();
        while (predecessor.getRight() != null) {
            predecessor = predecessor.getRight();
        }

        TreeNode predParent = predecessor.getParent();
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

    
    // Tree traversal methods:
    
    public static void preOrderTraversalSearch(TreeNode n) {
        boolean match = false;
        if (n != null && match == false) {
            String data = n.getData();        
            if(data.substring(0, data.indexOf(" ")).equals(dictionaryUI.lookupField.getText())){
                dictionaryUI.deffinitionReturnTA.setText(data);
                match = true;
            } 
        }
        if (n != null && n.getLeft() != null && match == false) {
            preOrderTraversalSearch(n.getLeft());
        }
        if (n != null && n.getRight() != null && match == false) {
            preOrderTraversalSearch(n.getRight());
        }
    }
     public static void preOrderTraversalReset(TreeNode n) {
            
            if (n != null) {
                Driver.dictionary.delete(n);
            }
            if (n != null && n.getLeft() != null) {
                preOrderTraversalReset(n.getLeft());
            }
            if (n != null && n.getRight() != null) {
                preOrderTraversalReset(n.getRight());
            }
        }
    public static void inOrderTraversal(TreeNode n) {
        if (n != null && n.getLeft() != null) {
            inOrderTraversal(n.getLeft());
        }
        if (n != null) {
            System.out.print(" " + n.getData());
        }
        if (n != null && n.getRight() != null) {
            inOrderTraversal(n.getRight());
        }
    }

    public static void postOrderTraversal(TreeNode n) {
        if (n != null && n.getLeft() != null) {
            postOrderTraversal(n.getLeft());
        }
        if (n != null && n.getRight() != null) {
            postOrderTraversal(n.getRight());
        }
        if (n != null) {
            System.out.print(" " + n.getData());
        }
    }
}
