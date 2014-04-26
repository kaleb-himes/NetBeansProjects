/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Brendan
 */
public class TreeNode {
    String firstWord;
    String data;
    TreeNode parent;
    TreeNode left;
    TreeNode right;
    protected int column;
    protected int row;
    protected int center;

    public TreeNode(String d) {
        data = d;
        parent = null;
        left = null;
        right = null;
    }

    public String getData() {
        return data;
    }

    public void setParent(TreeNode n) {
        parent = n;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setLeft(TreeNode n) {
        left = n;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setRight(TreeNode n) {
        right = n;
    }

    public TreeNode getRight() {
        return right;
    }

    public TreeNode searchFrom(String value) {
        if (data == value) {
            return this;
        }
        if (value.charAt(0) < data.charAt(0)) {
            if (left == null) {
                return null;
            }
            return left.searchFrom(String.valueOf(value.charAt(0)));
        } else {
            if (right == null) {
                return null;
            }
            return right.searchFrom(String.valueOf(value.charAt(0)));
        }
    }

    public boolean searchForNode(TreeNode searchNode) {
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

    public String toString() {
        return "(" + data + ")";
    }
  
}
