/**
 * @Kaleb
 * OutLab 1
 * 26 Jan 2014
 */
package binarytree;

public class PrintTree {

    // some static variables for printing:
    public static int curLine;
    public static char[][] line;

    public static void recFillNodes(TreeNode n, String prefix) {
        // print nodes belonging to subtree of this node

        if (n.getRight() != null) {
            recFillNodes(n.getRight(), prefix + "  ");
        }
        n.setLineNum(curLine);
        line[curLine++] = (prefix + n.getData()).toCharArray();

        if (n.getLeft() != null) {
            recFillNodes(n.getLeft(), prefix + "  ");
        }
    }

    public static void recFillEdges(TreeNode n, int d) {
        // print nodes belonging to subtree of this node

        if (n.getRight() != null) {
            line[n.getRight().getLineNum()][2 * d] = '+';
            line[n.getRight().getLineNum()][2 * d + 1] = '|';
            for (int j = n.getRight().getLineNum() + 1; j < n.getLineNum(); j++) {
                line[j][2 * d] = '-';
            }
            recFillEdges(n.getRight(), d + 1);
        }
        if (n.getLeft() != null) {
            line[n.getLeft().getLineNum()][2 * d] = '+';
            line[n.getLeft().getLineNum()][2 * d + 1] = '|';
            for (int j = n.getLineNum() + 1; j < n.getLeft().getLineNum(); j++) {
                line[j][2 * d] = '-';
            }
            recFillEdges(n.getLeft(), d + 1);
        }
    }

    public static void printTree(BinaryTree tree) {
        // idea: post order traversal
        curLine = 0;
        line = new char[tree.getNumNodes()][];

        if (tree.getRoot() != null) {
            recFillNodes(tree.getRoot(), "");
            recFillEdges(tree.getRoot(), 0);
            int maxLength = 0;
            for (int i = 0; i < tree.getNumNodes(); i++) {
                maxLength = Math.max(maxLength, line[i].length);
            }
            for (int j = 0; j < maxLength; j++) {
                for (int i =  tree.getNumNodes() - 1; i >=0; i--) {
                    if (j < line[i].length) {
                        System.out.print(line[i][j]);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
