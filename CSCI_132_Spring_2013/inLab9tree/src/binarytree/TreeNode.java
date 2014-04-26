/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author Brendan
 */
public class TreeNode {

    int data;
    TreeNode parent;
    TreeNode left;
    TreeNode right;
    int lineNum; // for printing

    public TreeNode(int d) {
        data = d;
    }

    public int getData() {
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
    
    public int getLineNum() {
        return lineNum;
    }
    
    public void setLineNum(int l) {
        lineNum = l;
    }
    
    public TreeNode searchFrom(int value) {
        if (data == value) {
            return this;
        }
        if (value < data) {
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
}
