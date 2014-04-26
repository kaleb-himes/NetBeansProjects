/**
 * @author Kaleb Out lab 1 CSCI 232 26 Jan 2014
 */
package outlab1;

import java.util.Random;

public class Driver {

    public static void main(String[] args) {

        Random r = new Random();
        Tree t = new Tree();
        int size = 10;
        Node[] array = new Node[size];
        for (int i = 0; i < size; i++) {
            array[i] = new Node(Integer.toString(r.nextInt(1000)));
            t.insert(array[i]);
            if(i == 0){
                
            }
            if(i == 1){
                Node x = new Node("this");
                t.insert(x);
            }
            if(i == 2){
                Node x = new Node("xerox");
                t.insert(x);
            }
            if(i == 3){
                Node x = new Node("aardvark");
                t.insert(x);
            }
            if(i == 4){
                Node x = new Node("zebra");
                t.insert(x);
            }
            if(i == 5){
                Node x = new Node("holy");
                t.insert(x);
            }
            if(i == 6){
                Node x = new Node("moly");
                t.insert(x);
            }
            if(i == 7){
                Node x = new Node("abera");
                t.insert(x);
            }
            if(i == 8){
                Node x = new Node("cadabera");
                t.insert(x);
            }
            if(i == 9){
                Node x = new Node("expialidocious");
                t.insert(x);
            }  
        }
        System.out.println("current tree:");
        PrintTree.printTree(t);
        try{
        for (int i = 0; i < 25; i++) {
            Random rand = new Random();
            int x = rand.nextInt(3);
            if(x == 1 && t.getRoot().getRight() != null){
            System.out.println("\nremoving: " + t.getRoot().getRight());
            t.delete(t.getRoot().getRight());
            System.out.println("new tree:");
            PrintTree.printTree(t);
            }
            else if(x == 2 && t.getRoot().getLeft() != null){
            System.out.println("\nremoving: " + t.getRoot().getLeft());
            t.delete(t.getRoot().getLeft());
            System.out.println("new tree:");
            PrintTree.printTree(t);
            }
            else if(x == 3 && t.getRoot() != null || x == 0 && t.getRoot() != null){
            System.out.println("\nremoving: " + t.getRoot());
            t.delete(t.getRoot());
            System.out.println("new tree:");
            PrintTree.printTree(t);
            }
        }
        }catch(java.lang.NullPointerException ex){}
    }
}
