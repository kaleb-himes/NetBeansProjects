/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author Brendan
 */
public class BinaryTree {

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
            if (n.getData() <= curNode.getData()) {
                if (curNode.getLeft() == null) {
                    curNode.setLeft(n);
                    return;
                }
                curNode = curNode.getLeft();
            } else {
                if (curNode.getRight() == null) {
                    curNode.setRight(n);
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
    public TreeNode nonRecursiveSearch(int value){
        for(int i=0; i<root.getLineNum(); i++){
            root.getData();
        }
        return root.searchFrom(value);
}
    public TreeNode search(int value) {
        if (root == null) {
            return null;
        }
        return root.searchFrom(value);
    }
}