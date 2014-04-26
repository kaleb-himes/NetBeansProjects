package avl_lab;

/**
 * @author Kaleb 
 * @project Out lab 1 
 * @class CSCI 232 
 * @date 26 Jan 2014
 */

public class PrintTree {

    public static int curCol;
    public static char[][] board;

    public static int findWidth(Node n, int depth, int colOffset) {
        int lwidth = 0;
        int rwidth = 0;
        if (n.getLeft() != null) {
            lwidth = findWidth(n.getLeft(), depth + 1, colOffset);
        }
        if (n.getRight() != null) {
            rwidth = findWidth(n.getRight(), depth + 1, colOffset + lwidth + 2);
        }
        char[] data = ("" + n.getItem()).toCharArray();
        int width = Math.max(lwidth + rwidth + 2, data.length + 2);


        n.column = colOffset + width / 2 - data.length / 2 - 1;
        n.center = n.column + 1 + data.length / 2;
        n.row = 4 * depth;

        return width;
    }

    public static void printNode(Node n) {
        char[] data = ("" + n.getItem()).toCharArray();
        for (int i = 0; i < data.length; i++) {
            board[n.row][n.column + i + 1] = data[i];
        }
        board[n.row][n.column] = '(';
        board[n.row][n.column + data.length + 1] = ')';

        if (n.getLeft() != null) {
            printNode(n.getLeft());
        }
        if (n.getRight() != null) {
            printNode(n.getRight());
        }
    }

    public static void fillEdge(Node n) {
        if (n.getLeft() != null) {
            board[n.row + 1][n.center] = '|';
            board[n.row + 2][n.center] = '<';
            board[n.getLeft().row - 2][n.getLeft().center] = '|';
            board[n.getLeft().row - 1][n.getLeft().center] = '|';
            for (int j = n.getLeft().center + 1; j < n.center; j++) {
                board[n.getLeft().row - 2][j] = '<';
            }
            fillEdge(n.getLeft());
        }
        if (n.getRight() != null) {
            board[n.row + 1][n.center] = '|';
            board[n.row + 2][n.center] = '>';
            board[n.getRight().row - 2][n.getRight().center] = '|';
            board[n.getRight().row - 1][n.getRight().center] = '|';
            for (int j = n.center + 1; j < n.getRight().center; j++) {
                board[n.getRight().row - 2][j] = '>';
            }
            fillEdge(n.getRight());
        }

    }

    public static void printTree(AVLTree tree) {

        if (tree.getRoot() == null) {
            System.out.println("(null)");
            return;
        }
        int width = findWidth(tree.getRoot(), 0, 0);
        int depth = 4 * tree.depth() - 3;

        board = new char[depth][width];
        for (int i = 0; i < depth; i++) {
            for (int j = 0; j < width; j++) {
                board[i][j] = ' ';
            }
        }
        if (tree.getRoot() != null) {
            printNode(tree.getRoot());
            fillEdge(tree.getRoot());

            for (int i = 0; i < depth; i++) {
                for (int j = 0; j < width; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
        }
    }
}