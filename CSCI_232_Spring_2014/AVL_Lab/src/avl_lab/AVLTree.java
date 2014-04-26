package avl_lab;

import java.util.*;

/**
 * @author Hunter
 * @project Out lab 2
 * @class CSCI 232
 * @date 12 Feb 2014
 */
public class AVLTree {

    private Node root;
    private boolean increase;
    private boolean decrease;
    private boolean addReturn;
    private Scanner stop;

    public AVLTree() {
        root = null;
        addReturn = false;
        increase = false;
        stop = new Scanner(System.in);
    }

    public Node getRoot() {
        return root;
    }
    public int depth() {
        if (root == null) {
            return 0;
        }
        return root.findMaxDepth();
    }

    public boolean add(int item) {

        System.out.println("Starting to search for a a place to put " + item);
        increase = false;
        root = add(root, item);
        return addReturn;
    }

    private Node add(Node localRoot, int item) {

        if (localRoot == null) {
            addReturn = true;
            increase = true;
            System.out.println("Added " + item);
            return new Node(item);
        }
        System.out.println("Add called with " + localRoot.getItem() + " as the root.");
        if (item == localRoot.getItem()) {                                //item is already in tree
            increase = false;
            addReturn = false;
            return localRoot;
        } else if (item < localRoot.getItem()) {
            System.out.println("Branching left");						                        // item < data
            localRoot.setLeft(add(localRoot.getLeft(), item));

            if (increase) {
                decrementBalance(localRoot);
                if (localRoot.balance < Node.LEFT_HEAVY) {
                    increase = false;
                    return rebalanceLeft(localRoot);
                }
            }

            return localRoot;                                            // Rebalance not needed.
        } else {
            System.out.println("Branching right");                                                                   // item > data
            localRoot.setRight(add(localRoot.getRight(), item));
            if (increase) {
                incrementBalance(localRoot);
                if (localRoot.balance > Node.RIGHT_HEAVY) {
                    return rebalanceRight(localRoot);
                } else {
                    return localRoot;
                }
            } else {
                return localRoot;
            }
        }

    }

    private void decrementBalance(Node node) {
        node.balance--;
        if (node.balance == Node.BALANCED) {
            increase = false;
        }
    }

    private Node rebalanceRight(Node localRoot) {

        // Obtain reference to right child
        Node peekRight = localRoot.getRight();

        // See if right-left heavy 
        //I believe this line should be interpreted as 
        //"see if right heavy OR left heavy?
        if (peekRight.balance != 0) {
            /* Adjust the balances to be their new values after
             the rotates are performed. 
             */

            if (peekRight.balance < 0) {
            //negative balance on b = left heavy situation
            /*
                 ----------------  problem Node being inserted = ?
                 |    a         |  a = 2  after--> a = 0
                 |     \        |  b = +/- 1       b = 0
                 |      b       |
                 |     / \      |
                 |    ?   ?     |
                 ----------------
                 */
                //change values here before rotation
                //we have a right then left error
                //local root(a) balance - 2, right child + 1
                localRoot.balance -= 2;
                localRoot.getRight().balance += 1;

                //run a rotate right on the right-left (Grand)child
                rotateRight(peekRight);
                /* RESULT:
                 -------------
                 |    a        |
                 |     \       |
                 |      b      |
                 |       \     |
                 |        c    |
                 -------------
                 now rotate left on a
                 */
                // is returned: rotateLeft(localRoot);
                /* RESULT:
                 ---------
                 |    b    |
                 |   / \   |
                 |  a   c  |
                 ---------
                 */

            } else { //no else-if was needed here
                /*    
                 positive on b = right heavy situation
                 -------------
                 |    a      |
                 |     \     |
                 |      b    |
                 |       \   |
                 |        c  |
                 ------------- 
                 */
                //change values as applicable for this situation

                //local root (a) balance - 2, right child's balance -1
                localRoot.balance -= 2;
                peekRight.balance -= 1;

                //run a rotate left on the root.. nvm this is being returned
                /*
                 --------
                 |    b   |
                 |  /  \  |
                 | a    c |
                 -------- 
                 */
            }// this line was unneccesary: else {
            //DO NOTHING? ...there is no third situation...
            //}
            /**
             * After the rotates the overall height will be reduced thus
             * increase is now false, but decrease is now true.
             */
            increase = false;
            decrease = true;

            // Perform double rotation... already did above all cases covered
            // no need to return peekRight;
        }
        /* all of this seems completely unneccessary
         Node peekLeft = localRoot.getLeft();      
         /* In this case both the rightChild (the new root = e)
         and the root (new left child = c) will both be balanced
         after the rotate. Also the overall height will be
         reduced, thus increase will be false, but decrease
         will be true. 
         }
         } else {
         /* After the rotate the rightChild (new root) will
         be left heavy, and the local root (new left child)
         will be right heavy. The overall height of the tree
         will not change, thus increase and decrease remain
         unchanged.           
         }
         */
        return rotateLeft(localRoot);
    }

    private Node rebalanceLeft(Node localRoot) {

        // Obtain reference to left child
        Node peekLeft = localRoot.getLeft();

        // See if right or left heavy 
        if (peekLeft.balance != 0) {
            /* Adjust the balances to be their new values after
             the rotates are performed. 
             */
            if (peekLeft.balance > 0) {
            //positive balance on b = right heavy situation
            /*
                 ----------------  problem Node being inserted = ?
                 |        a     |  a = -2  after--> a = 0
                 |       /      |  b = +/- 1       b = 0
                 |      b       |
                 |     / \      |
                 |    ?   ?     |
                 ----------------
                 */
                //change values here before rotation
                //we have a left then right error
                //local root(a) balance + 2, right child - 1
                localRoot.balance = 0;
                localRoot.getRight().balance = 0;

                //run a rotate left on the left-right (Grand)child
                rotateLeft(peekLeft);
                /* RESULT:
                 -------------
                 |        a   |
                 |       /    |
                 |      b     |
                 |     /      |
                 |    c       |
                 -------------
                 */

            } else {
                /*    
                 positive on b = right heavy situation
                 --------
                 |     a  |
                 |    /   |
                 |   b    |
                 |  /     |
                 | c      |
                 -------- 
                 */
                //change values as applicable for this situation
                //local root (a) balance + 2, left child's balance +1
                localRoot.balance = 0;
                peekLeft.balance = 0;
            }
            increase = false;
            decrease = true;
        }
        return rotateRight(localRoot);
    }

    private void incrementBalance(Node node) {
        node.balance++;
        if (node.balance > Node.BALANCED) {
            /* if now right heavy, the overall height has increased, but
             it has not decreased */
            increase = true;
            decrease = false;
        } else {
            /* if now balanced, the overall height has not increased, but
             it has decreased. */
            increase = false;
            decrease = true;
        }
    }

    private Node rotateRight(Node root) {
        Node a = root;
        Node temp = new Node(a.getItem());
        Node b = a.getLeft();
        //There is where you set up your references to get the proper rotation
        /*   ----------------
         |           a    |
         |         /      |
         |        b       |
         |      /   \     |
         |    c     null  |
         ----------------
         
         temp = copy of a 
         temp takes ownership of b's right child as its left child
         or in this case, null.
         */
        temp.setLeft(b.getRight());

        //b takes ownership of temp as its right child.
        b.setRight(temp);
        /*
         ----------------
         |        b       |
         |      /  \      | 
         |    c     a     |
         |         /      |
         |       null     |
         ----------------
         */
        return b;
    }

    private Node rotateLeft(Node localRoot) {
        Node a = localRoot;
        Node temp = new Node(a.getItem());
        Node b = a.getRight();
        System.out.println("Rotating Right");
        //There is where you set up your references to get the proper rotation
        /*   ----------------
         |    a           |
         |     \          |
         |       b        |
         |      / \       |
         |    null  c     |
         ----------------
         
         temp = copy of a
         temp takes ownership of b's left child as its right child
         or in this case, null.
         */
        temp.setRight(b.getLeft());

        //b takes ownership of temp as its left child.
        b.setLeft(temp);

        /* 
         ----------------
         |       b       |
         |      / \      |
         |     a    c    |
         |      \        |
         |      null     |
         ----------------
         */
        return b;
    }
}
