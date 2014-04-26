/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Brendan
 */
package binarytree;

import java.util.Random;

public class Driver {

    public static void main(String[] args) {

        Random r = new Random();
        BinaryTree t = new BinaryTree();
        int size = 10;
        TreeNode[] array = new TreeNode[size];

        for (int i = 0; i < size; i++) {
            array[i] = new TreeNode(r.nextInt(1000));
            t.insert(array[i]);
        }
        System.out.println("current tree:");
        PrintTree2.printTree(t);

        System.out.println("Pre-order traversal: ");
        BinaryTree.preOrderTraversal(t.getRoot());
        System.out.println();
        System.out.println("In-order traversal: ");
        BinaryTree.inOrderTraversal(t.getRoot());
        System.out.println();
        System.out.println("Post-order traversal: ");
        BinaryTree.postOrderTraversal(t.getRoot());
        System.out.println();

//        for (int i = 0; i < size; i++) {
//            System.out.println("\ndeleting " + array[i] + "...");
//            t.delete(array[i]);
//            System.out.println("current tree:");
//            PrintTree2.printTree(t);
//        }

//        int searchValue = r.nextInt(10);
//        System.out.println("searchvalue = " + searchValue);
//        System.out.println(t.search(searchValue));
    }
}
